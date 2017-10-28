<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table align = "center">
			<tr><td colspan = "2"><h1>Trainee Information.</h1></td></tr>
			
			<tr><td>Customer Id:</td><td>${k.customerId}</td></tr>
			<tr><td>Customer Name:</td><td>${k.customerName}</td></tr>
			<tr><td>Customer City:</td><td>${k.location}</td></tr>
			<tr><td>Customer Domain:</td><td>${k.domain}</td></tr>		
</table>
<h2 align = "center">
<u><a href = "goFindAll.obj">Show Table</a></u>
&nbsp;&nbsp;&nbsp;&nbsp;
<u><a href = "choice.obj">Go Back to Home</a></u>
</h2>
</body>
</html>