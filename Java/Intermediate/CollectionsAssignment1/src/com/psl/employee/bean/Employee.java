package com.psl.employee.bean;

import java.time.LocalDate;

public class Employee {

	private int empId;
	private String empName;
	private LocalDate joiningDate;
	
	
	public Employee(int empId, String empName, LocalDate joiningDate) {
		this.empId = empId;
		this.empName = empName;
		this.joiningDate = joiningDate;
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


	public LocalDate getJoiningDate() {
		return joiningDate;
	}


	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", joiningDate=" + joiningDate + "]";
	}


	public Employee() {
		// TODO Auto-generated constructor stub
	}

}
