<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Topaydi !</title>
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
	<br><br>
           			<br><br><br><br><br><br>
       		  	   <h2> UserValidation </h2>
           			<br><br><br><br><br><br>
    	
   	<table>
		<thead>
			<tr>
				<th>Pseudonyme</th>
				<th>Email</th>

			</tr>
		</thead>
		
		<tbody>
			<c:forEach var="User" items="${listUsers}">
			
			<tr>
				
				<td>${User.nickname}</td>
				<td>${User.mail}</td>
				<td>
				<form action="uservalidation" method="post">					
					<input type="hidden" value="${User.nickname}" name="nickname"/>
					<input type="submit" value="Valider"/>					
				</form>
				</td>				
				
			</tr>
			
			</c:forEach>
		</tbody>
	</table>

	<%@include file="commons/footer.jsp"%> 
</body>

</html>