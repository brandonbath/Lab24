<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/sketchy/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-N8DsABZCqc1XWbg/bAlIDk7AS/yNzT5fcKzg/TwfmTuUqZhGquVmpb5VvfmLcMzp"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<a class="btn-primary" href="/registration">Register!</a> <a
			class="btn-primary" href="/summary">User Summary</a>
		<h1>Welcome to GC Coffee</h1>

		</form>
		<table class="table">
			<tr>
				<th>Product ID</th>
				<th>Product Name</th>
				<th>Description</th>
				<th>Price</th>
			</tr>
			<c:forEach var="f" items="${productList }"> 
				<tr>
					<td>${f.id }</td>
					<!-- must match variable names in pojo -->
					<td>${f.productName }</td>
					<td>${f.productDescription }</td>
					<td>${f.productPrice }</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>