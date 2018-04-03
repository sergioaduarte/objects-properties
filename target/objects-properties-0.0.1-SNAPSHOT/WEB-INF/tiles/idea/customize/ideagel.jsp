<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<jsp:useBean id="now" class="java.util.Date" />
<div class="container-fluid">
	<!-- Breadcrumbs-->
	<ol class="breadcrumb">
		<li class="breadcrumb-item"><a href="<c:url value='/'/>">Objects
				Properties</a></li>
		<li class="breadcrumb-item active"><a
			href="<c:url value='/idea'/>">Idea</a></li>
		<li class="breadcrumb-item active"><a
			href="<c:url value='/idea/ideacustomize'/>">Idea Customize</a></li>
		<li class="breadcrumb-item active">Gel Scripts</li>
	</ol>
	<h1>Gel Scripts</h1>
	<hr>
	<div class="card mb-3">
		<div class="card-header">
			<i class="fa fa-table"></i> Gel Scripts
		</div>
		<div class="card-body">
			<div class="table-responsive">
				<table class="table table-bordered" id="dataTable" width="100%"
					cellspacing="0">
					<thead>
						<tr>
							<th>Process Name</th>
							<th>Step</th>
							<th>Action</th>
							<th>Process Status</th>
							<th>Created Date</th>
							<th>Table Name</th>
							<th>Column Name</th>
						</tr>
					</thead>
					<tfoot>
						<tr>
							<th>Process Name</th>
							<th>Step</th>
							<th>Action</th>
							<th>Process Status</th>
							<th>Created Date</th>
							<th>Table Name</th>
							<th>Column Name</th>
						</tr>
					</tfoot>
					<tbody>
						<c:forEach var="ideaGel" items="${ideasGel}">
							<tr>
								<td><c:out value="${ideaGel.processName}"></c:out></td>
								<td><c:out value="${ideaGel.step}"></c:out></td>
								<td><c:out value="${ideaGel.action}"></c:out></td>
								<td><c:out value="${ideaGel.processStatus}"></c:out></td>
								<td><c:out value="${ideaGel.createdDate}"></c:out></td>
								<td><c:out value="${ideaGel.tableName}"></c:out></td>
								<td><c:out value="${ideaGel.columnName}"></c:out></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
		<div class="card-footer small text-muted">
			Updated at
			<fmt:formatDate value="${now}" type="both" />
		</div>
	</div>
</div>