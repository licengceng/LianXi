<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: HY
  Date: 2020/3/30
  Time: 13:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="true">
    <h1>我是真的</h1>
</c:if>
<%
//判断list集合是否为空，不为空则显示遍历集合
    List list=new ArrayList();
    list.add("aaa");
    list.add("bbb");
    request.setAttribute("bianli",list);
    request.setAttribute("number",4);
%>
<br>
<c:if test="${not empty bianli}">
    遍历集合<hr>
</c:if>
<c:if test="${number%2==0}">
    偶数
</c:if>
</body>
</html>
