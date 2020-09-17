<%--
  Created by IntelliJ IDEA.
  User: HY
  Date: 2020/1/1
  Time: 20:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<input type="text" id="yz" placeholder="请输入六位数字或字母以上的文本" onkeyup="value=value.replace(/^[a-zA-Z0-9]{,6}$,'')" onblur="check()">
    <script>
        function check() {

            <%--        注册:<input type="text" id="yz" >--%>
        }
    </script>
</body>
</html>
