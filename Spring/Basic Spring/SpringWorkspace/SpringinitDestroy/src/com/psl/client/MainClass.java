package com.psl.client;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.pojo.Address;
import com.psl.pojo.Person;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("connect.xml");
		Person person = (Person)context.getBean("person");
//		for(Address address: person.getAddress())
//		{
//			System.out.println(address.getCity()+" "+address.getPincode());
//		}
		
		for(Map.Entry<String, Address> entry : person.getMap().entrySet())
		{
			System.out.println("ID = "+entry.getKey()+" Address = "+entry.getValue().getCity()+" Pincode = "+entry.getValue().getPincode());
		}
	}
}
