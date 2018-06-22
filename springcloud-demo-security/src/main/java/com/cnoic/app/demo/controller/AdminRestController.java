package com.cnoic.app.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cnoic.app.demo.model.User;
import com.cnoic.app.demo.service.UserService;

@RequestMapping("/admin")
@RestController
public class AdminRestController {

	@Autowired
	private UserService userService;

	@PreAuthorize("hasRole('ADMIN') OR hasRole('USER')")
	@PutMapping("/user/")
	public User updateUser(@RequestBody User user) {
		userService.updateUser(user);
		return user;
	}
	
	@Secured("ROLE_ADMIN")
    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable("id") Integer userId)
    {
        userService.deleteUser(userId);
    }
}
