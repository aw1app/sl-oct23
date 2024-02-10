package com.ecommerce;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class JDBCServletQueryDemo extends HttpServlet {
	
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		
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
			Statement stmt = connection.createStatement();
			
			//step-4
			ResultSet resultSet  = stmt.executeQuery("SELECT * FROM STUDENTS");
			
			//step-5
			
			out.write("LIST OF STUDENTS <hr>");
			out.write("<table border=1>");
			out.write("<th>ID<th>FIRST NAME <th>LAST NAME <th>DOB <th>ENROLLMENT DATE <th>SESSION NAME");
			
			while(resultSet.next()) {
				int id  = resultSet.getInt("student_id");
				String first_name  = resultSet.getString("first_name");
				String lastName = resultSet.getString("last_name");
	            String dateOfBirth = resultSet.getString("date_of_birth");
	            String enrollmentDate = resultSet.getString("enrollment_date");
	            String session_name = resultSet.getString("session_name");
	            
	            out.println("<tr>" + "<td>" + id +
	                    "<td>" + first_name + "<td>" + lastName +
	                    "<td>" + dateOfBirth +
	                    "<td>" + enrollmentDate +
	                    "<td>" + session_name
	                    +"</tr>" 
	                    );
	            
			}
			
			out.write("</table>");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
		
		out.close();
		
	}


}
