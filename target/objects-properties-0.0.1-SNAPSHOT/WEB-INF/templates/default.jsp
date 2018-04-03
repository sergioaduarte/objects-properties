<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title><tiles:getAsString name="title" /></title>
<link
	href="${pageContext.request.contextPath}/static/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/static/vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link
	href="${pageContext.request.contextPath}/static/vendor/datatables/dataTables.bootstrap4.css"
	rel="stylesheet">
<!-- Custom styles for this template-->
<link href="${pageContext.request.contextPath}/static/css/sb-admin.css"
	rel="stylesheet">
<script
	src="${pageContext.request.contextPath}/static/vendor/jquery/jquery.js"></script>
<script
	src="${pageContext.request.contextPath}/static/vendor/bootstrap/js/bootstrap.bundle.js"></script>
<script
	src="${pageContext.request.contextPath}/static/vendor/jquery-easing/jquery.easing.js"></script>
<script
	src="${pageContext.request.contextPath}/static/vendor/datatables/jquery.dataTables.js"></script>
<script
	src="${pageContext.request.contextPath}/static/vendor/datatables/dataTables.bootstrap4.js"></script>
<script
	src="${pageContext.request.contextPath}/static/script/sb-admin.js"></script>
<script
	src="${pageContext.request.contextPath}/static/script/sb-admin-datatables.js"></script>

</head>
<body class="fixed-nav sticky-footer bg-dark" id="page-top">
	<tiles:insertAttribute name="header" />
	<div class="content-wrapper">
		<tiles:insertAttribute name="body" />
		<footer class="sticky-footer">
		<div class="container">
			<div class="text-center">
				<small>Copyright © Sergio Duarte - 2018</small>
			</div>
		</div>
		</footer>
	</div>

</body>
</html>