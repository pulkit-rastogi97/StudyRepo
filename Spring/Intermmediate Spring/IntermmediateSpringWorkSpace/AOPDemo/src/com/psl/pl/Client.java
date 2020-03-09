package com.psl.pl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.aop.IBank;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
		
		IBank impl = (IBank) context.getBean("bank");
		
		System.out.println(impl.getBalance(101));
	
//		impl.transfer(101, 201, 301);
		
		
		((AbstractApplicationContext) context).close();
	}
}
