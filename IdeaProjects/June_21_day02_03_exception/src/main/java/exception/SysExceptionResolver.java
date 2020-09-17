package exception;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
* 异常处理器
* */
public class SysExceptionResolver implements HandlerExceptionResolver {
    /*
    *处理异常业务逻辑
    * */
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) { //这个异常e就是抛出的异常，传过来的参数
        //获取到异常对象
        SysException se=null;
        if (e instanceof SysException){ //如果抛出的对象是SysException类型的
            se=(SysException)e;
        }else {
            se=new SysException("系统正在维护。。");
        }
        //创建ModelAndView对象
        ModelAndView mv = new ModelAndView();
        mv.addObject("errorMsg",se.getMessage());//异常提示信息存储到下面error.jsp页面 errorMsg键中
        mv.setViewName("error");//找视图解析器 跳转到“error.jsp"页面
        return mv;
    }
}
