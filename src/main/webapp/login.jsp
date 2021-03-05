<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%
    if (request.getMethod().equals("POST")) {

        if (request.getParameter("username").equals("admin") && request.getParameter("userPass").equals("password")) {
            response.sendRedirect("/profile.jsp?username=" + request.getParameter("username"));
        } else {
            response.sendRedirect("/login.jsp");
        }
    }
%>

<html>
    <body>
        <form method="POST" action="/login.jsp">
            <label for="username">Username</label>
            <input id="username" name="username" type="text">
                <br>
            <label for="userPass">Password</label>
            <input id="userPass" name="userPass" type="password">
                <br>
            <input type="submit">
        </form>
    </body>
</html>