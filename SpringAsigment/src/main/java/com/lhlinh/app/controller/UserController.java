package com.lhlinh.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.lhlinh.app.entities.User;
import com.lhlinh.app.services.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "user/getall", method = RequestMethod.GET)
	public List<User> getListUser() {
		return userService.getListUser();
	}
	
	@RequestMapping(value = "user/{id}", method = RequestMethod.GET)
	public User getUserById(@PathVariable("id") int id) {
		return userService.getUserById(id);
	}
	
	@RequestMapping(value = "user/insert", method = RequestMethod.POST)
	public boolean insert(@RequestBody User user) {
		return userService.insertUser(user);
	}
	
	@RequestMapping(value = "user/delete/{userId}", method = RequestMethod.DELETE)
	public boolean deleteUser(@PathVariable("userId") int userId) {
		return userService.deleteUser(userId);
	}

}
