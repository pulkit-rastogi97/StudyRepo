package com.psl.pojo;

public class HelloWorld {

	public String sayHello() {
		return "Hello World";
	}

	public void init() {
		System.out.println("call to init");
	}

	public void destroy() {
		System.out.println("call to destroy");
	}
	
	public HelloWorld()
	{
		System.out.println("Call to constructor");
	}
}
