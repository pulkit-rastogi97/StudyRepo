package com.psl.emp.service;

import java.util.HashMap;

import com.psl.emp.bean.Employee;

public interface EmployeeeService {
	public Employee getEmployeeById(int empId);
	public HashMap<Integer,Employee> getallEmployees();
	public Employee addEmployee(Employee emp);
	public Employee removeEmployee(int empId);
	
}
