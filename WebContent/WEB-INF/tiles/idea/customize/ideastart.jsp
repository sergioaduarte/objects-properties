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
		<li class="breadcrumb-item active">Start Options</li>
	</ol>
	<h1>Start Options</h1>
	<hr>
	<div class="card mb-3">
		<div class="card-header">
			<i class="fa fa-table"></i> Start Options
		</div>
		<div class="card-body">
			<div class="table-responsive">
				<table class="table table-bordered" id="dataTable" width="100%"
					cellspacing="0">
					<thead>
						<tr>
							<th>Process Name</th>
							<th>Trigger Option</th>
							<th>User Status Code</th>
							<th>Table Name</th>
							<th>Column Name</th>
						</tr>
					</thead>
					<tfoot>
						<tr>
							<th>Process Name</th>
							<th>Trigger Option</th>
							<th>User Status Code</th>
							<th>Table Name</th>
							<th>Column Name</th>
						</tr>
					</tfoot>
					<tbody>
						<c:forEach var="ideaStart" items="${ideasstart}">
							<tr>
								<td><c:out value="${ideaStart.processName}"></c:out></td>
								<td><c:out value="${ideaStart.triggerOption}"></c:out></td>
								<td><c:out value="${ideaStart.userStatusCode}"></c:out></td>
								<td><c:out value="${ideaStart.tableName}"></c:out></td>
								<td><c:out value="${ideaStart.columnName}"></c:out></td>
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