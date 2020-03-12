package com.psl.emp.dao;

import java.util.HashMap;

import com.psl.emp.bean.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	static HashMap<Integer, Employee> empMap = new HashMap<Integer, Employee>();
	
	static
	{
		Employee emp1 = new Employee(110,"Nisha",30000);
		Employee emp2 = new Employee(111,"Rohan",40000);
		Employee emp3 = new Employee(112,"Ganesh",50000);
		Employee emp4 = new Employee(113,"Anant",60000);
		Employee emp5 = new Employee(114,"Pulkit",70000);
		
		empMap.put(emp1.getEmpId(), emp1);
		empMap.put(emp2.getEmpId(), emp2);
		empMap.put(emp3.getEmpId(), emp3);
		empMap.put(emp4.getEmpId(), emp4);
		empMap.put(emp5.getEmpId(), emp5);
	}
	
	@Override
	public Employee getEmployeeById(int empId) {
		
		return empMap.get(empId);
	}

	@Override
	public HashMap<Integer, Employee> getallEmployees() {
		
		return empMap;
	}

	@Override
	public Employee addEmployee(Employee emp) {
		empMap.put(emp.getEmpId(), emp);
		return emp;
	}

	@Override
	public Employee removeEmployee(int empId) {
		
		return empMap.remove(empId);
	}

}
