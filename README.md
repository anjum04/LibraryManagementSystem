# Springboot_LibraryManagementSystem
A Spring Boot application for REST APIs; its purpose is to demonstrate various API .

Requirements:
● DB setup for the application.
● Users of the library can view all the books in the library.
● ISBN is used to maintain the uniqueness of the books.
● You can search for books by book name or author name.
● Once a book is selected, the user can check it out of the library.
● The default return time can be set to 7 days.
● The user can return a book at any given time.
● The librarian can add books to the library.
● The return time can be extended by the librarian.
● The librarian can choose to discontinue a book.
● There can be multiple copies of a book.

All List of Library's users
GET 
http://localhost:8085/api/users

API Endpoints api/users

Response 

[
    {
        "userId": 1,
        "username": "Akshay",
        "email": "Akshay01@gmail.com"
    },
    {
        "userId": 2,
        "username": "Ajay",
        "email": "Ajay02@gmail.com"
    },
    {
        "userId": 3,
        "username": "Arun",
        "email": "Arunkumar03@gmail.com"
    },
    {
        "userId": 4,
        "username": "Amar",
        "email": "Amarender04@gmail.com"
    },
    {
        "userId": 5,
        "username": "Abhishek",
        "email": "Abhishek05@gmail.com"
    }
]

All List of book in Library

GET
Endpoint api/books
http://localhost:8085/api/books


[
    {
        "bookId": 1,
        "isbn": 123459001,
        "bookName": "The Alchemist",
        "bookAuthor": "Paulo Coelho"
    },
    {
        "bookId": 2,
        "isbn": 123459002,
        "bookName": "One Arranged Murder",
        "bookAuthor": "Chetan Bhagat"
    },
    {
        "bookId": 3,
        "isbn": 123459003,
        "bookName": "Two States",
        "bookAuthor": "Chetan Bhagat"
    },
    {
        "bookId": 4,
        "isbn": 123459004,
        "bookName": "The Kite Runner",
        "bookAuthor": "Khaled Hosseini"
    },
    {
        "bookId": 5,
        "isbn": 123459005,
        "bookName": "The Pyschology of money",
        "bookAuthor": "Morgan Housel"
    }
]

Ability to add books to the system.
POST
api/books
http://localhost:8085/api/books
Request Pay load or body
{
    "isbn": 123459001,
    "bookName": "The Alchemist",
    "bookAuthor": "Paulo Coelho"
}

Response
{
  "bookId": 1,
   "isbn": 123459001,
   "bookName": "The Alchemist",
   "bookAuthor": "Paulo Coelho"
}

Ability to add users to the system.
POST
api/users
http://localhost:8085/api/users

Request Pay load
{
    "username": "Akshay",
    "email": "Akshay01@gmail.com"
}

Response 
 {
        "userId": 1,
        "username": "Akshay",
        "email": "Akshay01@gmail.com"
    }
 
Ability to search a book by title, author.
search a book by title 
API End point : api/search/book/{name} 
GET Method and link : http://localhost:8085/api/books/search/book/The Alchemist
request example (search a book by title("The Alchemist"))
Response
[
    {
        "bookId": 1,
        "isbn": 123459001,
        "bookName": "The Alchemist",
        "bookAuthor": "Paulo Coelho"
    }
]

search a book by Author
API End point :  api/search/book/{name}
GET Method and link : http://localhost:8085/api/books/search/book/Morgan Housel
request example (search a book by Author name("Morgan Housel"))
Response
[
    {
        "bookId": 5,
        "isbn": 123459005,
        "bookName": "The Pyschology of money",
        "bookAuthor": "Morgan Housel"
    }
]
   
Ability to lend books to users.
API End point : api/library/lend/{userid}/{bookid}
Get Method and link : http://localhost:8085/api/library/lend/2/4

{
    "borrowerId": 2,
    "bookid": 4,
    "borrower": "Ajay",
    "bookIssued": "The Kite Runner",
    "borrowDate": "2022-09-11",
    "returnDate": "2022-09-18",
    "status": "Not Avaiable"
}

Ability to return books to the library.
API End point:  api/library/return/{borrowerId}/{bookId}
Get Method and link :  http://localhost:9080/api/return/2/4
Response

{
    "borrowerId": 2,
    "bookid": 4,
    "borrower": "Ajay",
    "bookIssued": "The Kite Runner",
    "borrowDate": "2022-09-11",
    "returnDate": "2022-09-18",
    "status": "Avaiable"
}







