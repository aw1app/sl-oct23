<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>All Students</h1>
<table border="1">
	<tr>
		<th>ID</th>
		<th>Name</th>
	</tr>
	<c:forEach var="student" items="${students}">
		<tr>
			<td>${student.studentId}</td>
			<td>${student.firstName}</td>
		</tr>
	</c:forEach>
</table>