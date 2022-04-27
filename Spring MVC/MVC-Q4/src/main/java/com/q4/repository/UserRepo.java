package com.q4.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.q4.model.User;

@Repository
public interface UserRepo extends MongoRepository<User, String> {
	public User findByUsername(String username);

	public User findByPassword(String password);

	public User findByEmail(String email);
}
