package com.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
//GOD class--- 
class Book {
	private int id;
	private String isbn;
	private String title;
	private String author;
	private double price;
	public boolean valiation() {
		return true;
	}
	public Connection  getConnection(){
		 Connection connection=null;
		Properties prop=new Properties();//aka hashtable,,used to load prop file
		InputStream is;
		try {
			is = new FileInputStream("db.properties");
			prop.load(is);//this will get key and values
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		String driverName=prop.getProperty("jdbc.driver");
		String url= prop.getProperty("jdbc.url");
		String username= prop.getProperty("jdbc.username");
		String password= prop.getProperty("jdbc.password");
		
		
		
		try {
			Class.forName(driverName);// this is dynamic class loading
			System.out.println("driver is loaded");
		} catch (ClassNotFoundException ex) {
			System.out.println("driver loading is not working");
		}
		
		try {
			connection = DriverManager.getConnection(url,username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return connection;
	}

	public SessionFactory  getFactory(){
		// code to get jdbc connection..
		return null;
	}
	public void addBook(Book book)throws SQLException{
		System.out.println("adding book to db using jdbc..");
	}
    public void addBookUsingHibernate(Book book)throws HibernateException{
		System.out.println("adding book to db using hibernate....");
	}
}