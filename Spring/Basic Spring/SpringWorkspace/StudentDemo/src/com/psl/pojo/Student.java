package com.psl.pojo;

public class Student {
	int id;
	String name;
	int age;
	
	public Student()
	{
		System.out.println("Inside default");
	}
	
	public Student(int id, String name, int age)
	{
		super();
		System.out.println("Inside Parameterized");
		this.id=id;
		this.age=age;
		this.name=name;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return this.id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Inside Set method for name");
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
