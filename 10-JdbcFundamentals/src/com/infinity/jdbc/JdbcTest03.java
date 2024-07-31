package com.infinity.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest03 {
	public static void main(String[] args) {
		try {
			// step 1: load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// step 2: obtain the connection
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			
			// step 3: create the statement
			Statement stmt = conn.createStatement();
			
			int empId = 207;
			String empName = "Janmesh";
			double empSal = 50000;
			
			// step 4: execute the query
			String query = "Insert into emp values("+empId+", '"+empName+"', "+empSal+")";
			System.out.println(query);
			
			stmt.executeUpdate(query);
			System.out.println("Record inserted in database.");
			
			// step 5: close statement and connection
			stmt.close();
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
