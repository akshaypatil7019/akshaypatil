<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<title>Welcome</title>
</head>
<body>

<%
String name = request.getParameter("uname");

// Store value in session
session.setAttribute("user", name);

// Set session expiry to 60 seconds
session.setMaxInactiveInterval(60);
%>

<h2>Hello <%= name %>!</h2>
<p>Session started successfully.</p>
<p>Session will expire in 1 minute.</p>

<br>
<a href="second.jsp">Check Session</a>

</body>
</html>