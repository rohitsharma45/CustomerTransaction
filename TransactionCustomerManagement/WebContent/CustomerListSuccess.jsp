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
<table align = "center" cellpadding="5" style='font-family:"Courier New", Courier, monospace; font-size:120%'>
<tr><td colspan = "5"><h1 align = "center">Trainee  list Information.</h1></td></tr>
<tr>
	<th>ID</th>
	<th>NAME</th>
	<th>CITY</th>
	<th>DOMAIN</th>
</tr>
	<c:forEach items = "${list}" var = "l">
			<tr>
				<td><c:out value="${l.customerId}"></c:out></td>
				<td><c:out value="${l.customerName}"></c:out></td>
				<td><c:out value="${l.location}"></c:out></td>
				<td><c:out value="${l.domain}"></c:out></td>
			</tr>
	</c:forEach>
</table> 
	<h2 align = "center"><u><a href = "choice.obj">Go Back to Home</a></u></h2>
</body>
</html>