<%--
  Created by IntelliJ IDEA.
  User: HY
  Date: 2020/6/11
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>请求参数绑定</title>
</head>
<body>
<h1><a href="param/testParam?username=hehe&password=123">请求参数绑定</a><br/></h1>
<%--<h1>多个请求参数</h1>--%>
<%--<form action="param/saveAccount" method="post">--%>
<%--    用户:<input type="text" name="username"><br/> &lt;%&ndash;注意name的键值属性要和Acoount类中的属性一致&ndash;%&gt;--%>
<%--    密码:<input type="password" name="password"><br/> &lt;%&ndash;注意name的键值属性要和Acoount类中的属性一致&ndash;%&gt;--%>
<%--    金额:<input type="text" name="money"><br/>    &lt;%&ndash;注意name的键值属性要和Acoount类中的属性一致&ndash;%&gt;--%>
<%--    &lt;%&ndash;引用类型的封装&ndash;%&gt;--%>
<%--    用户姓名:<input type="text" name="user.uname"><br/>   &lt;%&ndash;user为封装到Account类属性的引用&ndash;%&gt;--%>
<%--    用户年龄:<input type="text" name="user.age"><br/>--%>
<%--    <input type="submit" value="提交" />--%>
<%--</form>--%>

<%--把数据封装到Account类中，类中存在list和map集合--%>
<h1>有集合类型的参数绑定</h1>
<form action="param/saveAccount" method="post">
    用户:<input type="text" name="username"><br/> <%--注意name的键值属性要和Acoount类中的属性一致--%>
    密码:<input type="password" name="password"><br/> <%--注意name的键值属性要和Acoount类中的属性一致--%>
    金额:<input type="text" name="money"><br/>    <%--注意name的键值属性要和Acoount类中的属性一致--%>
    <%--引用类型的封装--%>
    用户姓名:<input type="text" name="list[0].uname"><br/>   <%--user为封装到Account类属性的引用--%>
    用户年龄:<input type="text" name="list[0].age"><br/>

    用户姓名:<input type="text" name="map['one'].uname"><br/>   <%--user为封装到Account类属性的引用--%>
    用户年龄:<input type="text" name="map['one'].age"><br/>
    <input type="submit" value="提交" />
</form>
<hr/>
<h1>自定义类型转换器</h1><%--浏览器输入字符串类型，将其转换成日期格式--%>
<form action="param/saveUser" method="post">
    用户姓名:<input type="text" name="uname"><br/>
    用户年龄:<input type="text" name="age"><br/>
    用户生日:<input type="text" name="date"><br/>
    <input type="submit" value="提交" />
</form>
</body>
</html>
