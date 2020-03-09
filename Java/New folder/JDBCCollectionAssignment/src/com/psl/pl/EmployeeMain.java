package com.psl.pl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.psl.bean.Employee;
import com.psl.bean.IdSorter;
import com.psl.bean.NameSorter;
import com.psl.bean.SalarySorter;
import com.psl.dao.EmployeeJDBC;
import com.psl.service.EmpIdSort;
import com.psl.service.EmpNameSort;
import com.psl.service.EmpSalSort;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> emp ;
		try {
			emp = EmployeeJDBC.fetch();
		} catch (ClassNotFoundException | SQLException e) {
			
			System.out.println(e.getMessage());
		}
		int ch;
		do{
		System.out.println("************************");
		System.out.println("What do you want to do ? ");
		System.out.println("1. Sort by Id ");
		System.out.println("2. Sort by Name ");
		System.out.println("3. sort by salary ");
		System.out.println("4. Exit ");
		System.out.println("************************");
		ch = sc.nextInt();
		switch(ch)
		{
		case 1:
			Collections.sort(emp, new EmpIdSort());
			System.out.println(emp);
			break;
		case 2:

			Collections.sort(emp, new EmpNameSort());
			System.out.println(emp);
			break;
		case 3:

			Collections.sort(emp, new EmpSalSort());
			System.out.println(emp);
			break;
		case 4: System.out.println("Exiting !! ");
				ch = 5;
				break;
		
		default: System.out.println("Please enter a valid choice ! ");
		}
		
	}while(ch<=3 && ch>0);
	}

}
