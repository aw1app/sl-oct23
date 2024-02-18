<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<%@ include file="header.jsp" %>


<sql:setDataSource var="cms" url="jdbc:mysql://localhost:3306/cms"
	driver="com.mysql.cj.jdbc.Driver" user="root" password="rootroot" />

<sql:query dataSource="${cms}" var="result">	SELECT * FROM students	</sql:query>

<br> STUDENT LIST
<table border=1>
	<tr>		
		<th>FIRST NAME	
		<th>SHOW DETAILS
		<th>EDIT
		<th>DELETE
	</tr>

	<c:forEach var="row" items="${result.rows}">
		<tr>			
			<td><c:out value="${row.first_name}" />
			<td><a href="student-details.jsp?id=${row.student_id}" > SHOW DETAILS </a>
			<td><a href="student-edit.jsp?id=${row.student_id}" > EDIT </a>
			<td><a href="student-delete.jsp?id=${row.student_id}" > DELETE </a>
		</tr>
	</c:forEach>

</table>

