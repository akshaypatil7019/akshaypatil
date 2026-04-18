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
int time = Integer.parseInt(request.getParameter("time"));

// Store in session
session.setAttribute("user", name);

// Set custom expiry time
session.setMaxInactiveInterval(time);
%>

<h2>Hello <%= name %>!</h2>
<p>Session started successfully.</p>
<p>Session expiry time: <%= time %> seconds</p>

<br>
<p>Click below within the given time to check session:</p>
<a href="check.jsp">Check Session</a>

</body>
</html>