package com.q4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.q4.model.User;
import com.q4.repository.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo repo;

	public User create(String username, String password, String email) {
		return repo.save(new User(username, password, email));
	}

	public boolean find(String username, String password) {
		User user = repo.findByUsername(username);
		if (user.getPassword().equals(password)) {
			return true;
		} else {
			return false;
		}
	}
}
