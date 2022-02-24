package com.fdmgroup.mvcexample2.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fdmgroup.mvcexample2.service.AuthenticationService;

@Controller
public class LoginController{
	
	AuthenticationService authService;
    
	@Autowired
	public LoginController(AuthenticationService authService) {
		super();
		this.authService = authService;
	}
	
	@GetMapping("/login1")
	public String loginPagedisplay() {
		return "login1";
	}
  
	
	@PostMapping("/login")
	public String validateAuthService(@RequestParam String username,
			@RequestParam String password,
			HttpSession session) {
		if(authService.isValid(username, password)) {
			session.setAttribute("username", username);
			session.setAttribute("password", password);
			return "home";
		}

		else {
			return "login";
		}
		
	}
	
	@GetMapping("/logout")
	public String logOut(HttpSession session) {
		session.invalidate();
		return "login1";
	}
	
}
