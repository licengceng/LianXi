<%--
  Created by IntelliJ IDEA.
  User: HY
  Date: 2020/4/10
  Time: 17:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body><%--cellspacing="0"意思是table表格中的单元格子之间的空白距离为0像素--%>
<table  align='center' border='1' cellspacing='0'>
    <tr>
        <th>id</th>
        <th>名称</th>
        <th>价格</th>
        <th>购买</th>
    </tr>
    <c:forEach items="${products}" var="product" varStatus="s">
        <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td>${product.price}</td>
            <td>
                <form action="addOrderItem" method="post">
                    数量<input type="text" value="1" name="num">
                    <input type="hidden" name="pid" value="${product.id}">
                    <input type="submit" value="购买" >
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
