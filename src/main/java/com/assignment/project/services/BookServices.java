package com.assignment.project.services;

import java.util.List;


import com.assignment.project.entity.Book;

public interface BookServices  {
  
	Book AddBook(Book book);
	
	List<Book> getAllBooks();
	
	List<Book> getBookByTitleAuthor(String name);
	
	void removeBook(int bookId);
	
}
