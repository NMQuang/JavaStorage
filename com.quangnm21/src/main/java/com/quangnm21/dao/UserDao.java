package com.quangnm21.dao;

import com.quangnm21.entity.User;

public interface UserDao {

	User getUserByEmail(String email);

	void createUser(User user);
}
