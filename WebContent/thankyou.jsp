<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Successful</title>
</head>
<body>
	<h3>Thank you for registering for a prize.</h3>
	
	<p>Your registration information: <s:property value="personBean"/> </p>
	<p><a href="<s:url action='index' />" >Return to home page</a>.</p>
</body>
</html>