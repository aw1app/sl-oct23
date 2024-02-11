<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*"  errorPage="error1.jsp" %>

    
 <br>
List Demo
<%
	List<String> myList = new ArrayList<String>();
	myList.add("Hi");
	myList.add("Hello");
%>

 <br>
List item remove Demo
<%
myList.remove(5);
%>