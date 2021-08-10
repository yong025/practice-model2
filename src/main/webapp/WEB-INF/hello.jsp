<%--
  Created by IntelliJ IDEA.
  User: stell
  Date: 2021-08-10
  Time: 오후 6:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Hello JSP Page</h1>

<h2>${msg}</h2>
<h3>${arr}</h3>
<ul>
    <c:forEach items="${arr}" var="str">
    <li>${str}</li>
    </c:forEach>
</ul>
</body>
</html>
