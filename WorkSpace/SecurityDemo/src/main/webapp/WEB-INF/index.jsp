    <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>

<html>
<body>
<h2>Login Page</h2>
<form action="/login" method="post">
	<p>
	Enter UserName : <input type="text" name="Username" value="user"/>
	</p>
	<p>
	Enter Password : <input type="text" name="Password" value="password"/>	
	</p>
	
	<p>
	<input type="submit" value = "login"/>
	</p>
</form>
</body>
</html>
