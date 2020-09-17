package March_21.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/RequestDemo7")
public class _5请求转发 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("RequestDemo7被访问了。。");
        //转发前可将资源存放到域中    转发的情况下才可以用request域共享数据
        request.setAttribute("msg","hello");

        //转发到另一个资源
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/RequestDemo8");
//        requestDispatcher.forward(request,response);
        //转发不需要加虚拟目录
        request.getRequestDispatcher("/RequestDemo8").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
