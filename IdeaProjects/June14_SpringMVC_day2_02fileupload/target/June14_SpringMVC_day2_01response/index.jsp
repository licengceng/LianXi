<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>传统方式文件上传</h2>
<%--提交表单，其实所有内容会被封装到request中--%>
<form action="user/fileupload1" method="post" enctype="multipart/form-data"> <%--把表单分成几个部分上传--%>
    选择文件：<input type="file" name="upload"><br>
    <input type="submit" value="上传" />
</form>

<hr>
<h2>Springmvc文件上传</h2>
<form action="user/fileupload2" method="post" enctype="multipart/form-data"> <%--把表单分成几个部分上传--%>
    选择文件：<input type="file" name="upload"><br>
    <input type="submit" value="上传" />
</form>

<hr>
<h2>跨服务器文件上传</h2>
<form action="user/fileupload3" method="post" enctype="multipart/form-data">
    选择文件：<input type="file" name="upload"><br>
    <input type="submit" value="上传" />
</form>

</body>
</html>
