package com.day6.session1.jdbc_basics;
import java.sql.*;

import com.day6.session1.factory.ConnectionFactory;
public class F_Update {
	
	public static void main(String[] args) {

		try(Connection connection=ConnectionFactory.getConnection()) {
		
			PreparedStatement pstmt=connection
					.prepareStatement("delete from customer where id=?");//? is called placeholder
		
		
			pstmt.setInt(1, 3);
			
			int noOfRows=pstmt.executeUpdate();
			
			System.out.println(noOfRows);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
