package March_21.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/RequestDemo1")
public class _1Request获取请求行数据 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //getMethod()获取请求方式 : Get
        String method = request.getMethod();
        System.out.println(method);
        //******getContextPath()获取虚拟目录  tomcat里配置的虚拟目录，此不配置则为null
        String contextPath = request.getContextPath();
        System.out.println(contextPath);
        //getServletPath()获取servlet路径  该servlet即为 /RequestDemo1
        String servletPath = request.getServletPath();
        System.out.println(servletPath);
        //getQueryString()获取get方式请求参数
        String queryString = request.getQueryString();
        System.out.println(queryString);
        //******getRequestURI()获取请求URI & getRequestURL()获取请求URL
        String requestURI = request.getRequestURI();
        StringBuffer requestURL = request.getRequestURL();
        System.out.println(requestURI);
        System.out.println(requestURL);
        //getProtocol()获取协议及版本
        String protocol = request.getProtocol();
        System.out.println(protocol);
        //getRemoteAddr获取客户机的IP地址
        String remoteAddr = request.getRemoteAddr();
        System.out.println(remoteAddr);
    }
}
