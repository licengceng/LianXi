

                                     <%-- isELIgnored="false"不忽略EL表达式--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
 执行成功 <br>
 <%--发送请求从后台查询数据，把数据存到model对象，存到request域，转发到页面 从request域中取出数据--%>
${requestScope.user.username}<br>
${requestScope.user.password}<br>
${user.username}<br>
${user.password}<br>

</body>
</html>
