<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

Welcome 
<%
if (session.getAttribute("loggedIn").equals("true")){
	out.print(session.getAttribute("userId"));
}else{
	out.print("Anonymous User");
}
%>

<br><br>
<a href="logout.jsp">LOGOUT</a>

