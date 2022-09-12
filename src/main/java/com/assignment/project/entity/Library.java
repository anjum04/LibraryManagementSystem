package com.assignment.project.entity;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Library")
public class Library {
  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="borrowerId")
	private int borrowerId ;
	
	@Column(name="bookid")
	private int bookid;
	
	@Column(name="borrower")
	private String borrower;
	
	@Column(name="bookIssued")
	private String bookIssued;
	
	@Column(name="borrowDate")
	private LocalDate borrowDate;
	
	@Column(name="returnDate")
	private LocalDate returnDate;
	
	@Column(name="status")
	private String status="Available";
	
	public Library()
	{
		
	}
	public Library(int borrowerId,int bookid, String bookIssued,String borrower, LocalDate borrowDate, LocalDate returnDate, String status) {
		super();
		this.borrowerId = borrowerId;
		this.bookid=bookid;
		this.bookIssued = bookIssued;
		this.borrower = borrower;
		this.borrowDate = borrowDate;
		this.returnDate = returnDate;
		this.status = status;
	}
	public int getBorrowerId() {
		return borrowerId;
	}
	public void setBorrowerId(int borrowerId) {
		this.borrowerId = borrowerId;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBorrower() {
		return borrower;
	}
	public void setBorrower(String borrower) {
		this.borrower = borrower;
	}
	public String getBookIssued() {
		return bookIssued;
	}
	public void setBookIssued(String bookIssued) {
		this.bookIssued = bookIssued;
	}
	public LocalDate getBorrowDate() {
		return borrowDate;
	}
	public void setBorrowDate(LocalDate borrowDate) {
		this.borrowDate = borrowDate;
	}
	public LocalDate getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	
	
}
