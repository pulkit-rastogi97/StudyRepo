package com.psl.tx.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.psl.tx.bean.StudentMarks;
import com.psl.tx.bean.StudentMarksMapper;

public class StudentJDBCTemplate implements StudentDao
{
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	private PlatformTransactionManager transactionManager;
	
	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject= new JdbcTemplate(dataSource);
		
	}

	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}

	@Override
	public List<StudentMarks> listStudents() {
		
		String SQL = "SELECT * FROM student, marks where student.stuid=marks.sid";
		List<StudentMarks> studentMarks = jdbcTemplateObject.query(SQL, new StudentMarksMapper());
		
		return studentMarks;
	}

	@Override
	public void create(String name, Integer age, Integer marks, Integer year) 
	{
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);
		
		try
		{
			String SQL1 = "INSERT INTO student(stuName, age) values(?,?)";
			jdbcTemplateObject.update(SQL1, name, age);
			
			String SQL2 = "SELECT MAX(stuId) from student";
			int SID = jdbcTemplateObject.queryForInt(SQL2);
			
			String SQL3 = "INSERT INTO marks(sid, marks, year) values (?,?,?)";
			jdbcTemplateObject.update(SQL3, SID, marks, year);
			
			System.out.println("Created Name = "+name+" , Age = "+age);
			transactionManager.commit(status);
		}
		catch(DataAccessException e)
		{
			System.out.println("Error in creating record, rolling back ..... ");
			transactionManager.rollback(status);
			throw e;
		}
		return;
	}

	

}
