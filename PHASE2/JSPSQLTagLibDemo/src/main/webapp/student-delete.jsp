<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<sql:setDataSource var="cms" url="jdbc:mysql://localhost:3306/cms"
	driver="com.mysql.cj.jdbc.Driver" user="root" password="rootroot" />

<sql:update dataSource="${cms}" var="count">	
DELETE FROM students where student_id=<%=request.getParameter("id") %>	
</sql:update>

Deleted <c:out value="${count}" /> no of students.
<!--  After deleting, go back to list page to show the refreshed list -->
<jsp:forward page="query-demo-v2.jsp"></jsp:forward>