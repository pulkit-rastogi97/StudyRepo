package com.psl.emp;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.psl.emp.bean.Employee;
import com.psl.emp.service.EmployeeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeeService service;
	
	@RequestMapping("index")
	public String goToHomePage()
	{	
		return "home";
		
	}
	
	@RequestMapping("addEmployee")
	public String goToAddEmployee(Model model)
	{
		Employee emp = new Employee();
		
		model.addAttribute("newEmp", emp);
		return "addEmp";
	}
	
	@RequestMapping("addEmp")
	public String addEmp(@ModelAttribute("newEmp") @Valid Employee emp, BindingResult result,Model model){
		if(result.hasErrors())
		{
			return "addEmp";
		}
		emp = service.addEmployee(emp);
		model.addAttribute("addedEmp",emp);
		return "addEmp";
		
	}
	
	@RequestMapping("showAllEmps")
	public String showAllEmployees(Model model)
	{
		ArrayList<Employee> empList = service.getAllEmployees();
		model.addAttribute("emplist",empList);
		return "showAllEmp";
	}
}
