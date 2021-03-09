<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>View Result</title>
</head>
<body>

<c:if test="${correct == true}">
    <h1>Correct!</h1>
    <a href="/guess">Play Again?</a>
</c:if>

<c:if test="${incorrect == true}">
    <h1>Incorrect.</h1>
    <a href="/guess">Play Again?</a>
</c:if>

</body>
</html>