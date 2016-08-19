package com.adCamp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adCamp.model.User;
import com.adCamp.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public void addUser(User user){
		repository.save(user);
	}
	
	public User getUser(String id){
		return repository.findOne(id);
	}
}
