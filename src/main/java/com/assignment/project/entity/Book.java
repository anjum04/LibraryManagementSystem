package com.assignment.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class Book {
   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="bookId")
	private int bookId;
	
	@Column(name="isbn")
	private int isbn;
	
	@Column(name="bookName")
	private String bookName;
	
	@Column(name="bookAuthor")
	private String bookAuthor;
	
    
	public Book()
	{
		
	}
	public Book(int bookId, int isbn, String bookName, String bookAuthor) {
		super();
		this.bookId = bookId;
		this.isbn=isbn;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	
	}

	public int getBookId() {
		return bookId;
	}
  
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getisbn() {
		return isbn;
	}

	public void setisbn(int isbn) {
		this.isbn = isbn;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
}
