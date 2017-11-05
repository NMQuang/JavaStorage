package com.quangnm21.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.quangnm21.entity.Channel;
import com.quangnm21.entity.User;
import com.quangnm21.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserRest {

	@Autowired
	private IUserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<User> getLogin(@RequestBody User data) {
	        User user = userService.getUserByEmail(data.getUsername());

	        if (user == null) {
	            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
	        }

		if(data.getUsername().equals(user.getUsername()) && data.getPassword().equals(user.getPassword())){
			return new ResponseEntity<User>(data,HttpStatus.OK);
		}

	        return new ResponseEntity<User>(user, HttpStatus.BAD_REQUEST);
	    }

	@RequestMapping(value = "/register", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<User> getRegister(@RequestBody User data) {

	        if (userService.checkValidateUser(data)) {
			userService.createUser(data);
			return new ResponseEntity<User>(data,HttpStatus.OK);
		} else {
			System.out.println("Error register");
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}

	    }
}
