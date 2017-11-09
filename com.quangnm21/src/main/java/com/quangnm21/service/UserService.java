package com.quangnm21.service;

import com.quangnm21.entity.User;

public interface UserService {

	User getUserByEmail(String email);

	void createUser(User user);

	boolean checkValidateUser(User user);
}
