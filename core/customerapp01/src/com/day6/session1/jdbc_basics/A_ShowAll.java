package com.day6.session1.jdbc_basics;
import java.sql.*;
public class A_ShowAll {
	
	public static void main(String[] args) {
		
		//first step is used to configure the driver?
		//driver and drivermanager
		//java  driver(vendor)					db
		//me	<------>				somebody
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver is loaded");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection connection=null;
		
		//2. connection need to be created...
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/shl", "root", "root");
			
			Statement stmt=connection.createStatement();
			
			ResultSet rs=stmt.executeQuery("select * from customer");//executeQuery vs executeUpdate
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+": "+rs.getString(2)+": "+rs.getString(3)+": "+rs.getString(4));
			}
			
			System.out.println("conn is done");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}



//lets get all the rec fron the customer table and print them
//DDL vs DML: CRUD , read : ResultSet

//	Statement	: for simple query, perforamce is bad, SQL injection ?

//	PreparedStatement: no sql injection problem , good in perforance?

//	CallableStatement: Used to call SP











