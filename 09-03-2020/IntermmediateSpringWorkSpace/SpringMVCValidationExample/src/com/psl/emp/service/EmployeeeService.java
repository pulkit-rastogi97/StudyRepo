package com.psl.emp.service;

import java.util.ArrayList;

import com.psl.emp.bean.Employee;

public interface EmployeeeService {
	public ArrayList<Employee> getAllEmployees();
	public Employee addEmployee(Employee emp);
	
}
