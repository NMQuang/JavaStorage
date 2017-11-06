package com.quangnm21.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.quangnm21.entity.User;
import com.quangnm21.util.HibernateUtil;

@Repository
@Transactional
public class UserDaoImpl implements IUserDao {

	@Autowired
	private HibernateUtil hibernateUtil;

	@Override
	public User getUserByEmail(String email) {
		String query = "SELECT u.username, u.password, u.email FROM User u WHERE u.email LIKE '" + email+"'";
		List<User> users = hibernateUtil.fetchAll(query);
		if (users.size() > 0) {
			return users.get(0);
		}
		return null;
	}

	@Override
	public void createUser(User user) {
		hibernateUtil.create(user);
	}

}
