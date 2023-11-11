# Springboot_LibraryManagementSystem
A Spring Boot application for REST APIs; its purpose is to demonstrate various API .<br>
Requirements:<br>
● DB setup for the application.<br>
● Users of the library can view all the books in the library.<br>
● ISBN is used to maintain the uniqueness of the books.<br>
● You can search for books by book name or author name.<br>
● Once a book is selected, the user can check it out of the library.<br>
● The default return time can be set to 7 days.<br>
● The user can return a book at any given time.<br>
● The librarian can add books to the library.<br>
● The return time can be extended by the librarian.<br>
● The librarian can choose to discontinue a book.<br>
● There can be multiple copies of a book.<br>

1. All List of Library's users<br>
GET & link : http://localhost:8085/api/users <br>

API Endpoints: api/users <br>

Response <br>

[
    {
        "userId": 1,
        "username": "Akshay",
        "email": "Akshay01@gmail.com"
    },<br>
    {
        "userId": 2,
        "username": "Ajay",
        "email": "Ajay02@gmail.com"
    },<br>
    {
        "userId": 3,
        "username": "Arun",
        "email": "Arunkumar03@gmail.com"
    },<br>
    {
        "userId": 4,
        "username": "Amar",
        "email": "Amarender04@gmail.com"
    },<br>
    {
        "userId": 5,
        "username": "Abhishek",
        "email": "Abhishek05@gmail.com"
    }
]
<br>
<br>
2. All List of book in Library <br>
GET & link : http://localhost:8085/api/books<br>
Endpoint: api/books <br>

Response<br>
[
    {
        "bookId": 1,
        "isbn": 123459001,
        "bookName": "The Alchemist",
        "bookAuthor": "Paulo Coelho"
    },<br>
    {
        "bookId": 2,
        "isbn": 123459002,
        "bookName": "One Arranged Murder",
        "bookAuthor": "Chetan Bhagat"
    },<br>
    {
        "bookId": 3,
        "isbn": 123459003,
        "bookName": "Two States",
        "bookAuthor": "Chetan Bhagat"
    },<br>
    {
        "bookId": 4,
        "isbn": 123459004,
        "bookName": "The Kite Runner",
        "bookAuthor": "Khaled Hosseini"
    },<br>
    {
        "bookId": 5,
        "isbn": 123459005,
        "bookName": "The Pyschology of money",
        "bookAuthor": "Morgan Housel"
    }
]
<br>
<br>
3. Ability to add books to the system.<br>
POST and link : http://localhost:8085/api/books<br>
End point : api/books<br>

Request Pay load or body
{
    "isbn": 123459001,
    "bookName": "The Alchemist",
    "bookAuthor": "Paulo Coelho"
}
<br>
Response
{
  "bookId": 1,
   "isbn": 123459001,
   "bookName": "The Alchemist",
   "bookAuthor": "Paulo Coelho"
}
<br>
<br>
4. Ability to add users to the system.<br>
POST and link: http://localhost:8085/api/users<br>
Endpoint : api/users
<br>

Request Pay load
{
    "username": "Akshay",
    "email": "Akshay01@gmail.com"
}
<br>
Response 
 {
        "userId": 1,
        "username": "Akshay",
        "email": "Akshay01@gmail.com"
    }
 <br>
 <br>
 5. Ability to remove a book from System <br>
 DELETE and link : http://localhost:8085/api/books/book/1<br>
 API endpoint : book/{bookId}<br>
<br>
<br>
 
 6. Ability to search a book by title, author.<br>
search a book by title <br>
API End point : api/search/book/{name} <br>
GET Method and link : http://localhost:8085/api/books/search/book/The Alchemist <br>
request example (search a book by title("The Alchemist"))<br>
Response<br>
[
    {
        "bookId": 1,
        "isbn": 123459001,
        "bookName": "The Alchemist",
        "bookAuthor": "Paulo Coelho"
    }
]<br>
<br>
<br>
7. search a book by Author<br>
API End point :  api/search/book/{name}<br>
GET Method and link : http://localhost:8085/api/books/search/book/Morgan Housel<br>
request example (search a book by Author name("Morgan Housel"))<br>
Response
[
    {
        "bookId": 5,
        "isbn": 123459005,
        "bookName": "The Pyschology of money",
        "bookAuthor": "Morgan Housel"
    }
]<br>
<br>
<br>
8. Ability to lend books to users.<br>
API End point : api/library/lend/{userid}/{bookid}<br>
Get Method and link : http://localhost:8085/api/library/lend/2/4<br>

{
    "borrowerId": 2,
    "bookid": 4,
    "borrower": "Ajay",
    "bookIssued": "The Kite Runner",
    "borrowDate": "2022-09-11",
    "returnDate": "2022-09-18",
    "status": "Not Avaiable"
}
<br>
<br>
9. Ability to return books to the library.<br>
API End point:  api/library/return/{borrowerId}/{bookId}<br>
Get Method and link :  http://localhost:9080/api/return/2/4<br>
Response
<br>
{
    "borrowerId": 2,
    "bookid": 4,
    "borrower": "Ajay",
    "bookIssued": "The Kite Runner",
    "borrowDate": "2022-09-11",
    "returnDate": "2022-09-18",
    "status": "Avaiable"
}
<br>
<br>






