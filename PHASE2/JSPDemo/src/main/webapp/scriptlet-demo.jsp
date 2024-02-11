<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>


<% 

java.util.List<String> myList = new java.util.ArrayList<String>();

myList.add("Hi");
myList.add("Hello");

out.println(myList);

%>

<br><br>List of Items in the array list:

<ul>

<% for (int i = 0; i < myList.size(); i++) {%>

<li><%=myList.get(i)%> 

<%}%>

</ul>

<br>
If not using the scriptlet+expression, let's use only scriptlet tag like this.
<ul>

<% for (int i = 0; i < myList.size(); i++) {

	out.println("<li>"+myList.get(i));
}

%>

</ul>

challenge : Create a variable age and assign some value to it.
Then using a scriptlet, display if the user is eligible to vote or not. 