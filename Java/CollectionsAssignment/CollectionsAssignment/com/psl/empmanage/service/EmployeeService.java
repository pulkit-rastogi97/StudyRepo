package com.psl.empmanage.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import com.psl.empmanage.bean.Employee;
import com.psl.empmanage.bean.JoiningDateSorter;

public class EmployeeService implements EmployeeServiceI{

	
	@Override
	public void Display(TreeSet<Employee> emp) {
		for(Employee emp1 : emp)
		{
			System.out.println(emp1);
		}
		
	}

	@Override
	public void joinedBefore(TreeSet<Employee> emp,LocalDate date) {
		for(Employee emp1 : emp)
		{
			if(emp1.getJoinDate().isBefore(date))
			{
				System.out.println(emp1);
			}
		}
	}

	@Override
	public void completedSix(TreeSet<Employee> emp) {
		LocalDate date = LocalDate.now().minusMonths(6);
		for(Employee emp1: emp)
		{
			if(emp1.getJoinDate().isEqual(date) || emp1.getJoinDate().isBefore(date))
			{
				System.out.println(emp1);
			}
		}
		
	}

	@Override
	public void recentlyJoined(TreeSet<Employee> emp) {
		//Collections.sort(emp,new JoiningDateSorter());
		
		List<Employee> emp1 = new ArrayList<>() ;
		for(Employee emp2 : emp)
		{
			emp1.add(emp2);
		}
		Collections.sort(emp1, new JoiningDateSorter());
		
		for(Employee emp3 : emp1)
		{
			System.out.println(emp3);
		}
		
		
	}


}
