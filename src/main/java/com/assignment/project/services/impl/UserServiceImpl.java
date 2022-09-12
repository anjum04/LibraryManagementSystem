package com.assignment.project.services.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.assignment.project.entity.Book;
import com.assignment.project.entity.User;
import com.assignment.project.exceptions.ResourceNotFoundException;
import com.assignment.project.repositories.BookRepo;
import com.assignment.project.repositories.UserRepo;
import com.assignment.project.services.BookServices;
import com.assignment.project.services.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired 
	private UserRepo userRepo;
	
	
	public User createUser(User user)
	{
		User savedUser =  this.userRepo.save(user);
		return savedUser;
	}
	public List<User> getAllUsers()
	{
		List<User> users =this.userRepo.findAll();
		return users;
	}
	
}
	
	
	
	


