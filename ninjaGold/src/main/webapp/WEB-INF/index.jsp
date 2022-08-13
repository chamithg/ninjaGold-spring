<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/style.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container m-5 p-5 border border-info">
<h1>Your Gold: <span><c:out value="${gold}"/></span></h1>
<div class="box-container d-flex justify-content-between mb-5">
	<div class="box border border-warning d-flex align-items-center flex-column" style="width: 250px; height:250px;">
		<h3 class="mb-5">Farm</h3>
		<h4 class="mb-5">(Earns 10-20 gold)</h4>
		<a href="/gold/farm" class="btn btn-primary"> Find Gold!</a>
	
	</div>
	<div class="box border border-warning d-flex align-items-center flex-column" style="width: 250px; height:250px;">
		<h3 class="mb-5">Cave</h3>
		<h4 class="mb-5">(Earns 5-10 gold)</h4>
		<a href="/gold/cave" class="btn btn-primary"> Find Gold!</a>
	
	</div>
	<div class="box border border-warning d-flex align-items-center flex-column" style="width: 250px; height:250px;">
		<h3 class="mb-5">House</h3>
		<h4 class="mb-5">(Earns 2-5 gold)</h4>
		<a href="gold/house" class="btn btn-primary"> Find Gold!</a>
	
	</div>
	<div class="box border border-warning d-flex align-items-center flex-column" style="width: 250px; height:250px;">
		<h3 class="mb-5">Quest</h3>
		<h4 class="mb-5">(Add/remover 0-50 gold)</h4>
		<a href="/gold/quest" class="btn btn-primary"> Find Gold!</a>
	
	</div>


</div>
<h3 class="mb-5">Activities:-</h3>

<div class="overflow-scroll border p-5 " style="width: 1200px; height:300px;">
<c:forEach items="${actions}" var="action">
<p>${action}</p>

</c:forEach>

</div>


</div>

</body>
</html>