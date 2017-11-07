package com.demo.site.service;

import java.util.List;

import com.demo.site.model.User;

public interface UserService {
	User findById(int id);

	void deleteUserById(int id);

	List<User> findAllUser();

	void saveUser(User user);

	void updateUser(User user);
}
