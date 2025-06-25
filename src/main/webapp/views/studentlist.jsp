<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Details</title>
</head>
<body>
   <h2>-----Welcome to CDAC Record System -----</h2>

<table>
<tr>
<td>StudentId</td>
<td>Name</td>
<td>Course</td>
<td>Address</td>
</tr>
<c:forEach items="${stulist}" var="stu">
<tr>
<td>${stu.id }</td>
<td>${stu.name }</td>
<td>${stu.course }</td>
<td>${stu.address }</td>

<td><a href='searchitem/${stu.id }'>Edit</a>|
<a href='delitem/${stu.id }'>Delete</a>
</tr>
</c:forEach>

</table>
</body>
</html>