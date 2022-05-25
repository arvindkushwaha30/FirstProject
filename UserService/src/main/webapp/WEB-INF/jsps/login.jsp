<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src ="js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<script type="text/javascript" src="js/main.js"></script>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
</head>
<body style="margin-top: 10%;">

<div class="container border  col-sm-4">

	<form>
  <div class="mb-3">
  
     <input type="time" id="startTime" name="firstname"style="margin-top: 12px;width: 100%;" ></input>
    <input type="text"id="Inputtext" style="margin-top: 10px;"name = "name" class="form-control" id="name" required="required">
  </div>
  
  <input type="button" onclick="ajaxCall()" id ="btnSubmit" class="btn btn-primary mb-3" style="margin-left:175px;">
</form>
 </div>
</body>
</html> 