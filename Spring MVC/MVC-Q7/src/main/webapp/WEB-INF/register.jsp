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
<%-- <form:form action="getDetails" method="post">
<table>
<tr>
	<form:label path="username">Username:</form:label>
	<form:input path="username"/>
	<form:errors path="username"></form:errors>
</tr>
<tr>
	<form:label path="password">Password:</form:label>
	<form:input path="password"/>
	<form:errors path="password"></form:errors>
</tr>
<tr>
	<form:label path="email">Email:</form:label>
	<form:input path="email"/>
	<form:errors path="email"></form:errors>
</tr>
<tr>
	<form:label path="contact">Contact:</form:label>
	<form:input path="contact"/>
	<form:errors path="contact"></form:errors>
</tr>
<tr>
	<form:select path="city">
		<form:option value="1">Kurnool</form:option>
		<form:option value="2">Chittor</form:option>
		<form:option value="3">Kadapa</form:option>
		<form:option value="4">Anantapur</form:option>
		<form:option value="5">Amaravathi</form:option>

	</form:select>
<tr>
	<form:label path="zipcode">Zipcode:</form:label>
	<form:input path="zipcode"/>
	<form:errors path="zipcode"></form:errors>
</tr>
<tr>
	<td><input type="submit" value="Register"/></td>
</tr>
</table>
</form:form> --%>
<form action="getDetails" method="post">
	<p>
	Username :<input type="text" name="username"/><br>
	<form:errors path="customer.username"></form:errors>
	</p><p>
	Password :<input type="text" name="password"/>
	<form:errors path="customer.password"></form:errors>
	</p>
	<p>
	Email :<input type="text" name="email"/>
	<form:errors path="customer.email"></form:errors>
	</p>
	<p>
	Contact :<input type="text" name="contact"/>
		<form:errors path="customer.contact"></form:errors>
	</p>
	<p>
	City:
	<select name="city">
		<option value="Kurnool">Kurnool</option>
		<option value="Chittor">Chittor</option>
		<option value="Kadapa">Kadapa</option>
		<option value="Anantapur">Anantapur</option>
		<option value="Amaravathi">Amaravathi</option>
	<form:errors path="customer.city"></form:errors>

	</select>
	</p>
	<p>
	Zipcode :<input type="text" name="zipcode"/>
		<form:errors path="customer.zipcode"></form:errors>
	
	<p>
	<input type="submit" value="register"/>
	</p>
</form>
</body>
</html>