<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Form</title>
<style type="text/css">
	table {
	border: 2px solid black;
}
</style>
</head>
<body>
 <h1>Edit Employee</h1>  
       <form:form action="/update" method="post" modelAttribute="command">    
        <table style="border: 2px solid black">    
         <tr style="border: 2px solid black">    
          <td>Name : </td>   
          <td><form:input path="employeeName"  /></td>  
         </tr>  
         <tr>    
          <td>Department : </td>   
          <td><form:input path="employeeDepartment"  /></td>  
         </tr>   
         <tr>    
          <td>Designation :</td>    
          <td><form:input path="employeeDesignation" /></td>  
         </tr>  
         <tr>    
          <td>Salary :</td>    
          <td><form:input path="employeeSalary" /></td>  
         </tr>    
         <tr>     
          <td><input type="submit" value="Edit Save" /></td>    
         </tr>    
        </table>    
       </form:form>    
</body>
=======
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Form</title>
<style type="text/css">
	table {
	border: 2px solid black;
}
</style>
</head>
<body>
 <h1>Edit Employee</h1>  
       <form:form action="/update" method="post" modelAttribute="command">    
        <table style="border: 2px solid black">    
         <tr style="border: 2px solid black">    
          <td>Name : </td>   
          <td><form:input path="employeeName"  /></td>  
         </tr>  
         <tr>    
          <td>Department : </td>   
          <td><form:input path="employeeDepartment"  /></td>  
         </tr>   
         <tr>    
          <td>Designation :</td>    
          <td><form:input path="employeeDesignation" /></td>  
         </tr>  
         <tr>    
          <td>Salary :</td>    
          <td><form:input path="employeeSalary" /></td>  
         </tr>    
         <tr>     
          <td><input type="submit" value="Edit Save" /></td>    
         </tr>    
        </table>    
       </form:form>    
</body>
>>>>>>> 70a1007e90fe36b5cee7eb1125c791b282f231c5
</html>