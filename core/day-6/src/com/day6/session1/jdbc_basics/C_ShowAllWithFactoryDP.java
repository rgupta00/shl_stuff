package com.day6.session1.jdbc_basics;
import java.sql.*;

import com.day6.session1.factory.ConnectionFactory;
public class C_ShowAllWithFactoryDP {
	
	public static void main(String[] args) {

		try(Connection connection=ConnectionFactory.getConnection()) {
		
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
