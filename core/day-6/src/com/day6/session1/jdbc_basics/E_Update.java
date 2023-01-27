package com.day6.session1.jdbc_basics;
import java.sql.*;

import com.day6.session1.factory.ConnectionFactory;
public class E_Update {
	
	public static void main(String[] args) {

		try(Connection connection=ConnectionFactory.getConnection()) {
		
			PreparedStatement pstmt=connection
					.prepareStatement("update customer set address=?, phone=? where id=?");//? is called placeholder
		
			pstmt.setString(1, "Kadwai nagar delhi");
			pstmt.setString(2, "7788033445");
			pstmt.setInt(3, 4);
			
			int noOfRows=pstmt.executeUpdate();
			
			System.out.println(noOfRows);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
