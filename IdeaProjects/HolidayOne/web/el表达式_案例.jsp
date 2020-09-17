<%@ page import="pratice4.User" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: HY
  Date: 2020/3/31
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<User> list=new ArrayList();
    list.add(new User("张三",23,new Date()));
    list.add(new User("李四",24,new Date()));
    list.add(new User("王五",25,new Date()));
    request.setAttribute("heroList",list);
%>
<table border="1" width="1000px" align="center">
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>生日</th>
    </tr>
    <%--var容器中元素的临时变量（对象）varStatus循环状态对象.count 循环次数，从1开始--%>
    <c:forEach items="${heroList}" var="user" varStatus="s">
        <c:if test="${s.count%2!=0}"><%--基数行显示背景色粉红色--%>
    <tr bgcolor="#ffc0cb">
        <td>${s.count}</td>
        <td>${user.name}</td>
        <td>${user.age}</td>
        <td>${user.birth}</td>
    </tr>
        </c:if>

        <c:if test="${s.count%2==0}"><%--偶数行显示背景色绿色--%>
            <tr bgcolor="#7fff00">
                <td>${s.count}</td>
                <td>${user.name}</td>
                <td>${user.age}</td>
                <td>${user.birth}</td>
            </tr>
        </c:if>
    </c:forEach>
</table>
</body>
</html>
