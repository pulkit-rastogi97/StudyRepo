package com.psl.pl;

import com.psl.dao.EmployeeDao;
import com.psl.dao.EmployeeDaoI;
import com.psl.dto.Employee;

public class MainClass {
public static void main(String[] args) {
	EmployeeDaoI dao = new EmployeeDao();
	Employee emp = dao.getEmployeeById(2);
	System.out.println(emp);
}
}
