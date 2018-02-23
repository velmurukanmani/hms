<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>WebJars Demo</title>

<!--  Static resources form Webjars -->
<link rel="stylesheet" href="webjars/bootstrap/3.3.7-1/css/bootstrap.min.css">
<script src="webjars/jquery/1.11.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>

<style>
tr:first-child {
	font-weight: bold;
	background-color: #C6C9C4;
}
</style>

</head>


<body>

	<h2><span class="glyphicon glyphicon-user"></span> List of Employees</h2>
	<table>
		<tr>
			<td>NAME</td>
			<td>Joining Date</td>
			<td>Salary</td>
			<td>SSN</td>
			<td></td>
		</tr>
		<c:forEach items="${employees}" var="employee">
			<tr>
				<td>${employee.name}</td>
				<td>${employee.joiningDate}</td>
				<td>${employee.salary}</td>
				<td><a href="<c:url value='/edit-${employee.ssn}-employee' />">${employee.ssn}</a></td>
				<td><a
					href="<c:url value='/delete-${employee.ssn}-employee' />">delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href="<c:url value='/new' />">Add New Employee</a>
</body>
</html>