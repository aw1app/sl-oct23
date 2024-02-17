<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<sql:setDataSource var="cms" url="jdbc:mysql://localhost:3306/cms"
	driver="com.mysql.cj.jdbc.Driver" user="root" password="rootroot" />

<sql:query dataSource="${cms}" var="result">	SELECT * FROM students	</sql:query>

<br> STUDENT LIST
<table border=1>
	<tr>
		<th>student_id
		<th>first_name
		<th>last_name
		<th>date_of_birth
		<th>enrollment_date
		<th>session_name
	</tr>

	<c:forEach var="row" items="${result.rows}">
		<tr>
			<td><c:out value="${row.student_id}" />
			<td><c:out value="${row.first_name}" />
			<td><c:out value="${row.last_name}" />
			<td><c:out value="${row.date_of_birth}" />
			<td><c:out value="${row.enrollment_date}" />
			<td><c:out value="${row.session_name}" />
		</tr>
	</c:forEach>

</table>

<br> CHALENGE-1: Code a similar JSP, but that fetches only the student's first name and last name
 and displayed so.
<br> CHALENGE-1-SOLUTION: 
<sql:query dataSource="${cms}" var="result">Select first_name, last_name from students</sql:query>
 
<br> CHALENGE-2: Code a similar JSP, that will get a request parameter id, and it will display 
all column values of that particular student id.
 
 