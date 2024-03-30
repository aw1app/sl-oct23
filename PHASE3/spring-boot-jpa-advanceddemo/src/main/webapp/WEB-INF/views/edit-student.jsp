<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<h2>EDIT STUDENT</h2>

<div align="center">

	<form:form action="edit-student" method="POST" modelAttribute="student">
	
	<form:input path="studentId" value="${student.studentId}" hidden="true"/>

		<form:label path="firstName">First name:</form:label>
		<form:input path="firstName" value="${student.firstName}"/>
		<br />
		
		
		<form:label path="lastName">Last name:</form:label>
		<form:input path="lastName" value="${student.lastName}"/>
		<br />
				
		
		<form:label path="dateOfBirth">DOB:</form:label>
		<form:input path="dateOfBirth" value="${student.dateOfBirth}"/>
		<br />
		
		
		<form:label path="enrollmentDate">Enrollment Date:</form:label>
		<form:input path="enrollmentDate" value="${student.enrollmentDate}"/>
		<br />
		
		
		<form:label path="sessionName">Session name:</form:label>
		<form:input path="sessionName" value="${student.sessionName}"/>
		<br />
		
		<br />	
		

		<form:button>Save Student</form:button>

	</form:form>
	
<br><br>
<a href="/index.jsp" > Back to HOME</a>