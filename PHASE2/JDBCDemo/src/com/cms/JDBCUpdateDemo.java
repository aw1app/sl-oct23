package com.cms;

import java.sql.*;
import java.util.Scanner;

public class JDBCUpdateDemo {

	public JDBCUpdateDemo() {

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
			// step-3
			Statement stmt = connection.createStatement();

			// step-4
			Scanner sc = new Scanner(System.in);
			while (true) {
				
				System.out.println("ENTER row(student_id) you to update? Enter -1 to quit :");				
				int id = sc.nextInt();
				
				if(id==-1)break;
				
				System.out.println("Update first_name as:");
				String first_name = sc.next();
				
				String sqlCommand = "UPDATE STUDENTS SET first_name='" +first_name +  "' where student_id="+ id;

				int noOfRowsUpdated = stmt.executeUpdate(sqlCommand);

				// step-5
				System.out.println("Updated " + noOfRowsUpdated + " row(s) successfully!");

				System.out.println("Update another row?: Y / N :");
				String answer = sc.next();
				if (!answer.equalsIgnoreCase("Y"))
					break;
			}
			sc.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
