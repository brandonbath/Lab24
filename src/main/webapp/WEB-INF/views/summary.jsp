<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Summary</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/sketchy/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-N8DsABZCqc1XWbg/bAlIDk7AS/yNzT5fcKzg/TwfmTuUqZhGquVmpb5VvfmLcMzp"
	crossorigin="anonymous">
</head>
<body>
	<a class="btn-primary" href="/">Home</a>
	<a class="btn-primary" href="/registration">Register!</a>
	<h1>Summary</h1>

	<table class="table">
		<tr>
			<th>ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Phone Number</th>
			<th>Password</th>
			<th>Gender</th>
		</tr>

		<!-- loops through table to print out values -->
		<c:forEach var="f" items="${userList}">
			<tr>
				<td>${f.id } </td>
				<td>${f.firstName }</td>
				<td>${f.lastName }</td>
				<td>${f.email }</td>
				<td>${f.phoneNumber }</td>
				<td>${f.password }</td>
				<td>${f.gender }</td>
				<td><a class="btn btn-primary" href="update-user?id=${f.id }">Update</a></td>
				<td><a class="btn btn-primary" href="delete-user?id=${f.id }">Delete</a></td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>