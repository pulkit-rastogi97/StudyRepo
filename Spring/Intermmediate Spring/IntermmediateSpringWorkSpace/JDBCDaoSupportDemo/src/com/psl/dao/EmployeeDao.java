package com.psl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.psl.bean.Employee;

public class EmployeeDao extends JdbcDaoSupport{

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
}
