<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Ads</title>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="Welcome to my page." />
    </jsp:include>
</head>
<body>
    <h3>Here are your Ads</h3>

<c:forEach items="${ads}" var="ad">
    <div>
        <h4>${ad.getTitle()}</h4><br>
        <p>ID: ${ad.id}</p><br>
        <p>Description: ${ad.description}</p>
    </div>
</c:forEach>

</body>
</html>
