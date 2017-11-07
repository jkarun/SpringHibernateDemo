package com.demo.site.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.site.model.User;

@Repository
public class UserDAOImpl implements UserDAO{

	@Autowired 
	SessionFactory sessionFactory;
	
	private Session getSession() {
		return sessionFactory.openSession();
	}
	
	@Override
	public void saveUser(User user) {
		try {
			Session session = this.getSession();
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public User findById(int id) {
		User user = null;
		try {
			user = (User) getSession().get(User.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return user;
	}

	@Override
	public void deleteUserById(int id) {
		Query query = getSession().createQuery("delete from User where id= :id");
		query.setInteger("id", id);
		query.executeUpdate();
	}

	@Override
	public List<User> findAllUser() {
		Query q = getSession().createQuery("from User");
		List<User> users = q.list();
		return users;
	}

	@Override
	public void updateUser(User user) {
		User update = this.findById(user.getId());
		if(update != null) {
			update.setName(user.getName());
			update.setSalary(user.getSalary());
			update.setSsn(user.getSsn());
			
			Session session = this.getSession();
			session.beginTransaction();
			session.update(update);
			session.getTransaction().commit();
			session.close();
		}
	}



}
