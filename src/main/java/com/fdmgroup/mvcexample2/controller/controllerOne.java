package com.fdmgroup.mvcexample2.controller;


import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class controllerOne {
	
	@GetMapping
	public String helloworldPage() {
		return "index";
	}
	
	@GetMapping(value="/toGoogle")
	public String askGoogle(@RequestParam (value = "query") String put ){
		return "redirect:https://www.google.com/search?q=" + put;
	}
	
	@GetMapping("/user/{userId}")
	public String getUserId(@PathVariable String userId) {

		System.out.println("i am printing the " + userId);
		
		return "new";

	}
	
	@GetMapping("/home")
	public String inhomePage(HttpSession session) {
		if (session.isNew()) {
			return "login";
		} else
			return "home";
	}
}
