package com.psl.service;

import java.util.*;
import com.psl.bean.Employee;

public class EmpIdSort implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		return o1.getId()-o2.getId();
	}

}
