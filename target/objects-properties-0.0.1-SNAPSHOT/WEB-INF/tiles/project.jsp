<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="container-fluid">
	<!-- Breadcrumbs-->
	<ol class="breadcrumb">
		<li class="breadcrumb-item"><a href="<c:url value='/'/>">Objects
				Properties</a></li>
		<li class="breadcrumb-item active">Project</li>
	</ol>
	<h1>Project</h1>
	<hr>
	<div class="row">
		<div class="col-xl-3 col-sm-6 mb-3">
			<div class="card text-white bg-primary o-hidden h-100">
				<div class="card-body">
					<div class="card-body-icon">
						<i class="fa fa-fw fa-file-image-o"></i>
					</div>
					<div class="mr-5">Layout</div>
				</div>
				<a class="card-footer text-white clearfix small z-1"
					href="<c:url value='/projectlayout'/>"> <span class="float-left">View
						Details</span> <span class="float-right"> <i
						class="fa fa-angle-right"></i>
				</span>
				</a>
			</div>
		</div>
		<div class="col-xl-3 col-sm-6 mb-3">
          <div class="card text-white bg-success o-hidden h-100">
            <div class="card-body">
              <div class="card-body-icon">
                <i class="fa fa-fw fa-cogs"></i>
              </div>
              <div class="mr-5">Customize Fields</div>
            </div>
            <a class="card-footer text-white clearfix small z-1" href="#">
              <span class="float-left">View Details</span>
              <span class="float-right">
                <i class="fa fa-angle-right"></i>
              </span>
            </a>
          </div>
        </div>
	</div>
</div>