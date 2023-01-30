package com.bookapp.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.bookapp.dto.Book;
import com.bookapp.excpetions.DataAccessException;
import com.bookapp.factories.JdbcConnectionFactory;

import java.util.*;
public class BookDaoJdbcImpl implements BookDao{

	private Connection connection;
	
	//Spring ?
	public BookDaoJdbcImpl() {
		connection=JdbcConnectionFactory.getConnection();
	}
	
	
	@Override
	public List<Book> getAllBooks() {
	
		return null;
	}

	@Override
	public Book getBookById(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addBook(Book book) {
		try {
			PreparedStatement stmt=connection.prepareStatement("insert into Book (author, isbn, price, title) values (?, ?, ?, ?)");
			stmt.setString(1, "raja");
			stmt.setString(2, "abc121");
			stmt.setDouble(3, 3333.6);
			stmt.setString(2, "java head first");
			stmt.executeUpdate();
		}catch(SQLException ex) {
			throw new DataAccessException(ex);
		}
		System.out.println("----book is added---");
	}

	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeBook(int bookId) {
		// TODO Auto-generated method stub
		
	}

}
