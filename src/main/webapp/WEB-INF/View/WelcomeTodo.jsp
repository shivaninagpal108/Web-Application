<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>My Web Application</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet"/>
<style>
	.footer {
		position: absolute;
		bottom: 0;
		width: 100%;
		height: 60px;
		background-color: #f5f5f5;
	}
</style>
</head>
<body>
	<nav class="navbar navbar-default">
		<a href="/" class="navbar-brand">Brand</a>
		<ul class="nav navbar-nav">
			<li class="active"><a href="#">Home</a></li>
			<!-- change below functioality, user cant go to todo before login -->
			<li><a href="<%=request.getContextPath()%>/list-todo.do">Todos</a></li>
			<li><a href="http://www.Web_Application.com">Application</a></li>
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<li><a href="#">Login</a></li>
		</ul>
	</nav>
	<div class="container">
		<h1>Welcome ${name}</h1>
		<p>Your Todo's are: </p>
		<ol>
			<c:forEach items="${todos}" var="todo" varStatus="todoloop">
			<li>
				${todo.name} &nbsp; &nbsp;
				<a href="<%=request.getContextPath()%>/delete-todo.do?index=${todoloop.index}">Delete</a>
			</li>
		</c:forEach>
		</ol>
		<form action="add-todo.do" method="post">
			New Todo: <input type="text" name="newTodo">
			<input type="submit" value="Submit Todo">
		</form>
	</div>
	<footer class="footer">
		<div>footer content</div>
	</footer>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>