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
	
	@RequestMapping("/")
	public String homePage() {
		User user = new User();
		user.setName("arun");
		user.setSalary("10000");
		user.setSsn("123456789");
		userService.saveUser(user);
		return "index";
	}
	
}
