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
	<div class="w-full bg-gray-50 flex flex-col min-h-full">
		
		
		<div class="flex w-full justify-center">
		  <div class="-my-2 overflow-x-auto sm:-mx-6 lg:-mx-8 lg:w-1/2 md:w-2/3 sm:w-4/5">
		    <div class="py-2 align-middle inline-block min-w-full sm:px-6 lg:px-8">
		      <div class="shadow overflow-hidden border-b border-gray-200 sm:rounded-lg">
		      	<div class="w-full flex mt-3 mb-2">
		        	<h2 class="text-2xl">Unvalidated Users</h2>
		        </div>
		        <table class="min-w-full divide-y divide-gray-200 mb-4">
		          <thead class="bg-gray-50">
		            <tr>
		              <th scope="col" class="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">
		                Nickname
		              </th>
		              <th scope="col" class="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">
		                Email
		              </th>
		              <th scope="col" class="relative px-6 py-3">
		                <span class="sr-only">Edit</span>
		              </th>
		            </tr>
		          </thead>
		          <tbody class="bg-white divide-y divide-gray-200">
		           
		            
		            <c:forEach var="User" items="${listUsers}">
			
						<tr>
							<td class="px-6 py-4 whitespace-nowrap text-sm text-gray-500">${User.nickname}</td>
							<td class="px-6 py-4 whitespace-nowrap text-sm text-gray-500">${User.mail}</td>
							<td class="px-6 py-4 whitespace-nowrap text-sm text-gray-500 flex float-right">
								<form action="admin" method="post" class="mx-2">					
									<input type="hidden" value="${User.nickname}" name="nickname"/>
									<button type="submit" value="Valider" name="validate" class="h-full inline-flex items-center px-5 py-2 border border-transparent text-base font-medium rounded-full shadow-sm text-white bg-indigo-600 hover:bg-indigo-700 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-indigo-500">Valider</button>					
								</form>
							</td>				
							
						</tr>
			
					</c:forEach>
		
		          </tbody>
		        </table>
		        <div class="w-full flex mt-3 mb-2">
		        	<h2 class="text-2xl">Deactivated Users</h2>
		        </div>
		        <table class="min-w-full divide-y divide-gray-200">
		          <thead class="bg-gray-50">
		            <tr>
		              <th scope="col" class="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">
		                Nickname
		              </th>
		              <th scope="col" class="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">
		                Email
		              </th>
		              <th scope="col" class="relative px-6 py-3 flex float-right">
		                <span class="sr-only">Edit</span>
		              </th>
		            </tr>
		          </thead>
		          <tbody class="bg-white divide-y divide-gray-200">
		           
		            
		            <c:forEach var="UserD" items="${listDeacUsers}">
			
						<tr>
							<td class="px-6 py-4 whitespace-nowrap text-sm text-gray-500">${UserD.nickname}</td>
							<td class="px-6 py-4 whitespace-nowrap text-sm text-gray-500">${UserD.mail}</td>
							<td class="px-6 py-4 whitespace-nowrap text-sm text-gray-500 flex float-right">
								<form action="admin" method="post" class="mx-2">					
									<input type="hidden" value="${UserD.getNickname()}" id="nickname" name="nickname"/>
									<button type="submit" value="activate" name="activate" class="h-full inline-flex items-center px-5 py-2 border border-transparent text-base font-medium rounded-full shadow-sm text-white bg-green-300 hover:bg-green-400 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-indigo-500">Activer</button>					
								</form>
								
							</td>					
						</tr>
			
					</c:forEach>
		
		          </tbody>
		        </table>
		        <div class="w-full flex mt-3 mb-2">
		        	<h2 class="text-2xl">Validated Users</h2>
		        </div>
		        <table class="min-w-full divide-y divide-gray-200">
		          <thead class="bg-gray-50">
		            <tr>
		              <th scope="col" class="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">
		                Nickname
		              </th>
		              <th scope="col" class="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">
		                Email
		              </th>
		              <th scope="col" class="relative px-6 py-3 flex float-right">
		                <span class="sr-only">Edit</span>
		              </th>
		            </tr>
		          </thead>
		          <tbody class="bg-white divide-y divide-gray-200">
		           
		            
		            <c:forEach var="UserV" items="${listValUsers}">
			
						<tr>
							<td class="px-6 py-4 whitespace-nowrap text-sm text-gray-500">${UserV.nickname}</td>
							<td class="px-6 py-4 whitespace-nowrap text-sm text-gray-500">${UserV.mail}</td>
							<td class="px-6 py-4 whitespace-nowrap text-sm text-gray-500 flex float-right">
								<form action="admin" method="post" class="mx-2">					
									<input type="hidden" value="${UserV.getNickname()}" id="nickname" name="nickname"/>
									<button type="submit" value="Desactiver" name="deactivate" class="h-full inline-flex items-center px-5 py-2 border border-transparent text-base font-medium rounded-full shadow-sm text-white bg-indigo-300 hover:bg-indigo-400 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-indigo-500">Désactiver</button>					
								</form>
								<form action="admin" method="POST" class="mx-2">					
									<label for="nickname"></label>
									<input type="hidden" value="${UserV.nickname}" name="nickname"/>
									<button type="submit" value="Supprimer" name="delete" class="h-full inline-flex items-center px-5 py-2 border border-transparent text-base font-medium rounded-full shadow-sm text-white bg-red-600 hover:bg-red-700 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-indigo-500">Supprimer</button>					
								</form>
							</td>					
						</tr>
			
					</c:forEach>
		
		          </tbody>
		        </table>
		      </div>
		    </div>
		  </div>
		</div>
	</div>
           			
    

	<%@include file="commons/footer.jsp"%> 
</body>

</html>