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
           			<button type="submit" name="ideas">Generate dummy ideas</button>
				</form>
				
           		<form method="post" action="ideas">
           			<button type="submit" name="newidea">Create new idea</button>
				</form>
				
				<table>
					<thead>
						<tr>
							<th>Titre</th>
							<th>Description</th>
							<th>Image</th>
							<th>Top/Flop</th>
						</tr>
					</thead>
					
					<tbody>
						<c:forEach var="Idea" items="${listeIdeas}">
						<tr>
							<td>${Idea.titre}</td>
							<td>${Idea.description}</td>
							<td><img alt="PictureBro" src="${Idea.photo}"></td>
							<td>${Idea.tops}<br>
								
							<button>Top</button><br><button>Flop</button>
								
							<td>${Idea.flops}</td>
						</tr>
						</c:forEach>
					</tbody>
				</table>
				
	<%@include file="commons/footer.jsp"%>    		
</body>
</html>