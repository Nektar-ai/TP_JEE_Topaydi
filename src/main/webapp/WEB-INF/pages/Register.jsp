<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>New User</title>
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
	       		  <h2> New User Creation </h2>
	           		<br><br><br><br><br><br>
	    	
	    	<form action="register" method="post">
	    		<label for="nickname">Nom d'utilisateur : </label>
	    			<input type="text" name="nickname" /><br>
	    		<label for="password">Mot de passe : </label>
	    			<input type="text" name="password" />
	    		<input type="submit" value="Valider">
	    	</form>
	
		<%@include file="commons/footer.jsp"%> 
	</body>

</html>