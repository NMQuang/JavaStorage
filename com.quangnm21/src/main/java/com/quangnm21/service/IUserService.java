package com.quangnm21.service;

import java.util.List;

import com.quangnm21.entity.User;

public interface IUserService {

	public User findById(int id);

	public User findBySso(String sso);
	public  List<User> getAllUsers();

}