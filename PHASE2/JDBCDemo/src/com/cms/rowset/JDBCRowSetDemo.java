package com.cms.rowset;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class JDBCRowSetDemo {

	public static void main(String[] args) {
		// JDBC URL, username, and password of MySQL server
		String jdbcUrl = "jdbc:mysql://localhost:3306/cms";
		String username = "root";
		String password = "rootroot";

		Connection connection = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {

			JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
			jdbcRowSet.setUrl(jdbcUrl);
			jdbcRowSet.setUsername(username);
			jdbcRowSet.setPassword(password);

			jdbcRowSet.setCommand("select * from students");

			jdbcRowSet.execute();

			System.out.println(" Fetch all rows \n");
			while (jdbcRowSet.next()) {
				int id = jdbcRowSet.getInt("student_id");
				String first_name = jdbcRowSet.getString("first_name");
				String lastName = jdbcRowSet.getString("last_name");
				String dateOfBirth = jdbcRowSet.getString("date_of_birth");
				String enrollmentDate = jdbcRowSet.getString("enrollment_date");
				String session_name = jdbcRowSet.getString("session_name");

				System.out.println(" ID: " + id + ", Name: " + first_name + " " + lastName + ", DOB: " + dateOfBirth
						+ ", Enrollment Date: " + enrollmentDate + ", Session Name: " + session_name);
			}

			System.out.println("\n\n ");

			// Go to the 3rd row
			System.out.println(" Fetch the 3rd row \n ");
			jdbcRowSet.absolute(3);
			int id = jdbcRowSet.getInt("student_id");
			String first_name = jdbcRowSet.getString("first_name");
			String lastName = jdbcRowSet.getString("last_name");
			String dateOfBirth = jdbcRowSet.getString("date_of_birth");
			String enrollmentDate = jdbcRowSet.getString("enrollment_date");
			String session_name = jdbcRowSet.getString("session_name");

			System.out.println(" ID: " + id + ", Name: " + first_name + " " + lastName + ", DOB: " + dateOfBirth
					+ ", Enrollment Date: " + enrollmentDate + ", Session Name: " + session_name);

			// Challenge: After going to the 3rd row How will you display rows(all rows) in
			// the reverse order

			System.out.println("\n\n ");
			System.out.println(" Fetch all rows in reverse from the current row (3) \n ");
			
			while (jdbcRowSet.previous()) {
				id = jdbcRowSet.getInt("student_id");
				first_name = jdbcRowSet.getString("first_name");
				String last_name = jdbcRowSet.getString("last_name");
				String dob = jdbcRowSet.getString("date_of_birth");
				String edate = jdbcRowSet.getString("enrollment_date");
				String sname = jdbcRowSet.getString("session_name");

				System.out.println("ID: " + id + ", First Name: " + first_name + ", Last Name: " + last_name
						+ ", Date Of Birth: " + dob + ", Date Of Enrollment: " + edate + ", Session Name: " + sname);
			}
			
			
			System.out.println("\n\n ");
			System.out.println(" Fetch all rows in reverse from the end\n ");
			
			jdbcRowSet.afterLast();
			
			while (jdbcRowSet.previous()) {
				id = jdbcRowSet.getInt("student_id");
				first_name = jdbcRowSet.getString("first_name");
				String last_name = jdbcRowSet.getString("last_name");
				String dob = jdbcRowSet.getString("date_of_birth");
				String edate = jdbcRowSet.getString("enrollment_date");
				String sname = jdbcRowSet.getString("session_name");

				System.out.println("ID: " + id + ", First Name: " + first_name + ", Last Name: " + last_name
						+ ", Date Of Birth: " + dob + ", Date Of Enrollment: " + edate + ", Session Name: " + sname);
			};
			
			// 
			System.out.println("\n\n ");
			System.out.println(" Inserting a new record \n ");
			
			jdbcRowSet.clearParameters();
			jdbcRowSet.setInt("student_id", 20);
			jdbcRowSet.setString("first_name", "A20");
			jdbcRowSet.setString("last_name", "B20");
			jdbcRowSet.setString("date_of_birth", "1999-01-01");
			jdbcRowSet.setString("enrollment_date", "2024-01-01");
			jdbcRowSet.setString("session_name", "ZUMBA");
			
			jdbcRowSet.insertRow();
			

		} catch (SQLException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getErrorCode());			
			
		}

	}

}
