package com.cnoic.app.demo.service.impl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

import com.cnoic.app.demo.model.User;
import com.cnoic.app.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	private static final Map<Integer,User> users = new ConcurrentHashMap<Integer, User>();
	
	@Override
	public User updateUser(User user) {
		return users.put(user.getId(), user);
	}

	@Override
	public User deleteUser(int id) {
		return users.remove(id);
	}

}
