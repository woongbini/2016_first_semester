<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
	<head>
		<title>Home</title>
	</head>
	<body>
		<h1>COURSE</h1>
		<p>please log in<p>
		<form action="/home" method="post">
			<p>ID : <input type="text" name="id"></p>
			<p>PW : <input type="password" name="password"></p>
			<input type="submit" value="login">
		</form> 
	
	</body>
</html>
