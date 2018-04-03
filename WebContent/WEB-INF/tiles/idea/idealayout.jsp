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
		<li class="breadcrumb-item active">Idea Layout</li>
	</ol>
	<h1>Idea Layout</h1>
	<hr>
	<div class="card mb-3">
		<div class="card-header">
			<i class="fa fa-table"></i> Idea Layout
		</div>
		<div class="card-body">
			<div class="table-responsive">
				<table class="table table-bordered" id="dataTable" width="100%"
					cellspacing="0">
					<thead>
						<tr>
							<th>Subpage</th>
							<th>Section</th>
							<th>Field Name</th>
							<th>Field Position</th>
							<th>Clarity Field Type</th>
							<th>Value Required?</th>
							<th>Is Read Only?</th>
							<th>Has Default?</th>
							<th>Table Name</th>
							<th>Column Name</th>
						</tr>
					</thead>
					<tfoot>
						<tr>
							<th>Subpage</th>
							<th>Section</th>
							<th>Field Name</th>
							<th>Field Position</th>
							<th>Clarity Field Type</th>
							<th>Value Required?</th>
							<th>Is Read Only?</th>
							<th>Has Default?</th>
							<th>Table Name</th>
							<th>Column Name</th>
						</tr>
					</tfoot>
					<tbody>
						<c:forEach var="objectIdea" items="${objectIdeas}">
							<tr>
								<td><c:out value="${objectIdea.subpage}"></c:out></td>
								<td><c:out value="${objectIdea.section}"></c:out></td>
								<td><c:out value="${objectIdea.fieldName}"></c:out></td>
								<td><c:out value="${objectIdea.columnPosition}"></c:out></td>
								<td><c:out value="${objectIdea.clarityFieldType}"></c:out></td>
								<td><c:out value="${objectIdea.isValueRequired}"></c:out></td>
								<td><c:out value="${objectIdea.isReadOnly}"></c:out></td>
								<td><c:out value="${objectIdea.hasDefault}"></c:out></td>
								<td><c:out value="${objectIdea.tableName}"></c:out></td>
								<td><c:out value="${objectIdea.columnName}"></c:out></td>
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