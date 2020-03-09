package com.psl.bean;

import java.util.*;

public class SalarySorter implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmpSal()-o2.getEmpSal();
	}

}
