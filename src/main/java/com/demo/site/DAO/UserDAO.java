package com.demo.site.DAO;

import java.util.List;

import com.demo.site.model.User;

public interface UserDAO<E> {
	List<User> getListOfUser();
	void saveUser(User user);
}
