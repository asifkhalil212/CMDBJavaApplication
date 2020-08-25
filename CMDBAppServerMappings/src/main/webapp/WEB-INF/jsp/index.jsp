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



<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>

<script src="http://code.jquery.com/jquery-migrate-3.3.1.js"></script>

<link rel="stylesheet"
	href="https://cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css">

<script
	src="https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script>

</head>

<body>


	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="getApplicationServerMappings">Application-Server
					Mapping</a>
			</div>
			<ul class="nav navbar-nav">
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
			<c:when test="${mode == 'APPLICATION_VIEW'}">
				<center>
					<h2><br><br> Application Details</h2>
				</center>

				<table id="search" class="table table-striped" style="width: 100%">
					<thead>
						<tr>
							<th>Application ID</th>
							<th>Application Name</th>
							<th>Version</th>
							<!-- <th>Support</th> -->
							<th>Application Category ID</th>
							<!-- <th>Application Sub-Category ID</th> -->
							<th>Edit</th>
							<th>Delete</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="row" items="${applications}">
							<tr>
								<td><a
									href="getApplicationServerDetails?id=${row.application_id}"><u>${row.application_id}</u></a></td>
								<td>${row.application_name}</td>
								<td>${row.version}</td>
								<%-- <td>${row.support}</td> --%>
								<td>${row.application_cat_id}</td>
								<%-- <td>${row.application_sub_cat_id}</td> --%>
								<td class="text-center"><a
									href="updateApplication?id=${row.application_id}"
									class="glyphicon glyphicon-pencil"></a></td>
								<td class="text-center"><a
									onclick="if(!(confirm('Are you really want to delete Application record?')))return false"
									href="deleteApplication?id=${row.application_id}"
									class="glyphicon glyphicon-trash"></a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>

			</c:when>

			<c:when
				test="${mode == 'APPLICATION_EDIT' || mode == 'NEW_APPLICATION'}">
				<br><br><br><br>
				<form action="save" method="POST">
				
					<input type="hidden" class="form-control"
						value="${application.application_id}" id="application_id"
						name="application_id">

					<%-- <div class="form-group">
						<label for="application_id">Application ID</label> 
						<input type="text"	class="form-control" value="${application.application_id}" id="application_id" name="application_id">
					</div> --%>
					<div class="form-group">
						<label for="application_name">Application Name</label> <input
							type="text" class="form-control"
							value="${application.application_name}" id="application_name"
							name="application_name">
					</div>
					<div class="form-group">
						<label for="version">Version</label> <input type="text"
							class="form-control" value="${application.version}" id="version"
							name="version">
					</div>
					<div class="form-group">
						<label for="application_cat_id">Application Category Id</label> <input
							type="text" class="form-control"
							value="${application.application_cat_id}" id="application_cat_id">
					</div>

					<button type="submit" class="btn btn-default">Update</button>
				</form>
			</c:when>


		</c:choose>

	</div>



</body>
</html>
