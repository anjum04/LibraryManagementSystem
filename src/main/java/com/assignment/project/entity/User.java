package com.assignment.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="userId")
	private Integer userId;
	
	@Column(name="username")
	private String username;
	
	@Column(name="email")
	private String email;
	
  
	public User()
	{
		
	}
	public User(Integer userId, String username, String email) {
		super();
		this.userId = userId;
		this.username = username;
		this.email = email;
		
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
		
}