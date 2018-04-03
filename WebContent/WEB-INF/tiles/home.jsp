<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<div class="container-fluid">
	<!-- Breadcrumbs-->
	<ol class="breadcrumb">
		<li class="breadcrumb-item"><a href="<c:url value='/'/>">Objects Properties</a></li>
		<li class="breadcrumb-item active">DashBoard</li>
	</ol>
	<h1>DashBoard</h1>
	<hr>
	<!-- Icon Cards-->
	<div class="row">
		<div class="col-xl-3 col-sm-6 mb-3">
			<div class="card text-white bg-primary o-hidden h-100">
				<div class="card-body">
					<div class="card-body-icon">
						<i class="fa fa-fw fa-lightbulb-o"></i>
					</div>
					<div class="mr-5">Idea</div>
				</div>
				<a class="card-footer text-white clearfix small z-1" href="<c:url value='/idea'/>"> <span
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
						<i class="fa fa-fw fa-rocket"></i>
					</div>
					<div class="mr-5">Project</div>
				</div>
				<a class="card-footer text-white clearfix small z-1" href="<c:url value='/project'/>"> <span
					class="float-left">View Details</span> <span class="float-right">
						<i class="fa fa-angle-right"></i>
				</span>
				</a>
			</div>
		</div>
		<!-- <div class="col-xl-3 col-sm-6 mb-3">
			<div class="card text-white bg-success o-hidden h-100">
				<div class="card-body">
					<div class="card-body-icon">
						<i class="fa fa-fw fa-shopping-cart"></i>
					</div>
					<div class="mr-5">123 New Orders!</div>
				</div>
				<a class="card-footer text-white clearfix small z-1" href="#"> <span
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
						<i class="fa fa-fw fa-support"></i>
					</div>
					<div class="mr-5">13 New Tickets!</div>
				</div>
				<a class="card-footer text-white clearfix small z-1" href="#"> <span
					class="float-left">View Details</span> <span class="float-right">
						<i class="fa fa-angle-right"></i>
				</span>
				</a>
			</div>
		</div>
	-->
	</div>
</div>