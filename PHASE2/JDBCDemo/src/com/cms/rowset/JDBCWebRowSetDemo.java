package com.cms.rowset;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.WebRowSet;

public class JDBCWebRowSetDemo  {
	
	public static void main(String[] args) {
		//WebRowSet2XML();
		
		XML2WebRowSet();
	}
	
	public static void XML2WebRowSet() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try  {
			WebRowSet webRowSet = RowSetProvider.newFactory().createWebRowSet();
			
			webRowSet.readXml(new FileReader ("F:\\Users\\home\\git\\sl-oct23\\PHASE2\\JDBCDemo\\students.xml" ));
			 
			System.out.println(" Reading all rows from tghe saved xml file \n");
			while (webRowSet.next()) {
				int id = webRowSet.getInt("student_id");
				String first_name = webRowSet.getString("first_name");
				String lastName = webRowSet.getString("last_name");
				String dateOfBirth = webRowSet.getString("date_of_birth");
				String enrollmentDate = webRowSet.getString("enrollment_date");
				String session_name = webRowSet.getString("session_name");

				System.out.println(" ID: " + id + ", Name: " + first_name + " " + lastName + ", DOB: " + dateOfBirth
						+ ", Enrollment Date: " + enrollmentDate + ", Session Name: " + session_name);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void WebRowSet2XML() {
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

			WebRowSet webRowSet = RowSetProvider.newFactory().createWebRowSet();

			webRowSet.setUrl(jdbcUrl);
			webRowSet.setUsername(username);
			webRowSet.setPassword(password);

			webRowSet.setCommand("select * from students ");

			webRowSet.execute();

			System.out.println(" Fetch all rows \n");
			while (webRowSet.next()) {
				int id = webRowSet.getInt("student_id");
				String first_name = webRowSet.getString("first_name");
				String lastName = webRowSet.getString("last_name");
				String dateOfBirth = webRowSet.getString("date_of_birth");
				String enrollmentDate = webRowSet.getString("enrollment_date");
				String session_name = webRowSet.getString("session_name");

				System.out.println(" ID: " + id + ", Name: " + first_name + " " + lastName + ", DOB: " + dateOfBirth
						+ ", Enrollment Date: " + enrollmentDate + ", Session Name: " + session_name);
			}

			webRowSet.writeXml(new FileWriter("F:\\Users\\home\\git\\sl-oct23\\PHASE2\\JDBCDemo\\students.xml"));

			webRowSet.close();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Inside SQLException block ");
			System.out.println(e.getMessage());
			System.out.println(e.getErrorCode());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
