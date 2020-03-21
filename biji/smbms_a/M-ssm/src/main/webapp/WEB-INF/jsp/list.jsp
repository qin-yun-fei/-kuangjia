<%--
  Created by IntelliJ IDEA.
  User: 秦
  Date: 2020/3/18
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2 >
    <c:forEach items="${list}" var="usr">
        <li>${usr.uid}</li>
        <li>${usr.age}</li>
        <li>${usr.uname}</li>
    </c:forEach>

</h2>
</body>
</html>
