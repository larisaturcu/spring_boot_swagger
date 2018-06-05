package com.ltu.example.greetings;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltu.example.greetings.model.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	public List<User> getUserDetails() {
		return userDao.getUserDetails();
	}
}