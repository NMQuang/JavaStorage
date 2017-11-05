package com.quangnm21.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.quangnm21.dao.IUserDao;
import com.quangnm21.entity.User;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;

	@Override
	public User getUserByEmail(String user) {
		return userDao.getUserByEmail(user);
	}

	@Override
	public boolean checkValidateUser(User user) {
		boolean result = false;
		if (userDao.getUserByEmail(user.getUsername()) == null) {
			if (user.getUsername().length() > 6 && user.getUsername().length() < 32 && user.getPassword().length() > 8 && user.getPassword().length() < 32) {
				result = true;
			}
		}
		return result;
	}

	@Override
	public void createUser(User user) {
		userDao.createUser(user);
	}

}
