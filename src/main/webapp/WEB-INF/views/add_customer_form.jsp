<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp" %>
</head>
<body>
<div class="container mt-3">

     <div class="row">
        <div class="col-md-6 offset-md-3">
         <h1 class="text-center mb-3">Save Customer</h1>
         <form action="handle-customer" method="post">
         <div class="form-group">
         <label for="firstname"> Firstname:</label>
         <input type="text"
         class="form-control"
         id="firstname" aria-describedby="emailHelp" name="firstname" placeholder="Enter your firstname here">
         </div>
         
         <div class="form-group">
         <label for="lastname"> Lastname: </label>
         <input type="text"
         class="form-control"
         id="lastname" aria-describedby="emailHelp" name="lastname" placeholder="Enter your lastname here">
         </div>
           
           <div class="form-group">
         <label for="email"> Email:</label>
         <input type="text"
         class="form-control"
         id="email" aria-describedby="emailHelp" name="email" placeholder="Enter your email here">
         </div>
         
         <div class="container-text-center">
         <a href="${pageContext.request.contextPath}/" class="btn btn-outline-danger"> Back</a>
         <button type="submit" class="btn btn-primary">Save</button>
         </div>
         </form>
        </div>
     
     
     </div>

</div>
</body>
</html>