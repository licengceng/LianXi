<%--
  Created by IntelliJ IDEA.
  User: HY
  Date: 2020/6/12
  Time: 17:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>
<a href="param/testParam?username=hehe&password=123">请求参数绑定</a></h1>
<hr>
<h1>常用注解RequestParam--<a href="ano/testRequestParam?uname=RequestParam">RequestParam</a></h1>
<hr>
<form action="ano/testRequestBody" method="post">
    用户姓名:<input type="text" name="username"><br/>
    用户年龄:<input type="text" name="age"><br/>
    用户生日:<input type="text" name="date"><br/>
    <input type="submit" value="提交" />
</form>
<hr>
<h1>restful风格获取占位符(比如获取id)</h1>
    <a href="ano/testPathVariable/10">请求参数绑定</a><br/>

<hr>
<h1><a href="ano/testCookieValue">CookieValue</a></h1>

<hr>
<form action="ano/testModelAttribute" method="post">
    用户姓名:<input type="text" name="uname"><br/>
    用户年龄:<input type="text" name="age"><br/>
    <input type="submit" value="提交" />
</form>

<hr>
<h1><a href="ano/testSessionAttributes">SessionAttributes</a></h1>

<hr>
<h1><a href="ano/getSessionAttributes">getSessionAttributes</a></h1>

<hr>
<h1><a href="ano/deleteSessionAttributes">deleteSessionAttributes</a></h1>
</body>
</html>
