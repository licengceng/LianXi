<%@ page import="pratice4.User" %>
<%@ page import="java.util.*" %><%--
  Created by IntelliJ IDEA.
  User: HY
  Date: 2020/3/30
  Time: 12:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    User user=new User();
    user.setName("张三");
    user.setAge(23);
    user.setBirthday(new Date());
    request.setAttribute("u",user);

    List list=new ArrayList();
    list.add("1");
    list.add("2");
    list.add(user);
    session.setAttribute("list",list);

    Map map=new HashMap();
    map.put("gender","男");
    map.put("mname","李四");
    map.put("user",user);
    session.setAttribute("map",map);
%>
<h3>el获取对象</h3>
<%--通过域获取user对象属性 setter和getter方法去掉set和get剩下的部分，再将首字母小写--%>
${requestScope.u}<br>
${requestScope.u.name}<br>
${u.age}<br>
${requestScope.u.birthday}<br>
${requestScope.u.birthday.year}<br><%--Date类有一个getYear()方法，故可通过该属性获取生日的年份--%>
${u.birthday.month}<br><%--注：年份索引从零开始 1月则显示0--%>
${u.birth}<%--格式化生日，方便观察--%>

<h3>el获取list集合</h3>
${sessionScope.list}<br>
${sessionScope.list[0]}<br>
${sessionScope.list[1]}<br>
${list[2]}<br>
${list[2].name}<br>
<h3>el获取map集合</h3>
${sessionScope.map}<br>
${sessionScope.map.gender}<br>
${map.mname}<br>
${map.user}<br>

<h3>el判断字符串，集合，数组对象是否为null或者长度为0</h3>
<%
String str="";
List nulllist=new ArrayList();//创建集合但不往集合添加任何元素
request.setAttribute("str",str);
request.setAttribute("panduan",nulllist);
%>
${empty str}<br>
${not empty str}<br>
${empty panduan}<br>
${not empty panduan}<br>
</body>
</html>
