package com.psl.emp.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psl.emp.bean.Employee;
import com.psl.emp.dao.EmployeeDao;

@Service("service")
public class EmployeeServiceImpl implements EmployeeeService{

	@Autowired
	EmployeeDao dao;

	@Override
	public ArrayList<Employee> getAllEmployees() {
		return dao.getAllEmployees();
	}

	@Override
	public Employee addEmployee(Employee emp) {
		return dao.addEmployee(emp);
	}
	
	
	

}
