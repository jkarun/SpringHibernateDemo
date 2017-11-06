package com.demo.site.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.site.model.User;
import com.demo.site.service.UserService;

@Controller
public class HomeController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value= {"/","/list"})
	public String homePage() {
		
		
		return "index";
	}
	
}
