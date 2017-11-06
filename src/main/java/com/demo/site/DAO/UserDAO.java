package com.demo.site.DAO;

import java.util.List;

import com.demo.site.model.User;

public interface UserDAO<E> {
	User findById(int id);

	void saveUser(User User);

	void deleteUserBySsn(int id);

	List<User> findAllUser();

}
