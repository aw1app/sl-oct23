<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>All Courses</h1>
<table border="1">
	<tr>
		<th>ID</th>
		<th>Name</th>
	</tr>
	<c:forEach var="course" items="${courses}">
		<tr>
			<td>${course.id}</td>
			<td>${course.name}</td>
		</tr>
	</c:forEach>
</table>


<br><br><br><br>
<a href="/">Back to Home</a>