package com.cms;

import java.sql.*;

public class JDBCQueryUsingPrepaperStatementDemo {

	public JDBCQueryUsingPrepaperStatementDemo() {

	}

	public static void main(String[] args) {

		// Steps to connect to our MySQL database named CMS

		// STEP 1: Loading the JDBC Driver
		// STEP 2: Create a Connection
		// STEP 3: Create a PreparedStatement
		// STEP 4: Execute the PreparedStatement (Query) and get the results (rows of data from
		// the table)
		// STEP 5: Display the results data by looping through the results(rows)

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
			PreparedStatement pStmt = connection.prepareStatement("SELECT * FROM STUDENTS");
			
			//step-4 (set the parmeters)
			
			
			ResultSet resultSet  = stmt.executeQuery("SELECT * FROM STUDENTS");
			
			//step-5
			
			while(resultSet.next()) {
				int id  = resultSet.getInt("student_id");
				String first_name  = resultSet.getString("first_name");
				String lastName = resultSet.getString("last_name");
	            String dateOfBirth = resultSet.getString("date_of_birth");
	            String enrollmentDate = resultSet.getString("enrollment_date");
	            String session_name = resultSet.getString("session_name");
	            
	            System.out.println(" ID: " + id +
	                    ", Name: " + first_name + " " + lastName +
	                    ", DOB: " + dateOfBirth +
	                    ", Enrollment Date: " + enrollmentDate +
	                    ", Session Name: " + session_name
	                    );
	            
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
