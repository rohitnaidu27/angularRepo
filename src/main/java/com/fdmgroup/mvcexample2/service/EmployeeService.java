package com.fdmgroup.mvcexample2.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fdmgroup.mvcexample2.model.Employee;
import com.fdmgroup.mvcexample2.repository.EmployeeRepository;

@Service
public class EmployeeService   {

	@Autowired
    private EmployeeRepository empRepo;
	
//	public EmployeeService() {
//		super();
//	  emplList = new ArrayList<>();
//	  emplList.add(new Employee("rohit","5000","developer"));
//	  emplList.add(new Employee("naidu","5500","devops"));
//	  emplList.add(new Employee("chalumuri","4500","java"));
//	}
	
	public List<Employee> getAllEmployees(){
		List<Employee>	emplList= new ArrayList<>();
		empRepo.findAll().forEach(e -> emplList.add(e));
		return emplList;
		
	}
	public void addEmployee(Employee employee){
		empRepo.save(employee);
	}
	
	
}
