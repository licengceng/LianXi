<%--
  Created by IntelliJ IDEA.
  User: HY
  Date: 2020/3/29
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el表达式</title>
</head>
<body>
<%
//在域中存储数据
    request.setAttribute("name","张三");
    request.setAttribute("age","23");
%>
<h3>el获取值</h3>
${requestScope.name}
${requestScope.age}
${requestScope.haha}<%--若获取不到相应值，则显示空字符串 --%>
</body>
</html>
