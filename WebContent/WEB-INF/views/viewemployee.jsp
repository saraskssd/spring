<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix = "my1" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix = "my2" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Employee</title>
</head>
<body>
	<h3>All Employees</h3>
	<h3>${list}</h3>
	
	<my1:forEach var="employee" items="${employeeList}">
		
		<p>${employee.id}, ${employee.employeeName}, ${employee.employeeSalary}, ${employee.employeeDesignation}</p>
			
	</my1:forEach>