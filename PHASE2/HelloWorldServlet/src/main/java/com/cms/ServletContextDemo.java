package com.cms;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = { "/ServletContextDemo" })
public class ServletContextDemo extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// This content will be discarded if you do redirect
		out.println("<center><h1> ServletContextDemo content </h1></center>");
		
		ServletContext sc = this.getServletContext();
		
		out.printf("<br> Info about this deployment : %s <br> ", sc.getServerInfo()) ; 

		out.close();
	}

}
