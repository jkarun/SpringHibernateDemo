package com.demo.site.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.site.DAO.UserDAO;
import com.demo.site.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired 
	UserDAO userDAO;
	
	@Override
	public void saveUser(User user) {
		userDAO.saveUser(user);
	}

	@Override
	public User findById(int id) {
		return userDAO.findById(id);
	}


	@Override
	public void deleteUserById(int id) {
		userDAO.deleteUserById(id);
	}

	@Override
	public List<User> findAllUser() {
		return userDAO.findAllUser();
	}

	@Override
	public void updateUser(User user) {
		userDAO.updateUser(user);
	}


}
