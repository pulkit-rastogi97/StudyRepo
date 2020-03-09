package com.psl.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.psl.bean.Employee;

public class EmployeeDao {

	JdbcTemplate jdbcTemplate;
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public EmployeeDao()
	{
		
	}
	/*public boolean insert(Employee bean)
	{
		String sql ="insert into employee values(default,?,?)";
		
		try
		{
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bean.getEmpName());
			pstmt.setInt(2, bean.getEmpSal());
			
			int row = pstmt.executeUpdate();
			if(row>0)
				return true;
			else
				return false;
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return false;
	}
	public ArrayList<Employee> getAllEmployees()
	{
		ArrayList<Employee> list = new ArrayList<Employee>();
		String sql = "Select * from employee";
		try
		{
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				Employee emp = new Employee();
				emp.setEmpId(rs.getInt(1));
				emp.setEmpName(rs.getString(2));
				emp.setEmpSal(rs.getInt(3));
				
				list.add(emp);
			}
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return list;
	}*/
	
	public boolean insert(final Employee obj)
	{
		String sql="insert into employee(empName,empSal) values(?,?)";
		return jdbcTemplate.execute(sql, new PreparedStatementCallback<Boolean>()
		{

			@Override
			public Boolean doInPreparedStatement(PreparedStatement pstmt) throws SQLException, DataAccessException 
			{
				pstmt.setString(1, obj.getEmpName());
				pstmt.setInt(2,  obj.getEmpSal());
				int row = pstmt.executeUpdate();
				if(row>0)
					return true;
				else
					return false;
			}
			
		});
	}
	
	public int updateEmployee(Employee bean)
	{
		return jdbcTemplate.update("update employee set empsal=? where empid=? ", new Object[]{bean.getEmpSal(),bean.getEmpId()});
	}
	
//	public int deleteEmployee(Employee bean)
//	{
//		return jdbcTemplate.
//	}
	
	
	
	public List<Employee> getAllEmployees()
	{
		return jdbcTemplate.query("select * from employee", new ResultSetExtractor<List<Employee>>()
		{
			@Override
			public List<Employee> extractData(ResultSet rs)throws SQLException, DataAccessException 
			{
				List<Employee> list = new ArrayList<Employee>();
				while(rs.next())
				{
					Employee emp= new Employee();
					emp.setEmpId(rs.getInt(1));
					emp.setEmpName(rs.getString(2));
					emp.setEmpSal(rs.getInt(3));
					list.add(emp);
				}
				return list;
			}
			
		});
	}
	
	public List<Employee> getAllUsingRowMApper()
	{
		return jdbcTemplate.query("select * from employee", new RowMapper<Employee>()
		{
			@Override
			public Employee mapRow(ResultSet rs, int noOfRows)throws SQLException 
			{
				Employee emp = new Employee();
				emp.setEmpId(rs.getInt(1));
				emp.setEmpName(rs.getString(2));
				emp.setEmpSal(rs.getInt(3));
				return emp;
			}
			
		});
	}
}
