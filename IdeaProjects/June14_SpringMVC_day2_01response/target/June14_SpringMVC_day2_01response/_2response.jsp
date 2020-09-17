
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>请求参数绑定</title>
</head>
<body>
<%--发送请求从后台查询数据，把数据存到model对象，存到request域，转发到页面 从request域中取出数据--%>
<h1><a href="user/testString">testString</a><br/></h1>

<hr>
<a href="user/testVoid">testVoid</a><br/>

<hr>
<a href="user/testModelAndView">testModelAndView</a><br/>

<hr>
<a href="user/testForwardOrRedirect">testForwardOrRedirect</a><br/>

<script src="js/jquery.min.js"></script>
<script>
    //页面加载，绑定单击事件
    $(function () {
        $("#btn").click(function() {
            // alert("hello btn");
            //发送ajax请求
            $.ajax({
                //编写json格式，设置属性和值
                url:"user/testAjax",
                contentType:"application/json;charset=UTF-8",
                data:'{"username":"hehe","password":"123","age":30}',
                dataType:"json",
                type:"post",
                success:function (data) {
                    //data服务器端响应的json数据，进行解析
                    alert(data);
                    alert(data.username);
                    alert(data.password);
                    alert(data.age);
                }
            })
        });
    });
</script>
<button id="btn">发送异步请求</button>



</body>
</html>
