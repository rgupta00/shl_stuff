package com.day6.session1.jdbc_basics;
import java.sql.*;

import com.day6.session1.factory.ConnectionFactory;
public class D_Insert {
	
	public static void main(String[] args) {

		try(Connection connection=ConnectionFactory.getConnection()) {
		
			PreparedStatement pstmt=connection
					.prepareStatement("insert into customer(name, address, phone) values(?,?,?)");//? is called placeholder
			pstmt.setString(1, "pawan");
			pstmt.setString(2, "Krishna nagar delhi");
			pstmt.setString(3, "7788833445");
			
			int noOfRows=pstmt.executeUpdate();
			
			System.out.println(noOfRows);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
