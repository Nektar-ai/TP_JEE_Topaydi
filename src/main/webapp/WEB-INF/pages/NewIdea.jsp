<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Idea</title>
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
	<link href="https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css" rel="stylesheet">	
</head>
<body>
 	<%@include file="commons/menu.jsp"%>

           		<br><br><br><br><br><br>
       		  	   <h2> New Idea </h2>
           		<br><br><br><br><br><br>
           		
           		<div class= "w-full flex justify-center">
           			<div class="lg:w-1/2 md:w-2/3 sm:w-4/5 bg-gray-50 rounded-lg shadow-md p-3">
           				<form class="space-y-8 divide-y divide-gray-200">
					  		<div class="space-y-8 divide-y divide-gray-200 sm:space-y-5">
							    <div>
							      	<div class="mt-6 sm:mt-5 space-y-6 sm:space-y-5">							      	
								        <div class="sm:grid sm:grid-cols-3 sm:gap-4 sm:items-start sm:border-t sm:border-gray-200 sm:pt-5">
							          		<label for="username" class="block text-sm font-medium text-gray-700 sm:mt-px sm:pt-2">
								            	Titre
								          	</label>
								          	<div class="mt-1 sm:mt-0 sm:col-span-2">
									            <div class="max-w-lg flex rounded-md shadow-sm">
									              	<input type="text" name="titre" class="border-gray-300 border-2 rounded-sm flex-1 block w-full focus:ring-indigo-500 focus:border-indigo-500 min-w-0 rounded-none rounded-r-md sm:text-sm border-gray-300">
									            </div>
								          	</div>
							        	</div>					
								        <div class="sm:grid sm:grid-cols-3 sm:gap-4 sm:items-start sm:border-t sm:border-gray-200 sm:pt-5">
								        	<label for="about" class="block text-sm font-medium text-gray-700 sm:mt-px sm:pt-2">
								           		Description
								          	</label>
								          	<div class="mt-1 sm:mt-0 sm:col-span-2">
								            	<textarea name="description" rows="6" class="border-gray-300 border-2 rounded-sm max-w-lg shadow-sm block w-full focus:ring-indigo-500 focus:border-indigo-500 sm:text-sm border-gray-300 rounded-md"></textarea>
								            	<p class="mt-2 text-sm text-gray-500">Décrivez votre idée</p>
								          	</div>
								        </div>					
								        <div class="sm:grid sm:grid-cols-3 sm:gap-4 sm:items-start sm:border-t sm:border-gray-200 sm:pt-5">
							          		<label for="username" class="block text-sm font-medium text-gray-700 sm:mt-px sm:pt-2">
								            	URL Photo
								          	</label>
							          		<div class="mt-1 sm:mt-0 sm:col-span-2">
							            		<div class="max-w-lg flex rounded-md shadow-sm">
							              			<input type="text" name="photo" class="border-gray-300 border-2 rounded-sm  flex-1 block w-full focus:ring-indigo-500 focus:border-indigo-500 min-w-0 rounded-none rounded-r-md sm:text-sm border-gray-300">
							            		</div>
							          		</div>
							        	</div>					        
					      			</div>
					    		</div>			
					  		</div>					
						  <div class="pt-5">
						    <div class="flex justify-end">					      
						      <button type="submit" class="ml-3 inline-flex justify-center py-2 px-4 border border-transparent shadow-sm text-sm font-medium rounded-md text-white bg-indigo-600 hover:bg-indigo-700 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-indigo-500">
						        Save
						      </button>
						    </div>
						  </div>
						</form>
           			</div>
           		</div>	
	<%@include file="commons/footer.jsp"%>    		
</body>
</html>