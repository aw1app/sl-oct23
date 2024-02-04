package com.cms;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HomeServlet extends HttpServlet {
	Random random = new Random();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();		
		int sessId = random.nextInt();
		
		out.print("Content from HomeServlet ");	
		
		Cookie sessCookie = new Cookie("sessId", sessId+"");
		
		response.addCookie(sessCookie);
		
		out.close();
	}

}