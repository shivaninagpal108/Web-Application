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
			<li><a href="<%=request.getContextPath()%>/welcome">Home</a></li>
			<li class="active"><a href="#">Todos</a></li>
			<li><a href="http://www.Web_Application.com">Application</a></li>
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<li><a href="<%=request.getContextPath()%>/logout">Logout</a></li>
		</ul>
	</nav>
	<div class="container">
		<h3>Your Todo's are: </h3>
		<table class="table table-striped">
			<thead>
				<th>Description</th>
				<th>Category</th>
				<th>Actions</th>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo" varStatus="todoloop">
					<tr>
						<td>${todo.name}</td>
						<td>${todo.category}</td>
						<td><a class="btn btn-danger" href="<%=request.getContextPath()%>/delete-todo.do?index=${todoloop.index}">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a class="btn btn-success" href="<%=request.getContextPath()%>/add-todo.do">Add New Todo</a>
	</div>
	<footer class="footer">
		<div>@2021 My Web Application, Inc. All rights reserved</div>
		<div>Designed and developed by: Shivani Nagpal</div>
	</footer>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>