<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Store</title>
<link href="/css/login-style.css" rel="stylesheet"> 
</head>
<body>
    <div class="login-container">
        <h1>Login</h1>
        <form method="post" action="/login/authWithSpringData">
            <label for="userName">User Name:</label>
            <input type="text" id="userName" name="userName" required="required"/>
            
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required="required"/>
            
            <input type="submit" value="Login"/>
        </form>
        <div class="anchor-container">
        	<a href="/register">Sign up?</a>
        </div>
    </div>
</body>
</html>
