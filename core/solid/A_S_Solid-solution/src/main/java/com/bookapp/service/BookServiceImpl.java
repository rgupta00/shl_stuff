package com.bookapp.service;

import java.util.List;

import com.bookapp.dao.BookDao;
import com.bookapp.dao.BookDaoHibernateImpl;
import com.bookapp.dao.BookDaoJdbcImpl;
import com.bookapp.dto.Book;
import com.bookapp.validation.BookValidation;


public class BookServiceImpl implements BookService {

	private BookDao bookDao;
	
	private BookValidation bookValidation;
	
	
	
	public BookServiceImpl() {
		bookDao=new BookDaoHibernateImpl();
		
		bookValidation=new BookValidation();
	}

	@Override
	public List<Book> getAllBooks() {
		return null;
	}

	@Override
	public Book getBookById(int bookId) {
		return null;
	}

	@Override
	public void addBook(Book book) {
		bookDao.addBook(book);
	
	}

	@Override
	public void updateBook(Book book) {
		
	}

	@Override
	public void removeBook(int bookId) {
	
	}

}
