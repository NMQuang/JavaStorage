package com.quangnm21.dao;

import com.quangnm21.entity.User;

public interface IUserDao {

	User getUserByEmail(String ussername);

	void createUser(User user);
}
