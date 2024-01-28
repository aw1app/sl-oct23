package com.cms.rowset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.RowSet;
import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.FilteredRowSet;
import javax.sql.rowset.RowSetProvider;

public class JDBCRowSetEventListeningDemo {

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

			FilteredRowSet filteredRowSet = RowSetProvider.newFactory().createFilteredRowSet();

			filteredRowSet.setUrl(jdbcUrl);
			filteredRowSet.setUsername(username);
			filteredRowSet.setPassword(password);

			filteredRowSet.setCommand("select * from students ");

			filteredRowSet.execute();
			
			filteredRowSet.addRowSetListener(new MyListener());

			System.out.println(" Fetch all rows (as obtained from the DB) \n \n");
			while (filteredRowSet.next()) {
				int id = filteredRowSet.getInt("student_id");
				String first_name = filteredRowSet.getString("first_name");
				String lastName = filteredRowSet.getString("last_name");
				String dateOfBirth = filteredRowSet.getString("date_of_birth");
				String enrollmentDate = filteredRowSet.getString("enrollment_date");
				String session_name = filteredRowSet.getString("session_name");

				System.out.println(" ID: " + id + ", Name: " + first_name + " " + lastName + ", DOB: " + dateOfBirth
						+ ", Enrollment Date: " + enrollmentDate + ", Session Name: " + session_name);
			}

			filteredRowSet.close();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Inside SQLException block ");
			System.out.println(e.getMessage());
			System.out.println(e.getErrorCode());
		}

	}

}

class MyListener implements RowSetListener {
	public void cursorMoved(RowSetEvent event) {
		try {
			System.out.println("Cursor Moved...to ID " + ( (RowSet) event.getSource() ).getInt("student_id")  + "\n");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	public void rowChanged(RowSetEvent event) {
		System.out.println("Cursor Changed...");
	}

	public void rowSetChanged(RowSetEvent event) {
		System.out.println("RowSet changed...");
	}
}
