<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" %>

    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
    <c:set var="x" value="10050"></c:set>
    
    Value of x is : <c:out value="${x}" />
    
    <br><br> Conditional JSTL Tag dmo
    <c:if test="${x>10000}">
    x is GT 10000
    </c:if>
    
    <br><br> JSTL looping Tag demo
    <c:set var="fruits" value="${['Apple', 'Banana', 'Orange', 'Mango']}" />
    
    <ul>
        <c:forEach var="fruit" items="${fruits}">
            <li>${fruit}</li>
        </c:forEach>
    </ul>
    
    
    <hr><br><br>Formatting JSTL examples <hr>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    
     <c:set var="date1" value="<%=new java.util.Date()%>"/>
     <p>Formatted Date dd-MM-yyyy: <fmt:formatDate value="${date1}" pattern="dd-MM-yyyy" /></p>
      <p>Formatted Date dd-MMM-yy: <fmt:formatDate value="${date1}" pattern="dd-MMM-yy" /></p>
     
     
     <hr><br><br>Our own custom taglib <hr>
     <%@ taglib uri="WEB-INF/bulletlist.tld" prefix="bl" %>
     <bl:bulletlist items="Laptop,Monitor" />
     