package com.psl.pl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.psl.bean.Employee;
import com.psl.dao.EmployeeJDBC;

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
		System.out.println("1. Search ");
		System.out.println("2. Sort ");
		System.out.println("************************");
		ch = sc.nextInt();
		
	}while(ch==3);
	}

}
