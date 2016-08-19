package com.adCamp.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.adCamp.model.User;

@Repository
public class UserRepository {
	
	Map<String,User> users = new HashMap<>();

	public void save(User user){
		users.put(user.getId(),user);
	}
	
	public User findOne(String userId){
		return users.get(userId);
	}
}
