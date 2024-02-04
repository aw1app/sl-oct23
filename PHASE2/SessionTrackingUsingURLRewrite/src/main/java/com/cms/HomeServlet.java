package com.cms;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class HomeServlet extends HttpServlet {
	Random random = new Random();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();		
		int sessId = random.nextInt();
		
		out.print("Content from HomeServlet ");
		
		response.sendRedirect("dash.html?sessId="+sessId);
		
		out.close();
	}

}