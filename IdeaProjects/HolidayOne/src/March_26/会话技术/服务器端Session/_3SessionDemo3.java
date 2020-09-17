package March_26.会话技术.服务器端Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/3SessionDemo3")
public class _3SessionDemo3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //当客户端关闭后，服务器不关闭，两次获取的session对象默认情况不是同一个
        //如果需要相同，可创建cookie，键为JSESSIONID，设置最大存活时间，让cookie持久化存储

        //1.获取session
        HttpSession session = request.getSession();
        System.out.println(session);
        //期待客户端关闭后,session也能相同
        Cookie cookie = new Cookie("JSESSIONID", session.getId());
        cookie.setMaxAge(60*60);//设置持久化存储一个小时
        response.addCookie(cookie);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
