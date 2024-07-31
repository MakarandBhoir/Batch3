package com.infinity.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest5 {
	public static void main(String[] args) {
		try {
			// step 1: load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// step 2: obtain the connection
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			
			// step 3: create the prepared statement
			String query = "Delete from emp where employee_id = ?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			int emp[] = {207, 208};
			for(int id : emp) {
				pstmt.setInt(1, id);
				pstmt.executeUpdate();
			}
			System.out.println("Record deleted successfully from database.");
			
			// step 5: close statement and connection
			pstmt.close();
			conn.close();
			
			// step 6: check the result in the database
		}
		catch(ClassNotFoundException e) {
			System.out.println("Oracle driver not found.");
		}
		catch(SQLException e) {
			System.out.println("Connection could not be established.");
		}
	}
}
