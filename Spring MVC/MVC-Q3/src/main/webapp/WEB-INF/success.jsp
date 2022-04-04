<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>
Login Successful
<p>
Name=<%= request.getAttribute("name")%>
Password=<%= request.getAttribute("pass")%>
Email=<%= request.getAttribute("mail")%>
</p>



</body>
</html>