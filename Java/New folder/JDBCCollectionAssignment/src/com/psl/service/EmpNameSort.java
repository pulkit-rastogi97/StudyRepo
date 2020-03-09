package com.psl.service;

import java.util.Comparator;

import com.psl.bean.Employee;

public class EmpNameSort implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
