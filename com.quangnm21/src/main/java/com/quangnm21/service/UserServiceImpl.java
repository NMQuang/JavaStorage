package com.quangnm21.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.quangnm21.dao.UserDao;
import com.quangnm21.entity.User;


@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public User getUserByEmail(String email) {
		return userDao.getUserByEmail(email);
	}

	@Override
	public void createUser(User user) {
		userDao.createUser(user);
	}

	@Override
	public boolean checkValidateUser(User user) {
		boolean result = false;
		if (userDao.getUserByEmail(user.getEmail()) == null) {
			if (user.getUsername().length() > 6 && user.getUsername().length() < 32 && user.getPassword().length() > 8 && user.getPassword().length() < 32) {
				result = true;
			}
		}
		return result;
	}
}
