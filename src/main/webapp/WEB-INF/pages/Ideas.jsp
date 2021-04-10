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
		.title {
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
		body{
			padding-bottom: 2em;
		}
	</style>
	
</head>
<body>
 	<%@include file="commons/menu.jsp"%>

           		<br><br><br><br><br><br>
       	   <h2 class="title"> Ideas Page </h2>
           		<br><br><br><br><br><br>  
           		         		           						
				<div class="w-full flex justify-center">
					<div class="w-1/4 flex justify-between my-5">
						<form method="post" action="ideas" class="w-1/3" >
		           			<button type="submit" name="ideas" class="h-full inline-flex items-center px-5 py-2 border border-transparent text-base font-medium rounded-full shadow-sm text-white bg-indigo-600 hover:bg-indigo-700 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-indigo-500">Generate dummy ideas</button>
						</form>
						<c:if test="${sessionScope['user'].isValidated()}">
			           		<form method="post" action="ideas" class="w-1/3 ">
			           			<button type="submit" name="newidea" class="h-full inline-flex items-center px-5 py-2 border border-transparent text-base font-medium rounded-full shadow-sm text-white bg-indigo-600 hover:bg-indigo-700 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-indigo-500">Create new idea</button>
							</form>
						</c:if>
					</div>
				</div>				
				<div class="w-full px-3 flex flex-wrap justify-around">
					 <c:forEach var="Idea" items="${listeIdeas}">
						 <section class="lg:w-1/4 md:w-1/2 flex justify-center">
						 	<div class="w-full bg-gray-100 rounded-lg flex flex-col p-3 justify-between ">
							 	<div class=w-full>
								 	<img class="w-full mb-3" alt="PictureBro" src="${Idea.photo}">
							 		
							 		<div class="flex flex-col w-full mb-3">
							 			<h5 class="text-center w-full">${Idea.titre}</h5>
							 			<p class="text-justify px-2 w-full">${Idea.description}</p>
							 		</div>
							 	</div>						 		
						 		<div class="flex w-full justify-center">						 		
						 			<form method="post" action="addvote">
										<input type="hidden" name="id" value="${Idea.id}">
										<span class="relative z-0 inline-flex shadow-sm rounded-md">
										  <button type="submit" name="top" value="top" class="relative inline-flex items-center px-2 py-2 rounded-l-md border border-gray-300 bg-white text-sm font-medium text-gray-500 hover:bg-gray-50 focus:z-10 focus:outline-none focus:ring-1 focus:ring-indigo-500 focus:border-indigo-500">										    
									     	<span class="font-bold">${Idea.tops}</span>
										    <span class="sr-only">Top</span>
										    <span>&nbsp;Top</span>										   										    
										  </button>
										  <button type="submit" name="flop" value="flop" class="-ml-px relative inline-flex items-center px-2 py-2 rounded-r-md border border-gray-300 bg-white text-sm font-medium text-gray-500 hover:bg-gray-50 focus:z-10 focus:outline-none focus:ring-1 focus:ring-indigo-500 focus:border-indigo-500">										    										    
										    <span class="sr-only">Flop</span>
										    <span>Flop&nbsp;</span>
										    <span class="font-bold">${Idea.flops}</span>										    
										  </button>										  										 
										</span>										
									</form>
						 		</div>
						 	</div>
						 </section>
					 </c:forEach>
				</div>				
	<%@include file="commons/footer.jsp"%>    		
</body>
</html>