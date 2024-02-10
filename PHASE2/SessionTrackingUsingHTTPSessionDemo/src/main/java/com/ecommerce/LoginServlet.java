package com.ecommerce;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String userId = request.getParameter("userid");
		String password = request.getParameter("passwd");
		
		if (userId.startsWith("admin") &&	password.equals("12345")) {
			HttpSession session =  request.getSession(true);
			
			session.setAttribute("userid", userId);
			response.sendRedirect("dash.html");
		}
		else {
			out.print("Invalid userid or password. Re login.");
			out.print("<br> <a href=\"login.html\">Login</a>");
		}
		
	}

}
