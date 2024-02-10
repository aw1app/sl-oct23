package com.ecommerce;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class DashboardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// request.getSession(false) : false means if no http session object was ever
		// created for this browser-session
		// then null be returned and don't create a new one.
		HttpSession session = request.getSession(false);

		if (session != null) {
			out.println("Welcome "+ session.getAttribute("userid"));
			out.println("<br> We are tracking you.");
		} else {
			// no session so no tracking.
			out.println("Welcome Anonymous User. I am Dashboard Servlet. We have not tracked you so far.");
			session = request.getSession(true);		
			out.println("We have just started tracking you.");
		}

		out.close();
	}

}
