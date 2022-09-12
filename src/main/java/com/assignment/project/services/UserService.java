package com.assignment.project.services;

import java.util.List;


import com.assignment.project.entity.User;



public interface UserService {
	
	User createUser(User user);
	
	List<User> getAllUsers();
	
//	User lendBooksToUsers(int userid, int isbn);
	
	
}
