package com.cms;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/addBatch" })
public class AddBatchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String batchName = request.getParameter("batch-name");
		String batchInstructor = request.getParameter("batch-instructor");
		String batchStart = request.getParameter("batch-start");
		String batchEnd = request.getParameter("batch-start");
		String batchType = request.getParameter("batch-type");
		
		// To process a checkbox, which is multivalued, use request.getParameterValues.
		// Same for multi- selection list
		String[] batchPrerquesties = request.getParameterValues("batch-prerequistes"); 
		
		out.println("<p> Thank you for adding a new batch!</p>");
		
		out.printf(" You Submitted BatchName = %s %s %s %s %s %s <br>",
				batchName,batchInstructor,batchStart,batchEnd,batchType, Arrays.toString(batchPrerquesties ));

		out.close();		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
	
	/*
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String batchName = request.getParameter("batch-name");
		String batchInstructor = request.getParameter("batch-instructor");
		String batchStart = request.getParameter("batch-start");
		String batchEnd = request.getParameter("batch-start");
		String batchType = request.getParameter("batch-type");
		
		out.println("<p> Thank you for adding a new batch!</p>");
		
		out.printf(" You Submitted BatchName = %s %s %s %s %s <br>",batchName,batchInstructor,batchStart,batchEnd,batchType  );

		out.close();
	}
	*/

}
