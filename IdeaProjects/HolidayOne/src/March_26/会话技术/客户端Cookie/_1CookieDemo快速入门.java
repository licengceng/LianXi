package March_26.会话技术.客户端Cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet( "/CookieDemo1")
public class _1CookieDemo快速入门 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.创建Cookie对象，绑定数据
        Cookie cookie = new Cookie("msg","hello");
        Cookie cookie2 = new Cookie("name","zhangsan");

        //可设置Cookie存活时间
        cookie.setMaxAge(30);//将Cookie持久化到硬盘，30秒后自动删除cookie文件
        cookie2.setMaxAge(-1);//设置为负数则为原默认值
        cookie.setMaxAge(0);//设置为0则删除cookie文件数据信息

        //2.发送Cookie对象
        response.addCookie(cookie);
        response.addCookie(cookie2);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
