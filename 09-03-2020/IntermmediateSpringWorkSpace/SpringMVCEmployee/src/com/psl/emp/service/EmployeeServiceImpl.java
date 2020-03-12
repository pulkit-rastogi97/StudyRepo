package com.psl.emp.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;

import com.psl.emp.bean.Employee;
import com.psl.emp.dao.EmployeeDao;

public class EmployeeServiceImpl implements EmployeeeService{

	@Autowired
	EmployeeDao dao;
	
	
	@Override
	public Employee getEmployeeById(int empId) {
		// TODO Auto-generated method stub
		return dao.getEmployeeById(empId);
	}

	@Override
	public HashMap<Integer, Employee> getallEmployees() {
		// TODO Auto-generated method stub
		return dao.getallEmployees();
	}

	@Override
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return dao.addEmployee(emp);
	}

	@Override
	public Employee removeEmployee(int empId) {
		// TODO Auto-generated method stub
		return dao.removeEmployee(empId);
	}

}
