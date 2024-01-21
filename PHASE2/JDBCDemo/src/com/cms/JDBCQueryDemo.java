package com.cms;

import java.sql.*;

public class JDBCQueryDemo {

	public JDBCQueryDemo() {

	}

	public static void main(String[] args) {

		// Steps to connect to our MySQL database named CMS

		// STEP 1: Loading the JDBC Driver
		// STEP 2: Create a Connection
		// STEP 3: Create a Statement
		// STEP 4: Execute the Statement (Query) and get the results (rows of data from
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

	}

}
