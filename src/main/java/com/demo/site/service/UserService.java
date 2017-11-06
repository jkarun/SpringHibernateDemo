package com.demo.site.service;

import java.util.List;

import com.demo.site.model.User;

public interface UserService {
	List<User> getListOfUser();
	void saveUser(User user);
}
