<%-- 
    Document   : home
    Created on : Dec 25, 2019, 3:23:06 AM
    Author     : Namcx12
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <table border="1 solid black">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Role</th>
            </tr>
            <c:forEach var="emp" items="${requestScope.empList}">
                <tr>
                    <td><c:out value="${emp.id}"></c:out></td>
                    <td><c:out value="${emp.name}"></c:out></td>
                    <td><c:out value="${emp.role}"></c:out></td>
                    </tr>
            </c:forEach>
        </table>
        <br>
        <c:if test="${requestScope.htmlTagData ne null}">
            <c:out value="${requestScope.htmlTagData}" escapeXml="true"></c:out>
        </c:if>
        <br>
        <c:set var="id" value="5" scope="request"></c:set>
        <c:out value="${requestScope.id}"></c:out>
            <br>

        <c:catch var="exception">
            <% int x = 5 / 0;%>
        </c:catch>

        <c:if test="${exception ne null}">
            <p>Exception is: ${exception}<br>
                Exception Message: ${exception.message}
            </p>
        </c:if>

            <a href="<c:url value="${requestScope.url}"></c:url>">JournalDev</a>
    </body>
</html>
