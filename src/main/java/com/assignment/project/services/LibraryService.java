package com.assignment.project.services;


import com.assignment.project.entity.Library;

public interface LibraryService  {
	
	Library lendBooksToUsers(int userid,int bookid);
	
	Library  returnBooksToLib(int borrowerId, int bookId);

}
