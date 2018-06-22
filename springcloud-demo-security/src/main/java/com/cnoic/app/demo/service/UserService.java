package com.cnoic.app.demo.service;

import com.cnoic.app.demo.model.User;

public interface UserService {
	User updateUser(User user);
	User deleteUser(int id);
}
