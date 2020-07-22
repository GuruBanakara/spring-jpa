<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<link href="<c:url value='/resources/css/stylesheet.css' />"
	rel="stylesheet" type="text/css">
<meta charset="ISO-8859-1">

</head>
<body>


	<section>
		<div>
			<table>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Email ID</th>
				</tr>
				<c:forEach var="contact" items="${contacts}">
					<tr>
						<td>${contact.id}</td>
						<td>${contact.name}</td>
						<td>${contact.email}</td>
					</tr>
				</c:forEach>
			</table>

		</div>


	</section>


</body>
</html>