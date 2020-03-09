package com.psl.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {

	String name;
	
	@Autowired
	@Qualifier("addr1")
	Address address;
	
	public Person()
	{
		System.out.println("in default of person");
		name="zyz";
		
	}
	public Person(Address address1)
	{
		System.out.println("in person of parameter address");
		this.address= address1;
	}
	public Person(String name, Address address) {
		super();
		System.out.println("in parameterized of person");
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		System.out.println("set name person");
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("set address person");
		this.address = address;
	}
	
	
}
