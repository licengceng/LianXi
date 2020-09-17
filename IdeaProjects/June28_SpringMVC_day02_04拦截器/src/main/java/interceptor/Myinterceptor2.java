package interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Myinterceptor2 implements HandlerInterceptor {
    /*
    * 预处理 在controller方法执行前
    * return true 放行，执行下一个拦截器，如果没有，执行controller中的方法
    * return false 不放行，controller方法不会执行
    * */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("Myinterceptor拦截器里的方法执行了。。前222");
//        request.getRequestDispatcher("/WEB-INF/pages/error.jsp").forward(request,response);//转发到错误页面 return false;
        return true;
    }

    /*
     * 后处理 在controller方法执行后执行，success.jsp执行之前执行
     * */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("Myinterceptor拦截器里的方法执行了。。后222");
        request.getRequestDispatcher("/WEB-INF/pages/error.jsp").forward(request,response);//转发到错误页面 如果在此处转发到新的页面（error.jsp）,那么controller里本该跳转到success.jsp页面不会再跳转

    }

    /*
    * 最后执行的方法 在success.jsp执行后执行
    * 此时已不能再进行跳转到任何页面
    * */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("Myinterceptor拦截器里的方法执行了。。最后222");
    }
}
