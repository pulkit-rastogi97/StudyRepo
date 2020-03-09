package com.psl.dao;

import java.util.List;

import com.psl.bean.Employee;

public interface EmployeeI {
	public List<Employee> fetchEmployee();
	public boolean insertEmployee(final Employee emp);
}
