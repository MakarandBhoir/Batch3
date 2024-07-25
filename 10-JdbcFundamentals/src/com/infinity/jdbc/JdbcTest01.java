package com.infinity.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTest01 {
	public static void main(String[] args) {
        try {
        	// Step 1: Load the Oracle driver
        	Class.forName("oracle.jdbc.driver.OracleDriver");
        	System.out.println("Oracle driver loaded successfully");
        	
        	// Step 2: Establish the connection
        	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
        	System.out.println("Connection established successfully");
        }
        catch (ClassNotFoundException e) {
        	System.out.println("Oracle driver not found.");
		}
        catch(SQLException e) {
        	System.out.println("Connection could not be established");
        }
	}
}
