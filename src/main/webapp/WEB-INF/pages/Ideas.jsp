<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Topaydi Ideas</title>
	<%@include file="commons/header.jsp"%>
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
				<c:forEach var="Idea" items="${listeIdeas}"></c:forEach>
					<tbody>
						<tr>
						<th>${Idea.getTitre}</th>
						<th>${Idea.getDescription}</th>
						<th>${Idea.getPhoto}</th>
						</tr>
					</tbody>
				</table>
				
	<%@include file="commons/footer.jsp"%>    		
</body>
</html>