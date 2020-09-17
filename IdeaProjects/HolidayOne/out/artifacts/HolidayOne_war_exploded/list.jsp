<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><%--用标签库--%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>展示用户页面</title>

    <!-- Bootstrap 引入本地资源 当前目录下-->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- jQuery导入 (也可引入本地jquery) -->
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
    <!--引入bootstrap的js文件   -->
    <script src="js/bootstrap.min.js"></script>
    <script type="text/javascript"></script>
</head>
<style>
    td,th{
        text-align: center;
    }
</style>
<body>
<div class="container">
    <h3>用户信息列表</h3>
    <table>
        <tr>
            <th>编号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>年龄</th>
            <th>籍贯</th>
            <th>QQ</th>
            <th>邮箱</th>
            <th>操作</th>
        </tr>
    <c:forEach items="${users}" var="user" varStatus="s">
        <tr>
            <td>${s.count}</td>
            <td>${s.name}</td>
            <td>${s.gender}</td>
            <td>${s.age}</td>
            <td>${s.address}</td>
            <td>${s.qq}</td>
            <td>${s.email}</td>
        </tr>
    </c:forEach>
        <tr>
            <td></td>
        </tr>
    </table>
</div>

</body>
</html>
