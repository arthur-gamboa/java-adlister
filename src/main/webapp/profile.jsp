<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Profile</title>
</head>
    <body>
    <h1>Profile Page</h1>
    <c:choose>
        <c:when test="${param.containsKey('username')}">
            <p>Hello there, ${param.username}</p>
        </c:when>
        <c:otherwise>
            <p>Unauthorized User.</p>
        </c:otherwise>
    </c:choose>
    </body>
</html>