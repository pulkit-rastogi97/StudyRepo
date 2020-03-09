package com.psl.pojo;

public class Person 
{
	String name;
	Address address;
	int age;
	
	public Person()
	{
		System.out.println("default const");
		name = "xyz";
	}

	public Person(String name, Address address, int age) {
		super();
		System.out.println("paramertized ");
		this.name = name;
		this.address=address;
		this.age=age;
	}


	public void setName(String name)
	{
		System.out.println(name+" set method");
		this.name=name;
	}
	
	public String getName()
	{
		return this.name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
