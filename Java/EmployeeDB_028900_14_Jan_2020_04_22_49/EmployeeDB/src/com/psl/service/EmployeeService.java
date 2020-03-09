package com.psl.service;

import java.util.ArrayList;

import com.psl.bean.Employee;
import com.psl.dao.EmployeeDao;
import com.psl.dao.EmployeeDaoI;
import com.psl.exception.EmployeeException;

public class EmployeeService implements EmployeeServiceI{

	EmployeeDaoI dao;
	
	public EmployeeService()
	{
		dao = new EmployeeDao();
	}
	public ArrayList<Employee> getAllEmployees() throws EmployeeException
	{
		return dao.getAllEmployees();
	}
	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException{
		// TODO Auto-generated method stub
		return dao.getEmployeeById(empId);
	}
	@Override
	public Employee updateEmployee(int empId, int empSal) throws EmployeeException{
		// TODO Auto-generated method stub
		return dao.updateEmployee(empId, empSal);
	}
	@Override
	public Employee deleteEmployee(int empId) throws EmployeeException{
		// TODO Auto-generated method stub
		return dao.deleteEmployee(empId);
	}
	@Override
	public int insertEmployee(Employee emp) throws EmployeeException{
		// TODO Auto-generated method stub
		return dao.insertEmployee(emp);
	}
}
