package com.demo.site.DAO;

import java.util.List;

import com.demo.site.model.User;

public interface UserDAO {
	User findById(int id);

	void saveUser(User User);

	void deleteUserById(int id);

	List<User> findAllUser();
	
	void updateUser(User user);

}
