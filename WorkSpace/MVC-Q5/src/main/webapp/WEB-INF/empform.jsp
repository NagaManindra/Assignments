<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
</head>
<body>
 <h1>Add New Employee</h1>  
       <form:form action="create" method="post">    
        <table >    
         <tr>    
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
          <td> </td>    
          <td><input type="submit" value="Save" /></td>    
         </tr>    
        </table>    
       </form:form>    
</body>
</html>