package com.assignment.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.project.entity.User;

public interface UserRepo extends JpaRepository<User,Integer>{

}
