package com.bookapp.dao;

import java.util.List;

import com.bookapp.dto.Book;
import com.bookapp.excpetions.DataAccessException;
public interface BookDao {

	public List<Book> getAllBooks();
	public Book getBookById(int bookId);
	public void addBook(Book book)throws DataAccessException;
	public void updateBook(Book book);
	public void removeBook(int bookId);
}
