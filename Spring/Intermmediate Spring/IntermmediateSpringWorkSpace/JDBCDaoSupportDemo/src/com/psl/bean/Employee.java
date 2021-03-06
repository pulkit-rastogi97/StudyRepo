package com.psl.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean{

	private int empId;
	private String empName;
	private int empSal;
	private String designation;
	
	public Employee()
	{
		System.out.println("Default constructor");
	}

	public Employee(int empId, String empName, int empSal, String designation) {
		super();
		System.out.println("Parameterized constructor");

		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.designation = designation;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		System.out.println("set id");
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		System.out.println("set name");
		this.empName = empName;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		System.out.println("set salary");
		this.empSal = empSal;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		System.out.println("set designation");
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", empSal=" + empSal + ", designation=" + designation + "]";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy method");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("After Properties method");
		
	}

	
}
