<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:if test="${student != null }">

	<li>${student.studentId}
	<li>${student.firstName}
	<li>${student.lastName}
	<li>${student.dateOfBirth}
	<li>${student.enrollmentDate}
	<li>${student.sessionName}
</c:if>

<c:if test="${student == null }"> No such Student with the id!! </c:if>

<br><br>
<a href="/index.jsp" > Back to HOME</a>