<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Topaydi !</title>
    <%@include file="commons/header.jsp"%>
</head>
<body>
 	<%@include file="commons/menu.jsp"%>
	<br><br>
    	<form action="saveUser" method="post">
    		<label for="nickname">Nom d'utilisateur : </label><input type="text" name="nickname" /><br>
    		<label for="password">Mot de passe : </label><input type="text" name="password" />
    		<input type="submit" value="Valider">
    	</form>

	<%@include file="commons/footer.jsp"%> 
</body>

</html>