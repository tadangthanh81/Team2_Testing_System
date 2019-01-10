package com.lhlinh.app.services;



import java.util.List;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import com.lhlinh.app.dao.UserDAO;
import com.lhlinh.app.entities.User;

@Service
public class UserService {
	@Autowired
	private UserDAO userDAO;

	public List<User> getListUser() {
		return userDAO.getListUser();
	}
	
	public User getUserById(int id) {
		return userDAO.getAnUserById(id);
	}
	public boolean insertUser(User user) {
		return userDAO.insertUsert(user);

	}

	public boolean deleteUser(int userId) {
		return deleteUser(userId);
	}
}
