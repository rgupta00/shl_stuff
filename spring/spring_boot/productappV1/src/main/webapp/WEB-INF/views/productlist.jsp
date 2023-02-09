<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>productlist champs list</title>
</head>
<body>
<table>
	<thead>
		<tr>
			<th>product id</th>
			<th>product name</th>
			<th>product price</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${products}" var="product">
			<tr>
				<td>${product.id }</td>
				<td>${product.name }</td>
				<td>${product.price }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>