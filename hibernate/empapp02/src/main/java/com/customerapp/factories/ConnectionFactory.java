package com.customerapp.factories;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
public class ConnectionFactory {
	
	private static Connection connection=null;
	
	public static Connection getConnection() {
		
		//Java specail ds : used to read the prop file
		Properties properties=new Properties();
		InputStream inStream=null;
		try {
			inStream = new FileInputStream("db.properties");
			
			properties.load(inStream);
			
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		String url= properties.getProperty("jdbc.url");
		String username= properties.getProperty("jdbc.username");
		String password= properties.getProperty("jdbc.password");
		String driverName= properties.getProperty("jdbc.driverName");
		
		
		
		try {
			Class.forName(driverName);
			System.out.println("driver is loaded");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			connection=DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	

}
