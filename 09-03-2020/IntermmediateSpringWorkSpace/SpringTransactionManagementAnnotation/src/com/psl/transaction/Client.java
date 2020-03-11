package com.psl.transaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) 
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		MyInterface ref = (MyInterface)ctx.getBean("cls1");
		ref.method1();
		
		((AbstractApplicationContext)ctx).close();
		//contextRoute - A name
		
	}
}
