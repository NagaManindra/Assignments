    <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>

<html>
<body>
<h2>Hello World Page</h2>
<a href="hello"> click here for welcome message</a>

<form:errors path="login.*"></form:errors>

<form action="Calculate">
<p>
Enter 1st Number <input type="text" name="Number1"/> 
</p>
<p>
Enter 2nd Number <input type="text" name="Number2"/> 
</p>
<p>
Enter Operation <input type="text" name="operation"/> 
</p>
<p>
<input type="submit" value="Add"/> 
</p>
</form>
</body>
</html>
