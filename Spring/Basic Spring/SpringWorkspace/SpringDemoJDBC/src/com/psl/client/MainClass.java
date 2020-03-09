package com.psl.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.bean.Employee;
import com.psl.dao.EmployeeDao;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		
		EmployeeDao dao = (EmployeeDao) context.getBean("dao");
		if(dao.insert((Employee)context.getBean("emp1")))
			if(dao.insert((Employee)context.getBean("emp2")))
				if(dao.insert((Employee)context.getBean("emp3")))
					if(dao.insert((Employee)context.getBean("emp4")))
					{
						System.out.println("All inserted");
					}
		
		List<Employee> emp = dao.getAllUsingRowMApper();
		for(Employee emp1 : emp)
		{
			System.out.println(emp1);
		}
		
		 
		
	} 
}
