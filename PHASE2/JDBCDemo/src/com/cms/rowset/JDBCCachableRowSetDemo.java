package com.cms.rowset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class JDBCCachableRowSetDemo {

	public static void main(String[] args) {
		// JDBC URL, username, and password of MySQL server
		String jdbcUrl = "jdbc:mysql://localhost:3306/cms";
		String username = "root";
		String password = "rootroot";

		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            // Disable autocommit
			connection.setAutoCommit(false);

			CachedRowSet cachedRowSet = RowSetProvider.newFactory().createCachedRowSet();
			
			cachedRowSet.setUrl(jdbcUrl);
			cachedRowSet.setUsername(username);
			cachedRowSet.setPassword(password);

			cachedRowSet.setCommand("select * from students");

			cachedRowSet.execute();

			System.out.println(" Fetch all rows \n");
			while (cachedRowSet.next()) {
				int id = cachedRowSet.getInt("student_id");
				String first_name = cachedRowSet.getString("first_name");
				String lastName = cachedRowSet.getString("last_name");
				String dateOfBirth = cachedRowSet.getString("date_of_birth");
				String enrollmentDate = cachedRowSet.getString("enrollment_date");
				String session_name = cachedRowSet.getString("session_name");

				System.out.println(" ID: " + id + ", Name: " + first_name + " " + lastName + ", DOB: " + dateOfBirth
						+ ", Enrollment Date: " + enrollmentDate + ", Session Name: " + session_name);
			}

			System.out.println("\n\n ");

			// Go to the 3rd row
			System.out.println(" Fetch the 3rd row \n ");
			cachedRowSet.absolute(3);
			int id = cachedRowSet.getInt("student_id");
			String first_name = cachedRowSet.getString("first_name");
			String lastName = cachedRowSet.getString("last_name");
			String dateOfBirth = cachedRowSet.getString("date_of_birth");
			String enrollmentDate = cachedRowSet.getString("enrollment_date");
			String session_name = cachedRowSet.getString("session_name");

			System.out.println(" ID: " + id + ", Name: " + first_name + " " + lastName + ", DOB: " + dateOfBirth
					+ ", Enrollment Date: " + enrollmentDate + ", Session Name: " + session_name);

			// Challenge: After going to the 3rd row How will you display rows(all rows) in
			// the reverse order

			System.out.println("\n\n ");
			System.out.println(" Fetch all rows in reverse from the current row (3) \n ");
			
			while (cachedRowSet.previous()) {
				id = cachedRowSet.getInt("student_id");
				first_name = cachedRowSet.getString("first_name");
				String last_name = cachedRowSet.getString("last_name");
				String dob = cachedRowSet.getString("date_of_birth");
				String edate = cachedRowSet.getString("enrollment_date");
				String sname = cachedRowSet.getString("session_name");

				System.out.println("ID: " + id + ", First Name: " + first_name + ", Last Name: " + last_name
						+ ", Date Of Birth: " + dob + ", Date Of Enrollment: " + edate + ", Session Name: " + sname);
			}
			
			
			System.out.println("\n\n ");
			System.out.println(" Fetch all rows in reverse from the end\n ");
			
			cachedRowSet.afterLast();
			
			while (cachedRowSet.previous()) {
				id = cachedRowSet.getInt("student_id");
				first_name = cachedRowSet.getString("first_name");
				String last_name = cachedRowSet.getString("last_name");
				String dob = cachedRowSet.getString("date_of_birth");
				String edate = cachedRowSet.getString("enrollment_date");
				String sname = cachedRowSet.getString("session_name");

				System.out.println("ID: " + id + ", First Name: " + first_name + ", Last Name: " + last_name
						+ ", Date Of Birth: " + dob + ", Date Of Enrollment: " + edate + ", Session Name: " + sname);
			};
			
			// 
			System.out.println("\n\n ");
			System.out.println(" Inserting a new record \n ");
			
			cachedRowSet.clearParameters();
			
			cachedRowSet.moveToInsertRow();
			
			cachedRowSet.updateInt("student_id", 22);
			cachedRowSet.updateString("first_name", "A22");
			cachedRowSet.updateString("last_name", "B22");
			cachedRowSet.updateString("date_of_birth", "1999-01-01");
			cachedRowSet.updateString("enrollment_date", "2024-01-01");
			cachedRowSet.updateString("session_name", "ZUMBA");
			
			cachedRowSet.insertRow();
			cachedRowSet.moveToCurrentRow();
			
			// Assuming that we want change first_name of 5th row
			System.out.println("\n\n ");
			System.out.println(" Updating 5th record firstname to \n AAA AAA AAA AAA 20");
			cachedRowSet.absolute(5);
			cachedRowSet.moveToCurrentRow();
			cachedRowSet.updateString("first_name", "AAA AAA AAA AAA 20");
			cachedRowSet.updateRow();
			
			cachedRowSet.acceptChanges(connection);
			//cachedRowSet.close();
			

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Inside SQLException block ");
			System.out.println(e.getMessage());
			System.out.println(e.getErrorCode());			
			
		}

	}

}
