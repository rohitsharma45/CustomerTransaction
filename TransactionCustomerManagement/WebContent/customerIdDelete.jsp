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
<form action = "delete.obj" modelAttribut="">
<table align = "center">
	<tr>
		<td>Enter Id to be deleted:</td>
		<td>

			<select id="customerId"  name = "customerId" style="width: 200px;">
			<option><c:out value=""></c:out></option>
			<c:forEach items = "${idList}" var = "list">
				<option><c:out value="${list}">${list}</c:out></option>
			</c:forEach>
					
			</select>
		</td>
		<td><input type = "submit" value = "submit"/></td>
	</tr>

</table>

</body>
</html>