package com.psl.empManage.bean;

import java.time.temporal.ChronoUnit;
import java.util.Comparator;

public class JoiningDateSorter implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {		
		return (int)ChronoUnit.DAYS.between(o1.getJoinDate(), o2.getJoinDate());
	}
}
