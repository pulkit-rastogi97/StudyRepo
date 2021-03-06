package com.psl.service;

import java.util.ArrayList;

import com.psl.bean.Employee;
import com.psl.exception.EmployeeException;

public interface EmployeeServiceI {
	public ArrayList<Employee> getAllEmployees() throws EmployeeException;
	public Employee getEmployeeById(int empId)throws EmployeeException;
	public Employee updateEmployee(int empId,int empSal)throws EmployeeException;
	public Employee deleteEmployee(int empId)throws EmployeeException;
	public int insertEmployee(Employee emp)throws EmployeeException;
	//public void display(Employee emp);
}
