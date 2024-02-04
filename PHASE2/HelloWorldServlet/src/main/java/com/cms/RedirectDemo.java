package com.cms;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = { "/redirectDemo" })
public class RedirectDemo extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// This content will be discarded if you do redirect
		out.println("<center><h1> RedirectDemo content </h1></center>");

		response.sendRedirect("MyServlet2");
	}

}
