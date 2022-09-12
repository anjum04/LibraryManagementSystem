package com.assignment.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.assignment.project.entity.Library;

import com.assignment.project.services.LibraryService;

@RestController
@RequestMapping("/api/library")
public class LibraryController {
    
	@Autowired
	private LibraryService libraryService;
	
	@GetMapping("/lend/{userid}/{isbn}")
	public ResponseEntity<Library> lendBooksToUsers(@PathVariable int  userid,@PathVariable int isbn)
 	{

		Library borrowedUser = this.libraryService.lendBooksToUsers(userid,isbn);
		return new ResponseEntity<>(borrowedUser, HttpStatus.OK);
 	}
	
	@GetMapping("/return/{borrowerId}/{bookId}")
	public ResponseEntity<Library> returnBookToLib(@PathVariable int  borrowerId,@PathVariable int bookId)
 	{
 		Library returnedBook  = this.libraryService.returnBooksToLib(borrowerId,bookId);
 		 return new ResponseEntity<>(returnedBook, HttpStatus.OK);
 	}
}
