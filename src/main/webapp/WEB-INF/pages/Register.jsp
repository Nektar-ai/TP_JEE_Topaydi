<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>New User</title>
	    <%@include file="commons/header.jsp"%>	   
	</head>
	<body>
	 	<%@include file="commons/menu.jsp"%>			    	
	    	<div class="w-full flex justify-center bg-gray-50">
		<div class="lg:w-1/2 md:w-1/2 sm:w-2/3  rounded-lg ">				    	
	    	<div class="min-h-screen flex flex-col justify-center py-12 sm:px-6 lg:px-8">
			  <div class="sm:mx-auto sm:w-full sm:max-w-md">
			    <img class="mx-auto h-12 w-auto" src="https://tailwindui.com/img/logos/workflow-mark-indigo-600.svg" alt="Workflow">
			    <h2 class="mt-6 text-center text-3xl font-extrabold text-gray-900">
			      Register
			    </h2>
			  </div>			
			  <div class="mt-8 sm:mx-auto sm:w-full sm:max-w-md">
			    <div class="bg-white py-8 px-4 shadow sm:rounded-lg sm:px-10">
			      <form class="space-y-6" action="register" method="POST">
			        <div>
			          <label for="nickname" class="block text-sm font-medium text-gray-700">
			            Nickname
			          </label>
			          <div class="mt-1">
			            <input id="nickname" name="nickname" type="text" required class="border-2 border-gray-200 appearance-none block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm placeholder-gray-400 focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 sm:text-sm">
			          </div>
			        </div>			        
			        <div>
			          <label for="nickname" class="block text-sm font-medium text-gray-700">
			            E-Mail
			          </label>
			          <div class="mt-1">
			            <input id="mail" name="mail" type="email" required class="border-2 border-gray-200 appearance-none block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm placeholder-gray-400 focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 sm:text-sm">
			          </div>
			        </div>			
			        <div>
			          <label for="password" class="block text-sm font-medium text-gray-700">
			            Password
			          </label>
			          <div class="mt-1">
			            <input id="password" name="password" type="password" autocomplete="current-password" required class="appearance-none block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm placeholder-gray-400 focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 sm:text-sm">
			          </div>
			        </div>			
			        <div class="flex items-center justify-between">
			          <div class="text-sm">
			            <a href="login" class="font-medium text-indigo-600 hover:text-indigo-500">
			              Sign in
			            </a>
			          </div>
			        </div>			
			        <div>
			          <button type="submit" class="w-full flex justify-center py-2 px-4 border border-transparent rounded-md shadow-sm text-sm font-medium text-white bg-indigo-600 hover:bg-indigo-700 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-indigo-500">
			            Register
			          </button>
			        </div>
			      </form>						      
			    </div>
			  </div>
			</div>	    	
		</div>
	</div>	
		<%@include file="commons/footer.jsp"%> 
	</body>
</html>