package March_20.Servlet;
import javax.servlet.*;
import java.io.IOException;
/*1.定义一个类，实现Servlet接口
* 2.实现接口中的抽象方法
* 配置Servlet
* */
public class _01Servlet快速入门 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Hello Servlet");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
