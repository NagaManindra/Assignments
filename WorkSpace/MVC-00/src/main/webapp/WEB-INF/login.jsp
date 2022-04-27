<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter Details</title>
</head>
<body>
<form:errors path="error.*"> </form:errors>

<form action="loginform" method="post">
	<p>
		Enter User Name <input type="text" name="username"/>
	</p>
	<p>
		Enter Password <input type="text" name="password"/>
	</p>
	<p>
		Enter Email <input type="text" name="email"/>
	</p>
	<p>
		Enter Number <input type="text" name="number"/>
	</p>
	<input type="submit" value="Login"/>
</form>
</body>
</html>