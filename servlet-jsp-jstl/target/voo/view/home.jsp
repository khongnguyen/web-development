<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE>
<html>
<head>
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
    <c:forEach items="${requestScope.empList}" var="emp">
        <tr>
            <td><c:out value="${emp.id}"></c:out></td>
            <td><c:out value="${emp.name}"></c:out></td>
            <td><c:out value="${emp.role}"></c:out></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<br><br>
<c:if test="${requestScope.htmlTagData ne null }">
    <c:out value="${requestScope.htmlTagData}" escapeXml="true"></c:out>
</c:if>
<br><br>
<c:set var="id" value="5" scope="request"></c:set>
<c:out value="${requestScope.id }"></c:out>
<br><br>
<c:catch var="exception">
    <% int x = 5 / 0;%>
</c:catch>

<c:if test="${exception ne null}">
    <p>Exception is : ${exception} <br>
        Exception Message: ${exception.message}</p>
</c:if>
<br><br>
<a href="<c:url value="${requestScope.url }"></c:url>">JournalDev</a>
</body>
</html>
