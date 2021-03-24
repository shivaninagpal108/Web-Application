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
		<a href="#" class="navbar-brand">Brand</a>
		<ul class="nav navbar-nav">
			<li><a href="http://www.Web_Application.com">Application</a></li>
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<li class="active"><a href="login">Login</a></li>
		</ul>
	</nav>
	<div class="container">
		<h1>Welcome to the Web Application Login</h1>
		<form action="login" method="post">
			<h2><font color="red">${errorMessage}</font></h2>
			Enter your name: <input type="text" name="name"><br><br>
			Enter your password: <input type="password" name="password"><br><br>
			<input type ="submit" value="Login">
		</form>
	</div>
	<footer class="footer">
		<div>@2021 My Web Application, Inc. All rights reserved</div>
		<div>Designed and developed by: Shivani Nagpal</div>
	</footer>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>