package com.psl.empManage.pl;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.TreeSet;

import com.psl.empManage.bean.Employee;
import com.psl.empManage.service.EmployeeService;
import com.psl.empManage.service.EmployeeServiceI;

public class EmployeeMain {

	public static void main(String[] args) {
		
		int ch = 0;
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse("12/12/1997",formatter);
		Employee emp1 = new Employee(101,"Pulkit",date);
		date = LocalDate.parse("23/11/2019",formatter);
		Employee emp2 = new Employee(102,"Priya",date);
		date = LocalDate.parse("19/01/1987",formatter);
		Employee emp3 = new Employee(103,"Neha",date);
		date = LocalDate.parse("12/12/2005",formatter);
		Employee emp4 = new Employee(104,"Madhavi",date);
		date = LocalDate.parse("01/10/1697",formatter);
		Employee emp5 = new Employee(105,"Annu",date);
		date = LocalDate.parse("12/12/2008",formatter);
		Employee emp6 = new Employee(106,"Apurva",date);
		date = LocalDate.parse("22/12/2007",formatter);
		Employee emp7 = new Employee(107,"Heena",date);
		date = LocalDate.parse("01/01/2020",formatter);
		Employee emp8 = new Employee(108,"Sraboni",date);
		date = LocalDate.parse("22/12/2013",formatter);
		Employee emp9 = new Employee(110,"Kalpana",date);
		date = LocalDate.parse("30/05/2001",formatter);
		Employee emp10 = new Employee(111,"Bhumi",date);
		date = LocalDate.parse("19/06/2019",formatter);
		Employee emp11= new Employee(109,"Sangeeta",date);
		date = LocalDate.parse("19/07/2019",formatter);
		Employee emp12 = new Employee(113,"Rahul",date);
		date = LocalDate.parse("01/12/2006",formatter);
		Employee emp13 = new Employee(112,"Ram",date);
		
		
		TreeSet<Employee> emp = new TreeSet<Employee>();
		
		emp.add(emp13);
		emp.add(emp12);
		emp.add(emp11);
		emp.add(emp10);
		emp.add(emp9);
		emp.add(emp8);
		emp.add(emp7);
		emp.add(emp6);
		emp.add(emp5);
		emp.add(emp4);
		emp.add(emp3);
		emp.add(emp2);
		emp.add(emp1);
	
		
		
		EmployeeServiceI empService = new EmployeeService();
		do {
		System.out.println("What you want to do ? ");
		System.out.println("1. Display All employee information ");
		System.out.println("2. Display all employees who have joined organization before entered date");
		System.out.println("3. Display all employees who have completed six month in organization. ");
		System.out.println("4. Display employee as per joining date (recently joined employees at the Top).");
		System.out.println("5. Exit ");
		ch = sc.nextInt();
		switch(ch)
		{
		case 1: empService.Display(emp);
				break;
		case 2: System.out.println("Enter a date (dd/MM/yyyy) :: ");
				String empDate = sc.next();
				try {
				LocalDate joiningDate = LocalDate.parse(empDate, formatter);
				empService.joinedBefore(emp, joiningDate);
				}catch(DateTimeException e)
				{
					System.out.println(e.getMessage());
				}				
				break;
		case 3: empService.completedSix(emp);
				break;
		case 4: empService.recentlyJoined(emp);
				break;
		case 5: ch = 6;
				break;
		default:System.out.println("Invalid Choice !!");
		}
		
	}while(ch>0 && ch<=5);
		
		sc.close();
	}
}
