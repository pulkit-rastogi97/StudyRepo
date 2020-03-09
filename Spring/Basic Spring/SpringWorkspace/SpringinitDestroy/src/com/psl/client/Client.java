package com.psl.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.pojo.HelloWorld;
import com.psl.pojo.Person;

public class Client 
{
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		HelloWorld bean = (HelloWorld)context.getBean("helloworld");
		System.out.println(bean.sayHello());
		
		Person person = (Person)context.getBean("person");
		person.setName("hello");
		System.out.println("Hashcode first = "+person.hashCode());
		
		System.out.println("name = "+person.getName());
//		System.out.println("address = "+person.getHomeAddress().getCity()+" and pincode is = "+person.getHomeAddress().getPincode());
//		System.out.println("office address = "+person.getHomeAddress().getCity()+" and office pincode is = "+person.getHomeAddress().getPincode());
		
		Person ref1 = (Person) context.getBean("person");
		System.out.println("Hashcode second = "+(ref1.hashCode()==person.hashCode()) +" is new name = "+ref1.getName());
		
		
	}

}
