package com.psl.Question3.dto;

import com.psl.Question3.exception.StudentException;

public class Student {

	private String name;
	private int percentage;
	
	final int fees = 10_000;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	public Student() {
	
	}
	
	public int getDiscount(int percentage) throws StudentException
	{
		if(percentage<=0 || percentage>100)
			throw new StudentException("Percentage is not valid. It should be in the range of 1-100");
		int discount = 0;	
		if(percentage<=100 && percentage >=90)
			discount = 50;
		else if(percentage>=80 && percentage<=89)
			discount = 30;
		else if(percentage>=70 && percentage<=79)
			discount = 20;
		else if(percentage<70)
			discount = 10;
			
		return discount;
		
	}
	public int getTotalFees(Student stu) throws StudentException
	{
		int discount=stu.getDiscount(stu.getPercentage());
		int totalFees = fees-((fees*discount)/100);
		return totalFees;
	}
	
}
