package com.bookapp.web;

import com.bookapp.dto.Book;
import com.bookapp.service.BookService;
import com.bookapp.service.BookServiceImpl;

public class BookController {
	
	public static void main(String[] args) {
		BookService bookService=new BookServiceImpl();
		Book book=new Book("ERS12", "rich dad poor dad", "foo", 300.00);
		bookService.addBook(book);
		System.out.println("------------");
	}

}
