<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="black">
	<%-- Fetching the attribute: loggedInUser from SESSION scope --%>
	<%
			Object currentLoggedInUser = 
			session.getAttribute("loggedInUser");
		%>
	<h2 style="color:yellow">
		Hey 	<%= currentLoggedInUser%>, 
		 Congratulations, you are LogIN Successfully...
	</h2>
</body>
</html>