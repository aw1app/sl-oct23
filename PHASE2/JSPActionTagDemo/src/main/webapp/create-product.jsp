<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
Version 1<br>

<jsp:useBean id="product1" class="com.ecommerce.Product">

	<jsp:setProperty property="name" param="name" name="product1"/>
	<jsp:setProperty property="price" param="price" name="product1" />

</jsp:useBean>

<br><br>
Got a new product creation request with the following details:<br>
Name: <jsp:getProperty name="product1" property="name" /> <br>
Price: <jsp:getProperty name="product1" property="price" /> <br>