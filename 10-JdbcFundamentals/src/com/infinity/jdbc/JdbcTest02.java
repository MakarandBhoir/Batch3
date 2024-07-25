package com.infinity.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest02 {
	public static void main(String[] args) {
        try {
        	// Step 1: Load the Oracle driver
        	Class.forName("oracle.jdbc.driver.OracleDriver");
        	
        	// Step 2: Establish the connection
        	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
        	
        	// Step 3: Create a statement
        	Statement stmt = connection.createStatement();
        	
        	// Step 4: Formulate the query
        	String sql = "select employee_id, last_name, salary from employees";
        	
        	// Step 5: Execute the query
        	ResultSet rs = stmt.executeQuery(sql);
        	
        	// Step 6: Process the results
        	while(rs.next()) {
        		int id = rs.getInt(1);
        		String name = rs.getString("last_name");
        		double sal = rs.getDouble("salary");
        		
        		System.out.println("Emp Id: " + id + " Emp Name: " + name + " Emp Salary: " + sal);
        	}
        	
        	// Step 7: Close the connection
        	connection.close();
        }
        catch (ClassNotFoundException e) {
        	System.out.println("Oracle driver not found.");
		}
        catch(SQLException e) {
        	System.out.println("Connection could not be established");
        	e.printStackTrace();
        }
	}
}
