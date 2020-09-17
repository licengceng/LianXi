

                                     <%-- isELIgnored="false"不忽略EL表达式--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
 执行成功 <br>
<script>
    document.write("拦截器执行了拦截。。")
</script>
 <%--前后百分号-- java脚本语言--%>
<%System.out.println("拦截器执行了拦截。。"); %> <%--往控制台输出打印--%>
</body>
</html>
