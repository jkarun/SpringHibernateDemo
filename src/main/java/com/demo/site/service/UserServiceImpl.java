package com.demo.site.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.site.DAO.UserDAO;
import com.demo.site.model.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired 
	UserDAO userDAO;
	
	@Override
	@Transactional
	public void saveUser(User user) {
		userDAO.saveUser(user);
	}

	@Override
	public List<User> getListOfUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
