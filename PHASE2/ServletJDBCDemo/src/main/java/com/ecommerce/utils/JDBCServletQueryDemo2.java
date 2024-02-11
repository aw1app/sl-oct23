package com.ecommerce.utils;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class JDBCServletQueryDemo2 extends HttpServlet {
	Connection connection = null;

	// In this servlet,we use the  JDBCUtil to the load the driver and also create/return a connection.
	public void init(ServletConfig config) {

		JDBCUtil jdbcUtil;
		try {
			jdbcUtil = new JDBCUtil(config.getInitParameter("DATABASE_URL"),
					config.getInitParameter("DATABASE_ADMIN_ID"), config.getInitParameter("DATABASE_ADMIN_PASSWORD"));
			connection = jdbcUtil.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		try {
			// step-3
			Statement stmt = connection.createStatement();

			// step-4
			ResultSet resultSet = stmt.executeQuery("SELECT * FROM STUDENTS");

			// step-5

			out.write("LIST OF STUDENTS <hr>");
			out.write("<table border=1>");
			out.write("<th>ID<th>FIRST NAME <th>LAST NAME <th>DOB <th>ENROLLMENT DATE <th>SESSION NAME");

			while (resultSet.next()) {
				int id = resultSet.getInt("student_id");
				String first_name = resultSet.getString("first_name");
				String lastName = resultSet.getString("last_name");
				String dateOfBirth = resultSet.getString("date_of_birth");
				String enrollmentDate = resultSet.getString("enrollment_date");
				String session_name = resultSet.getString("session_name");

				out.println("<tr>" + "<td>" + id + "<td>" + first_name + "<td>" + lastName + "<td>" + dateOfBirth
						+ "<td>" + enrollmentDate + "<td>" + session_name + "</tr>");

			}

			out.write("</table>");

			out.write("<br><br><a href=\"index.html\">Go back to Home Page</a>");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		out.close();

	}

//	public void destroy() {
//		try {
//			connection.close();
//		} catch (SQLException e) {			
//			e.printStackTrace();
//		}
}