package com.demo.site.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.site.model.User;

@Repository
public class UserDAOImpl implements UserDAO{

	@Autowired 
	SessionFactory sessionFactory;
	
	@Override
	public void saveUser(User user) {
		try {
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			session.persist(user);
			session.getTransaction().commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<User> getListOfUser() {
		List<User> users = new ArrayList<User>();
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return users;
	}

}
