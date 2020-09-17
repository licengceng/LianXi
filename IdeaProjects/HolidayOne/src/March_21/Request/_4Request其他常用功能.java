package March_21.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

@WebServlet( "/RequestDemo6")
public class _4Request其他常用功能 extends HttpServlet {
    /*获取请求参数通用方式：无论get还是post方式都可以使用下列方法来获取请求参数*/
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //getParameter() 根据参数名称获取参数值
        String username = request.getParameter("username");
        System.out.println("post");
        System.out.println(username);

        //getParameterValues根据参数名称获取参数值的数组
        String[] hobbies = request.getParameterValues("hobby");
        for (String hobby: hobbies) {
            System.out.println(hobby+" ");
        }

        //获取所有请求的参数名称
        Enumeration<String> parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements()){
            String name = parameterNames.nextElement();
            System.out.println(name);
            //根据名称获取值
            String value = request.getParameter(name);
            System.out.println(value);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //getParameter() 根据参数名称获取参数值
        String username = request.getParameter("username");
        System.out.println("get");
        System.out.println(username);

        //getParameterValues根据参数名称获取参数值的数组
        String[] hobbies = request.getParameterValues("hobby");
        for (String hobby: hobbies) {
            System.out.println(hobby+" ");
        }

        System.out.println("------------------------------------------------------");
        //getParameterNames()获取所有请求的参数名称
        Enumeration<String> parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements()){
            String name = parameterNames.nextElement();
            System.out.println(name);
            //根据名称获取值
            String values[] = request.getParameterValues(name);
            for (String value:values) {
                System.out.println(value);
            }
        }

        System.out.println("------------------------------------------------------");
        //获取所有参数的map集合
        Map<String, String[]> parameterMap = request.getParameterMap();
            //遍历   
        Set<String> keySet = parameterMap.keySet();
        for (String name:keySet) {
           //获取键获取值
            String[] values = parameterMap.get(name);
            System.out.println(name);
            for (String value:values) {
                System.out.println(value);
            }
        }
    }
}
