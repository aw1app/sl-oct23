package com.cms;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DashboardServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		
		String sessIdentifier = request.getParameter("sessId");
		
		if(sessIdentifier!=null)		
		out.print("Hey user, looks like you have visited more than 1 page on this site!. I am Dashboard servlet.");
		
		else 
			out.print("I am Dashboard servlet. "
					+ "Looks like you have visited me first on this site, and not gone to any other servlet yet!. ");
		
		
		out.close();
	}

}
