<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Test Maven</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
</head>
<style>
table, th, td {
	border: 1px solid black;
}
</style>
<body>

<table>
		<tbody>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Age</th>
				<th>Address</th>
				<th>Mail</th>
				<th>Status</th>
			</tr>
			<c:forEach items="${requestScope.ListS}" var="emp">
				<tr>
					<td><c:out value="${emp.studentId}"></c:out></td>
					<td><c:out value="${emp.studentName}"></c:out></td>
					<td><c:out value="${emp.age}"></c:out></td>
					<td><c:out value="${emp.stuAddress}"></c:out></td>
					<td><c:out value="${emp.stuMail}"></c:out></td>
					<td><c:out value="${emp.stuStatus}"></c:out></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>