package com.cms;

import java.sql.*;

public class JDBCInsertDemo {

	public JDBCInsertDemo() {

	}

	public static void main(String[] args) {

		// Steps to connect to our MySQL database named CMS

		// STEP 1: Loading the JDBC Driver
		// STEP 2: Create a Connection
		// STEP 3: Create a Statement
		// STEP 4: Execute the Statement (Insert) 
		// STEP 5: Display the successful insert message

		Connection connection = null;

		try {
			// Step-1
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Step-2
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms", "root", "rootroot");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
		try {
			//step-3
			Statement stmt = connection.createStatement();
			
			//step-4
			String sqlCommand = "INSERT INTO STUDENTS("
					+ "student_id, first_name, last_name, date_of_birth, enrollment_date, session_name)"
					+ " VALUES(10, 'Sri','Vidya','1995-03-15','1999-03-25','Chemistry')";
			
			int noOfRowsInserted  = stmt.executeUpdate(sqlCommand);
			
			//step-5
			System.out.println("Inserted "+noOfRowsInserted + " row(s) successfully!");			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
