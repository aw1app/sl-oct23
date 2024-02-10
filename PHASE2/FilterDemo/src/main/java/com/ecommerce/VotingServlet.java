package com.ecommerce;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class VotingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside VotingServlet doPost");
		
		PrintWriter pw = response.getWriter();

		
		pw.write("You are eligible to vote!. Your vote has been recoreded. Thank you for casting your vote. ");
		
		pw.close();
	}

}