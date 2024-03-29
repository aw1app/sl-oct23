package com.cms;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletConfigDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig config) {
		System.out.println("INSIDE init ");

		String dbPassword = config.getInitParameter("DB_PASSWORD");
		System.out.println(" DB_PASSWORD that was set in the init-param is  " + dbPassword);

	}

	@Override
	public void destroy() {
		System.out.println("INSIDE destroy ");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("INSIDE do Get ");
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		out.println("<center><h1> Content from  ServletConfigDemo Servlet,  </h1></center>");

		out.close();
	}
}