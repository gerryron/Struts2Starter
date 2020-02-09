<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Struts 2.5 Starter</title>
</head>
<body>
<h2>Struts 2.5 MVC Application</h2>
<hr>
<form name="frm" method="post" action="login">
<table>
	<tr>
	<td>User Id
	<td><input type="text" name="userId" required>
	</tr>
	
	<tr>
	<td>Password
	<td><input type="password" name="pass" required>
	</tr>
	
	<tr>
	<td colspan="2"><input type="submit" value="submit">
	</tr>
</table>
</form>

</body>
</html>