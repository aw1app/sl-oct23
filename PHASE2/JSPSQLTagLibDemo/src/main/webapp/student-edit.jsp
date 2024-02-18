<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<%@ include file="header.jsp" %><br><br>

<sql:setDataSource var="cms" url="jdbc:mysql://localhost:3306/cms"
	driver="com.mysql.cj.jdbc.Driver" user="root" password="rootroot" />

<sql:query dataSource="${cms}" var="result">	
SELECT * FROM students where student_id=<%=request.getParameter("id") %>	
</sql:query>

<center>Edit Student</center>


<form action="student-edit-save.jsp" method="post">	
	<input type="hidden" name="student_id" value="${result.rows[0].student_id}"> <br>
	First Name : <input name="first_name" value="${result.rows[0].first_name}"> <br>
	Last Name : <input name="last_name" value="${result.rows[0].last_name}"> <br>
	DOB : <input name="date_of_birth" value="${result.rows[0].date_of_birth}"> <br>
	Enrollment Date : <input name="enrollment_date" value="${result.rows[0].enrollment_date}" > <br>
	Session Name : <input name="session_name" value="${result.rows[0].session_name}"> <br>
	
	<br><input type="submit" value="EDIT & SAVE"> <br>
	
	
</form>

<a href="index.jsp"> Back to Home</a>