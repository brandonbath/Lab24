<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/sketchy/bootstrap.min.css" rel="stylesheet" integrity="sha384-N8DsABZCqc1XWbg/bAlIDk7AS/yNzT5fcKzg/TwfmTuUqZhGquVmpb5VvfmLcMzp" crossorigin="anonymous">
</head>
<body>
<a class="btn-primary" href="/">Home</a>
<a class="btn-primary" href="/summary">User Summary</a>
<h1>Please fill in the form to register:</h1>

<form action="add-user" method="post"> 
First Name: <input type="text" name="firstName" required>
Last Name: <input type="text" name="lastName" required>
Email: <input type="text" name="email" required>
Phone Number: <input type="number" name="phoneNumber" required>
Password: <input type="text" name="password" required>
<select name="gender">
<option value="male" >Male</option>
<option value="female">Female</option>
</select>
<input class="btn-primary" type="submit" value="Submit">
</form>



</body>
</html>