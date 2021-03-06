package com.psl.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.psl.bean.Employee;

public class EmployeeDao extends JdbcDaoSupport implements EmployeeI{

	public List<Employee> fetchEmployee()
	{
		return this.getJdbcTemplate().query("select * from employee", new RowMapper<Employee>(){

			@Override
			public Employee mapRow(ResultSet rs, int rows) throws SQLException 
			{
				Employee emp = new Employee();
				emp.setEmpId(rs.getInt(1));
				emp.setEmpName(rs.getString(2));
				emp.setEmpSal(rs.getInt(3));
				emp.setDesignation(rs.getString(5));
				return emp;
			}
			
		});	
	}
	
	public boolean insertEmployee(final Employee emp)
	{
		String sql = "INSERT INTO Employee(empName, empSal, designation) VALUES(?,?,?)";
		return this.getJdbcTemplate().execute(sql,new PreparedStatementCallback<Boolean>()
		{
			@Override
			public Boolean doInPreparedStatement(PreparedStatement pstmt) throws SQLException, DataAccessException {
				pstmt.setString(1, emp.getEmpName());
				pstmt.setInt(2, emp.getEmpSal());
				pstmt.setString(3, emp.getDesignation());
				
				int row = pstmt.executeUpdate();
				if(row==1)
					return true;
				else
					return false;
			}
			
		});
	}
	
}
