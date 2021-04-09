<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="fr.epsi.entity.User"%>   
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Topaydi Ideas</title>
		<%@include file="commons/header.jsp"%>
		
	<style>
		h2 {
			font-size: 48px;
			border:groove 3px;
			width: fit-content;
			padding: 10px;
			padding-left: 20px;
			padding-right: 20px;
			position: relative;
			left: 50%;
			transform: translateX(-50%)
		}	
	</style>
		
	</head>
	<body>
	 	<%@include file="commons/menu.jsp"%>
	
	           		<br><br><br><br><br><br>
	       		  	 <h2> Ideaz Page </h2>
	           		<br><br><br><br><br><br>
		
		<% User u = (User) session.getAttribute("user"); %>
		
		<h2> Bienvenue <%=u.getNickname() %></h2>
		
		<%@include file="commons/footer.jsp"%>    		
	</body>
</html>