<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<style>
table, th, td {
	border: 1px solid black;
}
</style>
</head>
<body>
	<table>
		<tbody>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Role</th>
			</tr>

			<c:forEach items="${requestScope.stuList}" var="stu">
				<tr>
					<td><c:out value="${stu.id}"></c:out></td>
					<td><c:out value="${stu.name}"></c:out></td>
					<td><c:out value="${stu.role}"></c:out></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>

