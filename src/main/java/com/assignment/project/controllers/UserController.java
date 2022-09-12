package com.assignment.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.project.entity.User;
import com.assignment.project.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//create User
	@PostMapping("/")
	public ResponseEntity<User> createUser(@RequestBody User user)
	{
		User createUser = this.userService.createUser(user);
		return new ResponseEntity<>(createUser, HttpStatus.CREATED);
	}
	
	// Get All users
	@GetMapping("/")
	public ResponseEntity<List<User>> getAllUsers()
	{
		return ResponseEntity.ok(this.userService.getAllUsers());
	}
		
}
