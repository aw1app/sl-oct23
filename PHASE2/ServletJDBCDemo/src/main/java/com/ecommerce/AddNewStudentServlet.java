package com.ecommerce;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddNewStudentServlet extends HttpServlet {
	
	Connection connection = null;

	public void init(ServletConfig config) {
		try {
			// Step-1
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Step-2
			
			ServletContext sc = config.getServletContext();
			
			connection = DriverManager.getConnection(
					sc.getInitParameter("DATABASE_URL"),
					sc.getInitParameter("DATABASE_ADMIN_ID"),
					sc.getInitParameter("DATABASE_ADMIN_PASSWORD")
					);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
				
		try {
			Statement stmt = connection.createStatement();
			
			String sqlUpdateStr = String.format(
					"INSERT INTO STUDENTS VALUES(null,'%s','%s','%s','%s','%s')",
					request.getParameter("first_name"),
					request.getParameter("last_name"),
					request.getParameter("dob"),
					request.getParameter("enrollment_date"),
					request.getParameter("session_name")
					);
			
			int rowCount = stmt.executeUpdate(sqlUpdateStr);
			
			out.printf("<br> <b>Successfully inserted </b> %s student. ",rowCount);
			
		} catch (SQLException e) {			
			e.printStackTrace();
			out.printf("Insert Failed!!");
		}
		
		out.close();
		
	}


}
