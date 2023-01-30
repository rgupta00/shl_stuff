package com.bookapp.service;


import java.util.List;

import com.bookapp.dto.Book;

public interface BookService {
	public List<Book> getAllBooks();
	public Book getBookById(int bookId);
	public void addBook(Book book);
	public void updateBook(Book book);
	public void removeBook(int bookId);
}
