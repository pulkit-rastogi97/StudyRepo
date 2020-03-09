package com.psl.pl;

import java.util.Scanner;

import com.psl.bean.Employee;
import com.psl.exception.EmployeeException;
import com.psl.service.EmployeeService;
import com.psl.service.EmployeeServiceI;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeServiceI service = new EmployeeService();
//		int empId;
//		String empName;
//		int empSal;
		Employee emp = new Employee();
		System.out.println("*****************************************");
		System.out.println(" What would you like to do ? ");
		System.out.println("1. Insert employee details ");
		System.out.println("2. Delete Employee details  ");
		System.out.println("3. Update Employee Details ");
		System.out.println("4. Search Employee Details ");
		System.out.println("*****************************************");
		int ch = new Scanner(System.in).nextInt();
	try{
		switch(ch)
		{
		
		case 1: System.out.println("Enter the employee name :: ");
				emp.setEmpName(new Scanner(System.in).next());
				System.out.println("Enter the employee salary :: ");
				emp.setEmpSal(new Scanner(System.in).nextInt());
				emp.setEmpId(service.insertEmployee(emp));
				System.out.println("Inserted Successfully and id  = "+emp.getEmpId());					
				break;
		case 2: System.out.println("Enter the employee id :: ");
				emp.setEmpId(new Scanner(System.in).nextInt());
				System.out.println("Deleted Employee :: "+service.deleteEmployee(emp.getEmpId()));
				break;
		case 3: System.out.println("Enter the employee id :: ");
				emp.setEmpId(new Scanner(System.in).nextInt());
				System.out.println("Enter the employee salary :: ");
				emp.setEmpSal(new Scanner(System.in).nextInt());
				System.out.println("Updated Details :: "+service.updateEmployee(emp.getEmpId(), emp.getEmpSal()));
				break;
		case 4: System.out.println("");
				break;
		default:System.out.println("Invalid Choice !! ");
		
		}
		}catch(EmployeeException e)
		{
			System.out.println(e.getMessage());
		}
			
	}

}
