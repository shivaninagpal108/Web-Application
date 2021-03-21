<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My Web Application</title>
</head>
<body>
<h1>Welcome to the Web Application </h1>
<p>Hi ${name}</p>
<p>Login is successful</p>
<p>Your learning Todo's are: </p>
<ol>
	<c:forEach items="${todos}" var="todo">
		<li>
			${todo.name} &nbsp; &nbsp;
			<a href="<%=request.getContextPath()%>/delete-todo.do?deleteTodo=${todo.name}">Delete</a>
		</li>
	</c:forEach>
</ol>
<form action="todo.do" method="post">
	<input type="text" name="newTodo">
	<input type="submit" value="Add Todo">
</form>
</body>
</html>