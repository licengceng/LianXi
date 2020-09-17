package March_25.Response;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet( "/ResponseDemo3")
public class _3乱码问题 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置缓存区编码为UTF-8编码格式
//        response.setCharacterEncoding("UTF-8");
       //在响应中主动告诉浏览器使用UTF-8编码格式来接收数据
//        response.setHeader("Content-Type", "text/html;charset=UTF-8");

        //简单的形式，设置编码 可以使用封装类简写Content-Type，使用该方法则无需使用setCharacterEncoding
        response.setContentType("text/html;charset=utf-8");
        //1.获取字符输出流
        PrintWriter pw = response.getWriter();//因为获取的流的默认编码是ISO-8859-1,所以在上面设置的编码为utf-8告诉浏览器响应体使用的编码
        //2.输出数据
        pw.write("Hello response");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
