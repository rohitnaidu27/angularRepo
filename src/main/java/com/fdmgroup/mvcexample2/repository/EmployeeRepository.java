package com.fdmgroup.mvcexample2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fdmgroup.mvcexample2.model.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{

	
	
}
