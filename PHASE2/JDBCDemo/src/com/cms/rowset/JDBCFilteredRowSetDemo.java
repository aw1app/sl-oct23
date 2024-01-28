package com.cms.rowset;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.RowSet;
import javax.sql.rowset.FilteredRowSet;
import javax.sql.rowset.Predicate;
import javax.sql.rowset.RowSetProvider;

public class JDBCFilteredRowSetDemo {

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
			};
			

			filteredRowSet.beforeFirst();
			filteredRowSet.setFilter(new NameStartWithAFilter());
			
			System.out.println(" Fetch all the filtered rows \n\n");
			while (filteredRowSet.next()) {
				int id = filteredRowSet.getInt("student_id");
				String first_name = filteredRowSet.getString("first_name");
				String lastName = filteredRowSet.getString("last_name");
				String dateOfBirth = filteredRowSet.getString("date_of_birth");
				String enrollmentDate = filteredRowSet.getString("enrollment_date");
				String session_name = filteredRowSet.getString("session_name");

				System.out.println(" ID: " + id + ", Name: " + first_name + " " + lastName + ", DOB: " + dateOfBirth
						+ ", Enrollment Date: " + enrollmentDate + ", Session Name: " + session_name);
			};

			filteredRowSet.close();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Inside SQLException block ");
			System.out.println(e.getMessage());
			System.out.println(e.getErrorCode());
		} 

	}

}

class NameStartWithAFilter implements Predicate {

	@Override
	public boolean evaluate(RowSet rs) {

		try {
			
			return rs.getString("first_name").startsWith("A");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean evaluate(Object value, int column) throws SQLException {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean evaluate(Object value, String columnName) throws SQLException {
		throw new UnsupportedOperationException();
	}

}
