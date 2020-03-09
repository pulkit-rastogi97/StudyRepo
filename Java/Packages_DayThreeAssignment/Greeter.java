package com.persistent.app;

public class Greeter {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Greeter(String name)
	{
		this.name = name;
	}
	public String sayHello()
	{
		return "Hello "+this.name+" !!";
	}
	public String sayGoodBye()
	{
		return "Good Bye "+this.name+" !!";
	}
	
}
