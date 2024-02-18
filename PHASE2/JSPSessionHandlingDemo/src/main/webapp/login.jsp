<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%
String userId = request.getParameter("userId");
String pwd = request.getParameter("password");

	// Business logic
	if (userId == null || userId.equals("") || pwd == null || pwd.equals("")) {
		response.sendRedirect("login.html");
	}
	else{
		session.setAttribute("userId", userId);
		session.setAttribute("loggedIn", "true");
		response.sendRedirect("user-profile.jsp");
	}
	
%>