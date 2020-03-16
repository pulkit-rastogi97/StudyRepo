package com.psl.emp.dao;

import java.util.ArrayList;

import com.psl.emp.bean.Employee;

public interface EmployeeDao {

	public ArrayList<Employee> getAllEmployees();
	public Employee addEmployee(Employee emp);
	
	
}
