package com.psl.emp.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.psl.emp.bean.Employee;
import com.psl.emp.bean.EmployeeRowMapper;

@Repository("dao")
public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao{

	@Autowired
	DataSource dataSource;
	
	@PostConstruct
	public void initialize()
	{
		this.setDataSource(dataSource);
	}
	
	
	@Override
	public ArrayList<Employee> getAllEmployees() {
		String sql = "Select * from employeejava";
		
		return (ArrayList<Employee>) this.getJdbcTemplate().query(sql, new EmployeeRowMapper());
	
	}

	@Override
	public Employee addEmployee(final Employee emp) {
		String sql = "INSERT INTO Employeejava VALUES(?,?,?)";
		if(this.getJdbcTemplate().execute(sql, new PreparedStatementCallback<Employee>() {

			@Override
			public Employee doInPreparedStatement(PreparedStatement pstmt) throws SQLException, DataAccessException {
				pstmt.setInt(1, emp.getEmpId());
				pstmt.setString(2, emp.getEmpName());
				pstmt.setInt(3, emp.getEmpSal());
				
				int row = pstmt.executeUpdate();
				if(row==1)
					return emp;
				else
					return null;
			}
		}) == null)
			{
				try {
					throw new SQLException("Not Inserted ");
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			}
			return emp;
	}

}
