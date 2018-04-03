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
		<li class="breadcrumb-item active">Details</li>
	</ol>
	<h1>Details</h1>
	<hr>
	<div class="card mb-3">
		<div class="card-header">
			<i class="fa fa-table"></i> Idea Customization Details
		</div>
		<div class="card-body">
			<div class="table-responsive">
				<table class="table table-bordered" id="dataTable" width="100%"
					cellspacing="0">
					<thead>
						<tr>
							<th>Table Name</th>
							<th>Column Name</th>
							<th>Data Type</th>
							<th>Nullable</th>
							<th>Displayed?</th>
							<th>Used in GEL?</th>
							<th>Used in Step Actions?</th>
							<th>Used as Process Start Option?</th>
							<th>Used in Notification?</th>
							<th>Used in Pre or Post Conditions?</th>
						</tr>
					</thead>
					<tfoot>
						<tr>
							<th>Table Name</th>
							<th>Column Name</th>
							<th>Data Type</th>
							<th>Nullable</th>
							<th>Displayed?</th>
							<th>Used in GEL?</th>
							<th>Used in Step Actions?</th>
							<th>Used as Process Start Option?</th>
							<th>Used in Notification?</th>
							<th>Used in Pre or Post Conditions?</th>
						</tr>
					</tfoot>
					<tbody>
						<c:forEach var="ideasdetail" items="${ideasdetails}">
							<tr>
								<td><c:out value="${ideasdetail.tableName}"></c:out></td>
								<td><c:out value="${ideasdetail.columnName}"></c:out></td>
								<td><c:out value="${ideasdetail.dataType}"></c:out></td>
								<td><c:out value="${ideasdetail.nullable}"></c:out></td>
								<td><c:out value="${ideasdetail.displayed}"></c:out></td>
								<td><c:out value="${ideasdetail.gels}"></c:out></td>
								<td><c:out value="${ideasdetail.actions}"></c:out></td>
								<td><c:out value="${ideasdetail.startop}"></c:out></td>
								<td><c:out value="${ideasdetail.notif}"></c:out></td>
								<td><c:out value="${ideasdetail.prepost}"></c:out></td>
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