<%--
  Created by IntelliJ IDEA.
  User: HY
  Date: 2020/7/11
  Time: 13:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3 style="border: solid red 1px">查询所有用户</h3>

    <c:forEach items="${list}" var="account">
        ${account.name}
        ${account.money}
    </c:forEach>

</body>
</html>
