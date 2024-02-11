<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<h1>Hello World</h1>

<br>
Declaration Tag Demo

<%!String name = "Teja";%>

<%!
String name2 = "Bala";
	float age = 200.25f;%>

<%!
public int add(int a, int b) {

	return a + b;
};
%>

<!-- Define a class -->
<%!

class Instructor{
	String name;
	int age;	
};

%>


<br>
Expression Tag Demo Current date and time is :
<h2>
	<%=new java.util.Date()%>
</h2>

<br>
<%="Hello Hello"%>

<br>
Name of person 1 is <%=name%>
<br>
Name of person 2 is <%=name2%>and age is <%=age%>


<br>
2 + 67 is <%= add(2,67) %> 

<

