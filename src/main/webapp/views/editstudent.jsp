<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="forms" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Edit Forms</title>
</head>
<body>
   <forms:form  action="${pageContext.request.contextPath}/updatestudent"  modelAttribute="student">
<forms:label path="id">Student Id</forms:label>
<forms:input path="id" disabled="disabled"/>

<forms:label path="name">Student Name</forms:label>
<forms:input path="name" />
<forms:label path="course">Course</forms:label>
<forms:input path="course" />
<forms:label path="address">Address</forms:label>
<forms:input path="address" />
<Input type="submit" value="Updatestudent">
</forms:form>
</body>
</html>