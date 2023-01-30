package com.bookapp.dao;

import java.util.List;

import org.hibernate.HibernateException;

import com.bookapp.dto.Book;
import com.bookapp.excpetions.DataAccessException;

public class BookDaoHibernateImpl implements BookDao{

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
	
		try {
			
			
			if(1==1)
				throw new HibernateException("some hib ex");
		}catch(HibernateException ex) {
			new DataAccessException(ex);
		}
	}

	@Override
	public void updateBook(Book book) {
		
	}

	@Override
	public void removeBook(int bookId) {
		
	}

}
