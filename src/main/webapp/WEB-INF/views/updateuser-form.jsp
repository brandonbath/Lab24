<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update User</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/sketchy/bootstrap.min.css" rel="stylesheet" integrity="sha384-N8DsABZCqc1XWbg/bAlIDk7AS/yNzT5fcKzg/TwfmTuUqZhGquVmpb5VvfmLcMzp" crossorigin="anonymous">
</head>
<body>


<h1>Update User</h1>
<form action="update"> <!-- remember action is where the mapping goes to -->
${userId} <input type="hidden" value="${userId}" name="id">
<input type="text" name="firstName" placeholder="First Name">
<input type="text" name="lastName" placeholder="Last Name">
<input type="text" name="email" placeholder="Email">
<input type="text" name="phoneNumber" placeholder="Phone Number">
<input type="text" name="password" placeholder="Password">
<select name="gender">
<option value="male" >Male</option>
<option value="female">Female</option>
</select>
<input class="btn-primary" type="submit" value="Update User">
</form>

</body>
</html>

