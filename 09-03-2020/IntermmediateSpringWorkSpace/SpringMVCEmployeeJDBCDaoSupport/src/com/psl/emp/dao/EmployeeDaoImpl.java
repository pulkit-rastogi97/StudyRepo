package com.psl.emp.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.psl.emp.bean.Employee;
import com.psl.emp.bean.EmployeeRowMapper;

public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao{

	static HashMap<Integer, Employee> empMap = new HashMap<Integer, Employee>();
	
	@Override
	public Employee getEmployeeById(int empId) {
		
		String sql = "Select * from employee where empId = "+empId;
		
		return this.getJdbcTemplate().queryForObject(sql, new EmployeeRowMapper());
	}

	@Override
	public HashMap<Integer, Employee> getallEmployees() {
		String sql = "Select * from employee";
		
			List<Employee> empList = this.getJdbcTemplate().query(sql, new EmployeeRowMapper());
		
		for(Employee emp : empList)
		{
			empMap.put(emp.getEmpId(), emp);
		}
		return empMap;
	}

	@Override
	public Employee addEmployee(final Employee emp) {
		String sql = "INSERT INTO Employee VALUES(?,?,?)";
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

	@Override
	public Employee removeEmployee(final int empId) {
		
		final Employee emp = getEmployeeById(empId);
		String sql = "Delete from Employee where empId = ? ";
		if(this.getJdbcTemplate().execute(sql, new PreparedStatementCallback<Employee>() {

			@Override
			public Employee doInPreparedStatement(PreparedStatement pstmt) throws SQLException, DataAccessException {
				pstmt.setInt(1, empId);
				int row = pstmt.executeUpdate();
				if(row==1)
					return emp;
				else
					return null;
			}
		}) == null)
			{
				try {
					throw new SQLException("Not Deleted ");
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			}
			return emp;
	}

}
