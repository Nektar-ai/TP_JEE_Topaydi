<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Welcome to Topaydi !</title>
		    <%@include file="commons/header.jsp"%>
		<style>
		
			.bloctitle1{
				text-orientation: mixed;
			    transform: rotate(180deg);
			    writing-mode: vertical-rl;
			}
			.bloctitle2{
				text-orientation: mixed;
			    writing-mode: vertical-rl;
			}

			.brain-cover {
				background: rgb(2,0,36); background: linear-gradient(38deg, rgba(2,0,36,1) 0%, rgba(9,9,121,1) 72%);
			}

		</style>
	</head>
	<body>
	 	<%@include file="commons/menu.jsp"%>
	   		<div class="w-full text-center flex justify-center p-5 my-2">
	   			<h1 class="text-7xl" >Welcome to Topaydi</h1>
	   		</div>
		<%@include file="commons/footer.jsp"%> 
		<div class="flex flex-col w-full">
			<div class="w-full flex justify-center my-5">
				<div class="rounded lg:w-4/5 md:w-4/5 sm:w-full bg-gray-100 shadow-lg p-3 flex">
					<div class="left lg:w-1/5 md:w-1/5 sm:w-full flex justify-center text-center">
						<h1 class="bloctitle1 font-bold text-7xl">
							Tops
						</h1>
					</div>
					<div class="right lg:w-4/5 md:w-4/5 sm:w-full">
						<div class="flex flex-wrap justify-around w-full">
							<c:forEach var="Idea" items="${listTops}">
								<div class=" w-1/3 p-4">
									<div class="bg-white shadow-xl rounded-lg overflow-hidden">
										<div class="bg-cover bg-center h-56 p-4"
											 style="background-image: url(${Idea.photo})">
										</div>
										<div class="m-2 text-justify text-sm">
											<h2 class=" font-bold h-2 mb-5 text-center"> ${Idea.titre } </h2>
											<p class=" text-xs p-3"> ${Idea.description}
											</p>
										</div>
										<div class="flex w-full justify-center py-4">
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
								</div>
							</c:forEach>
						</div>
					</div>
				</div>
			</div>
			<div class="w-full flex justify-center my-5">
				<div class="rounded lg:w-4/5 md:w-4/5 sm:w-full bg-gray-100 shadow-lg p-3 flex flex-row-reverse">
					<div class="left lg:w-1/5 md:w-1/5 sm:w-full flex justify-center text-center">
						<h1 class="bloctitle2 font-bold text-7xl">
							Buzz
						</h1>
					</div>
					<div class="right lg:w-4/5 md:w-4/5 sm:w-full">
						<div class="flex flex-wrap justify-around w-full">
							<c:forEach var="Idea" items="${listBuzz}">
								<div class=" w-1/3 p-4">
									<div class="bg-white shadow-xl rounded-lg overflow-hidden">
										<div class="bg-cover bg-center h-56 p-4"
											 style="background-image: url(${Idea.photo})">
										</div>
										<div class="m-2 text-justify text-sm">
											<h2 class=" font-bold h-2 mb-5 text-center"> ${Idea.titre } </h2>
											<p class=" text-xs p-3"> ${Idea.description}
											</p>
										</div>
										<div class="flex w-full justify-center py-4">
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
								</div>
							</c:forEach>
						</div>
					</div>
				</div>
			</div>
			<div class="w-full flex justify-center my-5">
				<div class="rounded lg:w-4/5 md:w-4/5 sm:w-full bg-gray-100 shadow-lg p-3 flex">
					<div class="left lg:w-1/5 md:w-1/5 sm:w-full flex justify-center text-center">
						<h1 class="bloctitle1 font-bold text-7xl">
							Brains
						</h1>
					</div>
					<div class="right lg:w-4/5 md:w-4/5 sm:w-full">
						<div class="flex flex-wrap justify-around w-full">
							<c:forEach var="User" varStatus="status" items="${listBrains}">
								<div class=" w-1/3 p-4">
									<div class="bg-white shadow-xl rounded-lg overflow-hidden">
										<div class="bg-cover bg-center h-56 p-4 brain-cover flex justify-center">
											<%-- <c:if test="${status.index+1 < listeBrains.size()}"> --%>
												<p class="text-white text-9xl text-center"> ${status.index+1} </p>
											<%-- </c:if> --%>
										</div>
										<div class="m-2 text-justify text-sm">
											<h2 class=" font-bold h-2 mb-5 text-center"> ${User.nickname} </h2>
											<p class="text-center text-xs p-3"> Nombre d'idees crées : ${nb[status.index]}</p>
										</div>
									</div>
								</div>
							</c:forEach>
						</div>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>