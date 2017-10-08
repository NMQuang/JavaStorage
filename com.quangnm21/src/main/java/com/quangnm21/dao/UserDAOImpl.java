package com.quangnm21.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.quangnm21.entity.User;
import com.quangnm21.util.HibernateUtil;





@Repository
public class UserDAOImpl implements IUserDAO {
	//final static Logger logger = Logger.getLogger(UserDAOImpl.class);

	@Autowired
	private HibernateUtil hibernateUtil;

	public User add(User newUser) {

		return (User) hibernateUtil.create(newUser);
	}

	public int update(User newUser) {
		return 0;
	}

	public User get(int uid) {
		return null;
	}

	public User get(String username, String password) {
		return null;
	}

	public User findById(int id) {
		return hibernateUtil.fetchById(id, User.class);
	}

	public List<User> getAllUser() {
		return hibernateUtil.fetchAll(User.class);
	}

	public User findBySso(String sso) {
		return null;
	}

	public User findByEmail(String email) {
		return null;
	}

}
