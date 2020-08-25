<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
<title>CMDB Application-Server Mapping</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/search.js"></script>



<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"
	integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"
	integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k"
	crossorigin="anonymous"></script>

<script src="http://code.jquery.com/jquery-migrate-3.3.1.js"
	integrity="sha256-lGuUqJUPXJEMgQX/RRaM6mZkK6ono5i5bHuBME4qOCo="
	crossorigin="anonymous"></script>

<link rel="stylesheet"
	href="https://cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css">

<script
	src="https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script>

</head>
<body>
	<nav class="navbar navbar-expand-md navbar-inverse navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="getApplicationServerMappings">Application-Server
					Mapping</a>
			</div>
			<ul class="nav navbar-nav ">
				<li class="active"><a href="/">All Applications</a></li>
				<li class="active"><a href="getAllServerDetails">All
						Servers</a></li>
				<li class="active"><a href="addApplication">Add Application</a></li>
				<li class="active"><a href="#">Import File</a></li>

			</ul>
		</div>
	</nav>
	<div class="container">

		<c:choose>


			<c:when test="${mode == 'APPLICATION_SERVER_MAPPINGS'}">
				
				<h2 class="text-center"><br><br>Application-Server Mapping</h2>
				<table id="search" class="table table-striped">
					<thead>
						<tr>
							<th>Application Category Name</th>
							<th>Application Name</th>
							<th>Server Name</th>

						</tr>
					</thead>
					<tbody>
						<c:forEach var="row" items="${applicationServerMappings}">
							<tr>

								<td>${row[0]}</td>
								<td>${row[1]}</td>
								<td>${row[2]}</td>

							</tr>
						</c:forEach>
					</tbody>
				</table>


			</c:when>


			<c:when test="${mode == 'APPLICATION_SERVER_DETAILS_VIEW'}">
				<h2 class="text-center"><br><br>Application-Server Details </h2>

				<table id="search" class="table table-striped">

					<thead>
						<tr>
							<th class="text-center">Application ID</th>
							<th>Application Name</th>
							<th>Application Category Name</th>

							<th>Server Name</th>
							<th>Location Name</th>
							<th>O/S Name</th>
							<th>Temp</th>
							<th class="text-center">Server Type</th>

						</tr>
					</thead>
					<tbody>
						<c:forEach var="row" items="${applicationServerDetails}">
							<tr>

								<td class="text-center">${row[0]}</td>
								<td>${row[1]}</td>
								<td>${row[2]}</td>
								<td>${row[3]}</td>

								<td>${row[4]}</td>
								<td>${row[5]}</td>
								<td>${row[6]}</td>
								
								<c:choose>
								<c:when test="${row[7] == true}">
									<td class="text-center">Virtual</td>
								</c:when>
								<c:otherwise>
									<td class="text-center">Physical</td>
								</c:otherwise>
								</c:choose>
								
								<%-- <td class="text-center">${row[7]}</td> --%>
								

							</tr>
						</c:forEach>
					</tbody>
				</table>
			</c:when>

		</c:choose>

	</div>
</body>
</html>