package com.day6.session1.jdbc_basics;
import java.sql.*;
public class B_ShowAllWithARM {
	
	public static void main(String[] args) {

		//"Change is the only constant is life"
		//I should use a file to keep db details, Connection factory (used to hide the complity of object creation)
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver is loaded");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//ARM: try with resource
		try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/shl", "root", "root")) {
		
			Statement stmt=connection.createStatement();
			
			ResultSet rs=stmt.executeQuery("select * from customer");//executeQuery vs executeUpdate
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+": "+rs.getString(2)+": "+rs.getString(3)+": "+rs.getString(4));
			}
			
			System.out.println("conn is done");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}



//lets get all the rec fron the customer table and print them
//DDL vs DML: CRUD , read : ResultSet

//	Statement	: for simple query, perforamce is bad, SQL injection ?

//	PreparedStatement: no sql injection problem , good in perforance?

//	CallableStatement: Used to call SP











