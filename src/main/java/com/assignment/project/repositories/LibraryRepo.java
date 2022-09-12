package com.assignment.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.project.entity.Library;

public interface LibraryRepo extends JpaRepository<Library,Integer>{

}
