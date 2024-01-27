package com.cms;

import java.sql.*;
import java.util.Scanner;

public class JDBCCreateTableDemo {

	public JDBCCreateTableDemo() {

	}

	public static void main(String[] args) {

		// Steps to connect to our MySQL database named CMS

		// STEP 1: Loading the JDBC Driver
		// STEP 2: Create a Connection
		// STEP 3: Create a Statement
		// STEP 4: Execute the Statement (execute)
		// STEP 5: Display the successful table creation message

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
			// step-3
			Statement stmt = connection.createStatement();

			// step-4
			
				String sqlCommand = "CREATE TABLE instructors(id int,first_name varchar(80)) ";

				stmt.execute(sqlCommand);
				
				System.out.println("Created table successfully!");				
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
