<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
       		  	 <h2> Ideas Page </h2>
           		<br><br><br><br><br><br>
           		
           		<form method="post" action="ideas">
           		<button type="submit">Generate dummy ideas</button>
				</form>
				
				<table>
					<thead>
						<tr>
						<th>Titre</th>
						<th>Description</th>
						<th>Image</th>
						</tr>
					</thead>
				<c:forEach var="Idea" items="${listeIdeas}">
					<tbody>
						<tr>
							<td>${Idea.titre}</td>
							<td>${Idea.description}</td>
							<td><img alt="PictureBro" src="${Idea.photo}"></td>
						</tr>
					</tbody>
				</c:forEach>
				</table>
				
	<%@include file="commons/footer.jsp"%>    		
</body>
</html>