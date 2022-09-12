package com.assignment.project.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.project.entity.Book;
import com.assignment.project.entity.User;
import com.assignment.project.exceptions.ResourceNotFoundException;
import com.assignment.project.repositories.BookRepo;
import com.assignment.project.repositories.UserRepo;
import com.assignment.project.services.BookServices;
import com.assignment.project.services.UserService;

@Service
public class BookServiceImpl implements BookServices{
   
	@Autowired 
	private BookRepo bookRepo;
	
	
	public Book AddBook(Book book)
	{
		 return this.bookRepo.save(book);
	}
	
	public List<Book> getAllBooks()
	{
		List<Book> allBooks =this.bookRepo.findAll();
		return allBooks;
	}
	public List<Book> getBookByTitleAuthor(String name)
	{ 
		    Book booksearch =  new Book();
	        List<Book> search = new ArrayList<Book>();
	       
	        List<Book> books = bookRepo.findAll();
	      
	        books.forEach(book -> 
	        {
	       	 if(book.getBookName().equals(name) || book.getBookAuthor().equals(name))
	    		{
	           		booksearch.setBookName(book.getBookName());
	    			booksearch.setBookAuthor(book.getBookAuthor());
	    			booksearch.setisbn(book.getisbn());
	    			search.add(book);
	    		}
	           });
	   
	        return search;

	        }
    public void removeBook(int bookId)
    {   
    	Book book = this.bookRepo.findById(bookId)
				.orElseThrow(() -> new ResourceNotFoundException("Book", "bookId", bookId));
		this.bookRepo.delete(book);

    }
   
}
