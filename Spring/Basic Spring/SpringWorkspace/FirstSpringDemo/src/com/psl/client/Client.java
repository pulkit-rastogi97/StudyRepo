package com.psl.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.pojo.Address;
import com.psl.pojo.Person;

public class Client {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		 * BeanFactory factory = 
		 * new XmlBeanFactory
		 * (new ClassPathResource("config.xml"));
		 */

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		Person person = (Person) context.getBean("person");
		
//		System.out.println(context.getBean(""));

		System.out.println("Name : " + person.getName()+" Address city = "+person.getAddress().getCity()+" Age = "+person.getAge());
		System.out.println("Pincode = "+person.getAddress().getPincode());

//		Address address = (Address) context.getBean("address");
//
//		System.out.println("City : " + address.getCity() + " and pincode = "
//				+ address.getPincode());

	}
}
