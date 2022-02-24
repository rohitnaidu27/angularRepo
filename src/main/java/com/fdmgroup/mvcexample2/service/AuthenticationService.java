package com.fdmgroup.mvcexample2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fdmgroup.mvcexample2.model.User;



@Service
public class AuthenticationService {
	
	private List<User> users;
  
	@Autowired
	public AuthenticationService() {
		super();
		users = new ArrayList<>();
		users.add( new User("Praneeth","password"));
		users.add( new User("Reddy","password1"));
		users.add( new User("rohit","password"));
	}
	
	public boolean isValid(String username,String passowrd) {
		
		User user= new User(username,passowrd);
		
		if(users.contains(user)) {
			return true;
		}
		
		else {
			return false;
		}
		
	}

}
