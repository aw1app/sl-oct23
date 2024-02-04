package com.cms;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/MyServlet2")
public class MyServlet2 extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("INSIDE do Get ");
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		out.println("<center><h1> Content from  MyServlet2 Servlet,  </h1></center>");

		out.close();
	}
}