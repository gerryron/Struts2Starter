<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<h2>User Home Page</h2>
<hr>
Welcome to Struts 2.5

<h3>Using Struts tag liblary</h3>
<s:form action="bill">
	<s:textfield name="amount" label="Purchase Amount"></s:textfield>
	<br>
	<s:submit value="Submit"></s:submit>
</s:form>

</body>
</html>