<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="container-fluid">
	<!-- Breadcrumbs-->
	<ol class="breadcrumb">
		<li class="breadcrumb-item"><a href="<c:url value='/'/>">Objects
				Properties</a></li>
		<li class="breadcrumb-item active"><a
			href="<c:url value='/idea'/>">Idea</a></li>
		<li class="breadcrumb-item active">Idea Customize</li>
	</ol>
	<h1>Idea Customize</h1>
	<hr>
	<div class="row">
		<div class="col-xl-3 col-sm-6 mb-3">
			<div class="card text-white bg-primary o-hidden h-100">
				<div class="card-body">
					<div class="card-body-icon">
						<i class="fa fa-fw fa-info-circle"></i>
					</div>
					<div class="mr-5">Details</div>
				</div>
				<a class="card-footer text-white clearfix small z-1"
					href="<c:url value='/idea/customize/ideadetails'/>"> <span
					class="float-left">View Details</span> <span class="float-right">
						<i class="fa fa-angle-right"></i>
				</span>
				</a>
			</div>
		</div>
		<div class="col-xl-3 col-sm-6 mb-3">
			<div class="card text-white bg-success o-hidden h-100">
				<div class="card-body">
					<div class="card-body-icon">
						<i class="fa fa-fw fa-barcode"></i>
					</div>
					<div class="mr-5">Gel Scripts</div>
				</div>
				<a class="card-footer text-white clearfix small z-1"
					href="<c:url value='/idea/customize/ideagel'/>"> <span
					class="float-left">View Details</span> <span class="float-right">
						<i class="fa fa-angle-right"></i>
				</span>
				</a>
			</div>
		</div>
		<div class="col-xl-3 col-sm-6 mb-3">
			<div class="card text-white bg-warning o-hidden h-100">
				<div class="card-body">
					<div class="card-body-icon">
						<i class="fa fa-fw fa-at"></i>
					</div>
					<div class="mr-5">Actions</div>
				</div>
				<a class="card-footer text-white clearfix small z-1"
					href="<c:url value='/idea/customize/ideaactions'/>"> <span
					class="float-left">View Details</span> <span class="float-right">
						<i class="fa fa-angle-right"></i>
				</span>
				</a>
			</div>
		</div>
		<div class="col-xl-3 col-sm-6 mb-3">
			<div class="card text-white bg-info o-hidden h-100">
				<div class="card-body">
					<div class="card-body-icon">
						<i class="fa fa-fw fa-play"></i>
					</div>
					<div class="mr-5">Start Option</div>
				</div>
				<a class="card-footer text-white clearfix small z-1"
					href="<c:url value='/idea/customize/ideastart'/>"> <span
					class="float-left">View Details</span> <span class="float-right">
						<i class="fa fa-angle-right"></i>
				</span>
				</a>
			</div>
		</div>
		<div class="col-xl-3 col-sm-6 mb-3">
			<div class="card text-white bg-danger o-hidden h-100">
				<div class="card-body">
					<div class="card-body-icon">
						<i class="fa fa-fw fa-commenting-o"></i>
					</div>
					<div class="mr-5">Notifications</div>
				</div>
				<a class="card-footer text-white clearfix small z-1"
					href="<c:url value='/idea/customize/ideanotifications'/>"> <span
					class="float-left">View Details</span> <span class="float-right">
						<i class="fa fa-angle-right"></i>
				</span>
				</a>
			</div>
		</div>
		<div class="col-xl-3 col-sm-6 mb-3">
			<div class="card text-white bg-secondary o-hidden h-100">
				<div class="card-body">
					<div class="card-body-icon">
						<i class="fa fa-fw fa-list-ol"></i>
					</div>
					<div class="mr-5">PRE or POST Conditions</div>
				</div>
				<a class="card-footer text-white clearfix small z-1"
					href="<c:url value='/idea/customize/ideaconditions'/>"> <span
					class="float-left">View Details</span> <span class="float-right">
						<i class="fa fa-angle-right"></i>
				</span>
				</a>
			</div>
		</div>

	</div>
</div>