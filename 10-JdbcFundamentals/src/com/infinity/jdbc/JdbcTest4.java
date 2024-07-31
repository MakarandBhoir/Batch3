package com.infinity.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest4 {
	public static void main(String[] args) {
		try {
			// step 1: load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// step 2: obtain the connection
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			
			// step 3: create the prepared statement
			String query = "Insert into emp(employee_id, last_name, salary) values(?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(query);
			
			int empId = 208;
			String empName = "Harshal";
			double empSal = 50000;
			
			// step 4: execute the query
			pstmt.setInt(1, empId);
			pstmt.setString(2, empName);
			pstmt.setDouble(3, empSal);
			
			pstmt.executeUpdate();
			System.out.println("Record inserted successfully into database.");
			
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
