<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home JSP</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<style>
table, th, td {
	border: 1px solid black;
}
</style>
</head>
<body>
	<%-- Using JSTL forEach and out to loop a list and display items in table --%>
	<table>
		<tbody>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Role</th>
			</tr>
			<c:forEach items="${employees}" var="emp">
				<tr>
					<td><c:out value="${emp.id}"></c:out></td>
					<td><c:out value="${emp.name}"></c:out></td>
					<td><c:out value="${emp.role}"></c:out></td>
				</tr>
			</c:forEach>
		</tbody>
	</table><br/>
	<%-- simple c:if and c:out example with HTML escaping --%>
	<c:if test="htmlTagData != null">
		<c:out value="${htmlTagData}" escapeXml="true"/>
	</c:if><br/>
	<%-- c:set example to set variable value --%>
	<c:set var="id" value="5" scope="request"/>
	<c:out value="${id}"/><br/>
	<%-- c:catch example --%>
	<c:catch var="exception">
		<% int x = 5/0; %>
	</c:catch>
	<c:if test="${exception != null}">
		<p>Exception is: ${exception} <br/>
		Exception message: ${exception.message}</p>
	</c:if><br/>
	<%-- c:url example --%>
	<a href="<c:url value="${url}"/>">JournalDev</a>
</body>
</html>