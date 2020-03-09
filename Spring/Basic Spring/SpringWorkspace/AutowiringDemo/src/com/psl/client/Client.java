package com.psl.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.pojo.Person;

public class Client {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("configure.xml");
		
		Person person = (Person) context.getBean("person");
		
		System.out.println("Name = "+person.getName()+" City= "+person.getAddress().getCity()+" Pincode = "+person.getAddress().getPincode());

	}

}
