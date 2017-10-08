package com.quangnm21.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.quangnm21.dao.IUserDAO;
import com.quangnm21.entity.User;






@Service
@Transactional
public class UserServiceImpl implements IUserService{

	@Autowired
	private IUserDAO dao;

	public User findById(int id) {
		return dao.findById(id);
	}

	public User findBySso(String sso) {
		return dao.findBySso(sso);
	}

	public List<User> getAllUsers() {
		return dao.getAllUser();
	}

}
