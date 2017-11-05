package com.quangnm21.service;

import com.quangnm21.entity.User;

public interface IUserService {

	User getUserByEmail(String user);

	boolean checkValidateUser(User user);

	void createUser(User user);
}
