package March_25.Response;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/ResponseDemo1")
public class _1ResponseDemo1重定向 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ResponseDemo1被访问了。。。");
//        //访问ResponseDemo1，会自动跳转到responseDemo2资源
//          //1.设置响应码为302
//        response.setStatus(302);
//         //2.设置响应头location
//        response.setHeader("location","/march_25/ResponseDemo2");

        //1.简单的重定向方法
       // response.sendRedirect("/march_25/ResponseDemo2");

        //2.简单的重定向方法 动态获取虚拟目录，推荐使用
        String contextPath = request.getContextPath();
        response.sendRedirect(contextPath+"/ResponseDemo2");

        //在浏览器打印信息 可记住该代码
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("ResponseDemo1被访问了。。。");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
