package com.cms;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = { "/includeDemo" })
public class IncludeDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<center><h1> IncludeDemo content </h1></center>");

		
		request.getRequestDispatcher("MyServlet2").include(request, response);
	}

}
