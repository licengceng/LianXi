package March_32;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
//表示浏览器直接请求访问index.jsp资源时，该浏览器会被执行 DispatcherType.REQUEST默认值
//DispatcherType.FORWARD只有转发时才会被执行
//直接访问或转发时会被执行
@WebFilter( value = "/index.jsp",dispatcherTypes = {DispatcherType.FORWARD,DispatcherType.REQUEST})
public class _2FilterDemo2 implements Filter {
    /*
    * 在服务器启动后，会创建Filter对象，然后调用Init方法。只执行一次。用于加载资源*/
    public void init(FilterConfig config) throws ServletException {
        System.out.println("init。。");
    }
    /*
    *
    *  每一次请求资源时被拦截，会执行，执行多次*/
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //对request对象请求信息增强
        System.out.println("filterDemo2执行了。。");
        //放行
        chain.doFilter(req, resp);
        //对response对象的响应信息增强
        System.out.println("filterDemo2回来了。。");
    }
    /*
    * 在服务器关闭后，Filter对象被销毁。如果服务器是正常关闭，则会执行destroy方法。只执行一次*/
    public void destroy() {
        System.out.println("destroy。。");
    }

}
