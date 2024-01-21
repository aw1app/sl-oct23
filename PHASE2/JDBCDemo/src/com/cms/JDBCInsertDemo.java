package com.cms;

import java.sql.*;
import java.util.Scanner;

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
			// step-3
			Statement stmt = connection.createStatement();

			// step-4
			Scanner sc = new Scanner(System.in);
			while (true) {
				System.out.println("Id:");
				int id = sc.nextInt();
				System.out.println("first_name:");
				String first_name = sc.next();
				System.out.println("last_name:");
				String last_name = sc.next();
				System.out.println("date_of_birth");
				String date_of_birth = sc.next();
				System.out.println("enrollment_date:");
				String enrollment_date = sc.next();
				System.out.println("session_name:");
				String session_name = sc.next();

				String sqlCommand = "INSERT INTO STUDENTS("
						+ "student_id, first_name, last_name, date_of_birth, enrollment_date, session_name)"
						+ " VALUES( " + id + ", '" + first_name + "','" + last_name + "','" + date_of_birth + "','"
						+ enrollment_date + "','" + session_name + "')";

				int noOfRowsInserted = stmt.executeUpdate(sqlCommand);

				// step-5
				System.out.println("Inserted " + noOfRowsInserted + " row(s) successfully!");

				System.out.println("Insert another row?: Y / N :");
				String answer = sc.next();
				if (!answer.equalsIgnoreCase("Y"))
					break;
			}
			sc.close();

			// CHALLENGE: Take the new row values like id, first_name . etc from command
			// line
			// and then insert the row.

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
