<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu Topaydi</title>
<style>
	ul {
		position: absolute;
		right: 3%
	}
</style>
</head>
<body>
  
  <nav class="bg-gray-800">
  <div class="max-w-7xl mx-auto px-2 sm:px-6 lg:px-8">
    <div class="relative flex items-center justify-between h-16">
      <div class="absolute inset-y-0 left-0 flex items-center sm:hidden">
        
        <button type="button" class="inline-flex items-center justify-center p-2 rounded-md text-gray-400 hover:text-white hover:bg-gray-700 focus:outline-none focus:ring-2 focus:ring-inset focus:ring-white" aria-controls="mobile-menu" aria-expanded="false">
          <span class="sr-only">Open main menu</span>
          
          <svg class="block h-6 w-6" xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke="currentColor" aria-hidden="true">
            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M4 6h16M4 12h16M4 18h16" />
          </svg>
         
          <svg class="hidden h-6 w-6" xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke="currentColor" aria-hidden="true">
            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M6 18L18 6M6 6l12 12" />
          </svg>
        </button>
      </div>
      <div class="flex-1 flex items-center justify-center sm:items-stretch sm:justify-start">
        <div class="flex-shrink-0 flex items-center">
          <img class="block lg:hidden h-8 w-auto" src="https://tailwindui.com/img/logos/workflow-mark-indigo-500.svg" alt="Workflow">
          <h1 class="text-white font-bold text-4xl">Topaydi</h1>
        </div>
        <div class="hidden sm:block sm:ml-6">
          <div class="flex space-x-4">
            <!-- Current: "bg-gray-900 text-white", Default: "text-gray-300 hover:bg-gray-700 hover:text-white" -->
            <a href="/TP_JEE_Topaydi-0.0.1-SNAPSHOT/home" class="bg-gray-900 text-white px-3 py-2 rounded-md text-sm font-medium" aria-current="page">Topaydi</a>

            <a href="/TP_JEE_Topaydi-0.0.1-SNAPSHOT/ideas" class="text-gray-300 hover:bg-gray-700 hover:text-white px-3 py-2 rounded-md text-sm font-medium">Ideas</a>

            <a href="/TP_JEE_Topaydi-0.0.1-SNAPSHOT/" class="text-gray-300 hover:bg-gray-700 hover:text-white px-3 py-2 rounded-md text-sm font-medium">Login</a>

            <c:if test="${sessionScope['user'].isAdmin()}">
            	<a href="/TP_JEE_Topaydi-0.0.1-SNAPSHOT/admin" class="text-gray-300 hover:bg-gray-700 hover:text-white px-3 py-2 rounded-md text-sm font-medium">Admin</a>
            </c:if>

          </div>
        </div>
      </div>
  
    </div>
  </div>

  <!-- Mobile menu, show/hide based on menu state. -->
  <div class="sm:hidden" id="mobile-menu">
    <div class="px-2 pt-2 pb-3 space-y-1">
      <!-- Current: "bg-gray-900 text-white", Default: "text-gray-300 hover:bg-gray-700 hover:text-white" -->
      <a href="/TP_JEE_Topaydi-0.0.1-SNAPSHOT/home" class="bg-gray-900 text-white block px-3 py-2 rounded-md text-base font-medium" aria-current="page">Topaydi</a>

      <a href="/TP_JEE_Topaydi-0.0.1-SNAPSHOT/ideas" class="text-gray-300 hover:bg-gray-700 hover:text-white block px-3 py-2 rounded-md text-base font-medium">Ideas</a>

      <a href="/TP_JEE_Topaydi-0.0.1-SNAPSHOT/" class="text-gray-300 hover:bg-gray-700 hover:text-white block px-3 py-2 rounded-md text-base font-medium">Login</a>
      
      <c:choose>
	    <c:when test="${sessionScope['user'] != null}">
	         <a href="/TP_JEE_Topaydi-0.0.1-SNAPSHOT/admin" class="text-gray-300 hover:bg-gray-700 hover:text-white block px-3 py-2 rounded-md text-base font-medium">Admin</a>
	    </c:when>
	    <c:otherwise>
	    </c:otherwise>
		</c:choose>
    </div>
  </div>
</nav>

</body>
</html>