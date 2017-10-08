package com.quangnm21.dao;

import java.util.List;

import com.quangnm21.entity.User;

//import com.webdev.api.POJO.Token;

public interface IUserDAO {
	public User add(User newUser);
	public int update(User newUser);
	public User get(int uid);
	public User get(String username, String password);
	public List<User> getAllUser();
	//
	public User findById(int id);
	public User findBySso(String sso);
	//public Set<Token> getTokens(int uid);
	public User findByEmail(String email);
	//public Set<Token> getTokens(int uid);
}
