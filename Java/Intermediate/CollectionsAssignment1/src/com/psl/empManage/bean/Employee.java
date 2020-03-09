package com.psl.empManage.bean;

import java.time.LocalDate;

public class Employee implements Comparable<Employee> 
{

	private int empId;
	private String empName;
	private LocalDate joinDate;
	
	
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


	public LocalDate getJoinDate() {
		return joinDate;
	}


	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}

	
	public Employee(int empId, String empName, LocalDate joinDate) {
		this.empId = empId;
		this.empName = empName;
		this.joinDate = joinDate;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", joinDate=" + joinDate + "]";
	}

	@Override
	public int compareTo(Employee emp) {
		
		return this.empId-emp.empId;
	}
	


	

}
