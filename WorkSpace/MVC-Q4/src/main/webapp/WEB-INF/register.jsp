<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
Register
<form action="create" method="post">
	<p>
	Username :<input type="text" name="username"/>
	<form:errors name="username"></form:errors>
	</p><p>
	Password :<input type="text" name="password"/>
	<form:errors name="password"></form:errors>
	</p>
	<p>
	Email :<input type="text" name="email"/>
	<form:errors name="email"></form:errors>
	</p>
	<p>
	<input type="submit" value="register"/>
	</p>
</form>
</body>
</html>