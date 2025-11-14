package com.assignment.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.project.entity.Book;

import com.assignment.project.services.BookServices;

@RestController
@RequestMapping("/api/books")
public class BookController {
	
	@Autowired
	private BookServices bookServices;
	
	@PostMapping("/")
	public ResponseEntity<Book> AddBook(@RequestBody Book book)
	{
		Book bookAdded = this.bookServices.AddBook(book);
		return new ResponseEntity<>(bookAdded, HttpStatus.CREATED);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Book>> getAllBook()
	{
		return ResponseEntity.ok(this.bookServices.getAllBooks());
	}
 
	@GetMapping("search/book/{name}")
	public ResponseEntity<List<Book>> getBookByTitleAuthor(@PathVariable String name)
	{
		 List<Book> booksByTitileAuthor = this.bookServices.getBookByTitleAuthor(name);
		 return ResponseEntity.ok(booksByTitileAuthor);
	}
	
	@DeleteMapping("book/{bookId}")
	public ResponseEntity<Void> deleteBook(@PathVariable int bookId)
	{
		   this.bookServices.removeBook(bookId);
		   return null;
	}

    // Test api
    @GetMapping("/test")
    public String testApi(){
        return "Testing API";
    }
	
}
