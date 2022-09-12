package com.assignment.project.services.impl;

import java.time.LocalDate;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.project.entity.Book;
import com.assignment.project.entity.Library;
import com.assignment.project.entity.User;
import com.assignment.project.exceptions.ResourceNotFoundException;
import com.assignment.project.repositories.BookRepo;
import com.assignment.project.repositories.LibraryRepo;
import com.assignment.project.repositories.UserRepo;
import com.assignment.project.services.LibraryService;

@Service
public class LibraryServiceImpl implements LibraryService {
      
	    @Autowired 
	    private UserRepo userRepo;
	    
	    @Autowired
	    private BookRepo bookRepo;
	    
	    @Autowired
	    private LibraryRepo libraryRepo;
		
    public Library lendBooksToUsers(int userid,int bookid)
	{
	  
	  Book borrowedBook = this.bookRepo.findById(bookid)
				.orElseThrow(() -> new ResourceNotFoundException("Book", "ID", bookid));
	 
	  User borrowedUser = this.userRepo.findById(userid)
			   .orElseThrow(() -> new ResourceNotFoundException("User", "ID", userid));
	  
	  Library bookLendedToUser = new Library();
	  bookLendedToUser.setBorrower(borrowedUser.getUsername());
	  bookLendedToUser.setBookIssued(borrowedBook.getBookName());
	  bookLendedToUser.setBorrowDate(LocalDate.now());
	  bookLendedToUser.setReturnDate(LocalDate.now().plusDays(7));
	  bookLendedToUser.setStatus("Not Avaiable");
	  bookLendedToUser.setBookid(borrowedBook.getBookId());
	  this.libraryRepo.save(bookLendedToUser);
	 
	  return bookLendedToUser;

	}

	@Override
	public Library returnBooksToLib(int borrowerId, int bookId) {
		
      Library lendedBook = this.libraryRepo.findById(bookId)
				.orElseThrow(() -> new ResourceNotFoundException("BookId", " Id ", bookId));
	  
	  Library bookReturnedByUser = new Library();
	  
	  bookReturnedByUser.setBookid(lendedBook.getBookid());
	  bookReturnedByUser.setBorrower(lendedBook.getBorrower());
	  bookReturnedByUser.setBookIssued(lendedBook.getBookIssued());
	  bookReturnedByUser.setBorrowDate(lendedBook.getBorrowDate());
	  bookReturnedByUser.setReturnDate(lendedBook.getReturnDate());
	  bookReturnedByUser.setStatus("Available");
	  
      
		return bookReturnedByUser;
	}


}
