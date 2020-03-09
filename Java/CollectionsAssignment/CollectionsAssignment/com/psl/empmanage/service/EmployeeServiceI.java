package com.psl.empmanage.service;

import java.time.LocalDate;
import java.util.TreeSet;

import com.psl.empmanage.bean.Employee;

public interface EmployeeServiceI {
	
	void Display(TreeSet<Employee> emp);
	void joinedBefore(TreeSet<Employee> emp, LocalDate date);
	void completedSix(TreeSet<Employee> emp);
	void recentlyJoined(TreeSet<Employee> emp);
}
