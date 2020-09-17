<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
  <title>Bootstrap 101 Template</title>

  <!-- Bootstrap 引入本地资源 当前目录下-->
  <link href="css/bootstrap.min.css" rel="stylesheet">
  <!-- jQuery导入 (也可引入本地jquery) -->
  <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
  <!--引入bootstrap的js文件   -->
  <script src="js/bootstrap.min.js"></script>
  <script type="text/javascript"></script>
</head>
<body>
<div align="center">
  <a href="${pageContext.request.contextPath}/userListServlet" style="..."><h1>点击浏览所有用户信息</h1></a>
</div>


</body>
</html>
