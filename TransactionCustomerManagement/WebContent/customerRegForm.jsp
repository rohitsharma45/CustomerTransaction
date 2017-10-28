<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action = "reg.obj" command = "trainee" modelAttribute="trainee">
<table align = "center">
<tr><td colspan = "2"><h1 align = "center">Registration Form</h1></td></tr>
<tr><td>Customer Id:</td>
<td><form:input path = "customerId"/>
<form:errors path = "customerId"/></td></tr>
<tr><td>Customer Name:</td>
<td><form:input path = "customerName"/>
<form:errors path = "customerName"/>
</td></tr>
<tr><td>Customer City:</td>
<td><form:input path = "location"/>
<form:errors path = "location"/>
</td></tr>
<tr><td>Customer Domain:</td>
<td><form:input path = "domain"/>
<form:errors path = "domain"/>
</td></tr>
<tr>
<td></td>
<td><input type = "submit" value = "submit"/>
</td></tr>
</table>
</form:form>

</body>
</html>