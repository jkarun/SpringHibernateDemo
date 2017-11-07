package com.demo.site.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demo.site.model.User;
import com.demo.site.service.UserService;

@Controller
public class HomeController {

	@Autowired
	UserService userService;

	@RequestMapping(value = { "/", "/list" })
	public String homePage(ModelMap model) {
		List<User> users = userService.findAllUser();
		model.addAttribute("listOfUsers", users);
		return "index";
	}

	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public String registerPage(ModelMap model) {
		User user = new User();
		model.addAttribute("user", user);
		model.addAttribute("edit", false);
		return "register";
	}

	@RequestMapping(value = "/new", method = RequestMethod.POST)
	public String userRegister(User user, ModelMap model) {
		if (user != null)
			userService.saveUser(user);
		return "redirect:/list";
	}

	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.GET)
	public String editUsers(@PathVariable int id, ModelMap model) {
		User user = userService.findById(id);
		model.addAttribute("user", user);
		model.addAttribute("edit", true);
		return "register";
	}

	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.POST)
	public String editUser(User user, ModelMap model) {
		if (user != null)
			userService.updateUser(user);
		return "redirect:/";
	}
	
	@RequestMapping(value = "/delete-{id}", method = RequestMethod.GET)
	public String deleteUser(@PathVariable int id, ModelMap model) {
		userService.deleteUserById(id);
		return "redirect:/list";
	}

}
