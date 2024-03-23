<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:forEach var="student" items="${students}" >   
   ${student.firstName}, ${student.lastName}, ${student.dateOfBirth}, ${student.enrollmentDate}, ${student.sessionName}<br>
</c:forEach>

<br><br>
CHALLENGE-1: Format the above output into a nice table <br>
CHALLENGE-2: Research and see how would add a new student