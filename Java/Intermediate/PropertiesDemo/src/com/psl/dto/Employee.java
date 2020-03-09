package com.psl.dto;

import java.time.LocalDate;

public class Employee {
	private int empId;
	private String empName;
	private int empSal;
	private LocalDate date;
	
	public Employee()
	{
		
	}

	public Employee(int empId, String empName, int empSal, LocalDate date) {
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.date = date;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", empSal=" + empSal + ", date=" + date + "]";
	}
	
	

}
