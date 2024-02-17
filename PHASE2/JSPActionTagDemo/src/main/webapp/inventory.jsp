<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

INVENTORY JSP

<jsp:useBean id="product1" class="com.ecommerce.Product" scope="session"></jsp:useBean>

<br><br>
There is a new product arrived with the following details:<br>
Name: <jsp:getProperty name="product1" property="name" /> <br>
Price: <jsp:getProperty name="product1" property="price" /> <br>