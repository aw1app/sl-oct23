<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<%@ include file="header.jsp" %><br><br>

<sql:setDataSource var="cms" url="jdbc:mysql://localhost:3306/cms"
	driver="com.mysql.cj.jdbc.Driver" user="root" password="rootroot" />

<sql:update dataSource="${cms}" var="count">	
				INSERT INTO students VALUES (
				null,
				'<%=request.getParameter("first_name")%>',
				'<%=request.getParameter("last_name")%>',
				'<%=request.getParameter("date_of_birth")%>',
				'<%=request.getParameter("enrollment_date")%>',
				'<%=request.getParameter("session_name")%>'  
				) 
</sql:update>

Inserted <c:out value="${count}" /> no of students.
<!--  After inserting, go back to list page to show the refreshed list -->
<!-- <jsp:forward page="query-demo-v2.jsp"></jsp:forward> -->

<% response.sendRedirect("query-demo-v2.jsp"); %>