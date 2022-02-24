package com.fdmgroup.mvcexample2.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fdmgroup.mvcexample2.model.Employee;
import com.fdmgroup.mvcexample2.service.EmployeeService;


@Controller
public class EmployeeContoller {
    @Autowired
    private EmployeeService empService;
    
    

	public EmployeeContoller() {
		super();
//	  Employee e1=new Employee("Praneeth","5000","developer");
//		Employee e2=new Employee("Rohit","5500","devops");
//		Employee e3=new Employee("chalumuri","4500","java");
//		empService.addEmployee(e1);
//		empService.addEmployee(e2);
//		empService.addEmployee(e3);
	}

	@GetMapping("/employees")
	public String showEmployees(Model model) {
		model.addAttribute("ListOfemployees", empService.getAllEmployees());
		model.addAttribute("employee", new Employee());//this part here.....
		return "emphome";
	}
	
	@GetMapping("/addedEmployee")
	public String addEmployeeTo(Employee employee1) {
		
		System.out.println("------------");
		empService.addEmployee(employee1);
		return "/employeeAdded";
	}
	

}
