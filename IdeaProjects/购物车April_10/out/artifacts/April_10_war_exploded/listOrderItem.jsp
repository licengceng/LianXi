<%--
  Created by IntelliJ IDEA.
  User: HY
  Date: 2020/4/14
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>用户购物车表单</title>
</head>
<body>
<h1 align="center">购物车</h1>
<table align="center" border="1" cellspacing='0'>
    <tr>
        <td>商品名称</td>
        <td>单价</td>
        <td>数量</td>
        <td>小计</td>
    </tr>
    <c:forEach items="${ois}" var="oi" varStatus="s"></c:forEach>
    <tr>
        <td>${oi.product.name}</td>
    </tr>
</table>
</body>
</html>
