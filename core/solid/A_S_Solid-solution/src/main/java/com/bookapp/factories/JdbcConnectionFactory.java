package com.bookapp.factories;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcConnectionFactory {
	
	private static Connection connection=null;
	
	private JdbcConnectionFactory() {}
	
	public static Connection  getConnection(){
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
	

}
