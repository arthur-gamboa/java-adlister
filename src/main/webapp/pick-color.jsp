<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Pick Color</title>
</head>
<body>

<h3>Pick Your Favorite Color</h3>
<form action="/pickcolor" method="POST">
    <input name="favorite-color" type="text" placeholder="Enter favorite color"><br>
    <input type="submit" value="Pick Color">
</form>

</body>
</html>