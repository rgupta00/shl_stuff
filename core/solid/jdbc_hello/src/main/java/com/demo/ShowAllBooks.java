package com.demo;
import java.sql.*;
public class ShowAllBooks {
	
	public static void main(String[] args) {
		
		//factory dp
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver is loaded");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//Connection :
		try {
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/shl", "root", "root");
			
			Statement stmt=connection.createStatement();
			
			//CRUD : data manipulation c u d		: no data manipulation in case of read op
			
			ResultSet rs=stmt.executeQuery("select * from Book");//executeQuery vs executeUpate
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+ rs.getString(3)+" : "+rs.getDouble(4)+": "+rs.getString(5));
			}
		
			//Statement: dont use statement
			
			//prepStatement: good in performance and dont have sql injection project
			//CallableStatement: used to call store procedure
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
