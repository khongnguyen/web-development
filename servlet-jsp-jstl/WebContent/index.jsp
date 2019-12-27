<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Home Page</title>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
			<tr>
				<td><c:out value="1"></c:out></td>
				<td><c:out value="Minh"></c:out></td>
				<td><c:out value="Fresher"></c:out></td>
			</tr>

			<a href="<c:url value="/Servlet"></c:url>">Back to home</a>
		</tbody>
	</table>

</body>