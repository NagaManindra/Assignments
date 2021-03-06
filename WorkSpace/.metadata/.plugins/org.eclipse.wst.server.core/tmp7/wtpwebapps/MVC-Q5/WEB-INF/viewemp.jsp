<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
<h1>Employees List</h1>  
<table style="border: 2;width: 70%;padding: 2">  
<tr><th>Name</th><th>Department</th><th>Designation</th><th>Salary</th><th>Edit</th><th>Delete</th></tr>  
   <c:forEach var="emp" items="${list}">   
   <tr>  
   <td>${emp.employeeName}</td>  
   <td>${emp.employeeDepartment}</td>  
   <td>${emp.employeeDesignation}</td>  
   <td>${emp.employeeSalary}</td>  
   
   <td><a href="getbyName/${emp.employeeName}">Edit</a></td>  
   <td><a href="deleteByName">Delete</a></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="empform">Add New Employee</a>
</body>
</html>