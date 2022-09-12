package com.assignment.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.project.entity.Book;

public interface BookRepo extends JpaRepository<Book,Integer> {

}
