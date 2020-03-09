package com.psl.pl;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.bean.Employee;
import com.psl.dao.EmployeeI;

public class Client {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		final ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		final EmployeeI dao = (EmployeeI) context.getBean("dao");
		
//		List<Employee> empList = dao.fetchEmployee();
//		
//		for(Employee emp: empList)
//		{
//			System.out.println(emp);
//		}		
		final Employee emp = (Employee)context.getBean("emp");
		
		boolean isInserted = dao.insertEmployee(emp);
		System.out.println("Is employee inserted "+isInserted);
	}
}
