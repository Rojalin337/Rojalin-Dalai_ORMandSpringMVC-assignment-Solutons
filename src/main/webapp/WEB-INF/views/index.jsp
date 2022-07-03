<html>
<head>
<%@include file="./base.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script type="text/javascript"> 
function  showAlert(){ 
 confirm("Are you sure you want to delete?");
     
} 
</script>

</head>
<body>

	<div class="container mt-3">

		<div class="row">
			<div class="col-md-12">
				<h1  class="text-center mb-3">CUSTOMER RELATIONSHIP MANAGEMENT</h1>

				<div class="container">
					<a href="add-customer" class="btn btn-outline-success"> Add
						Customer</a>
				</div>
				<br>

				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">ID</th>
							<th scope="col">First Name</th>
							<th scope="col">Last Name</th>
							<th scope="col">Email</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${customer}" var="cus">
							<tr>
								<th scope="row">${cus.id}</th>
								<td>${cus.firstname}</td>
								<td>${cus.lastname }</td>
								<td>${cus.email}</td>
								<td><a href="update/${cus.id}"><i class="fa-solid fa-pen-nib"></i></a></td>
								<td><a href="delete/${cus.id}"onclick="showAlert()"><i
										class="fa-solid fa-trash text-danger"></i></a></td>
								
							</tr>
						</c:forEach>
					</tbody>
				</table>

			</div>
		</div>
	</div>
</body>
</html>
