package March_21.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet( "/RequestDemo2")
public class _2Request获取请求头数据 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         //getHeader()通过请求头的名称获取请求头的值  演示获取请求头数据:user-agent
        String agent = request.getHeader("user-agent");
        if (agent.contains("Chrome")){
            System.out.println("这是谷歌浏览器");
        }
        else if(agent.contains("Firefox")){
            System.out.println("这是火狐浏览器");
        }
        System.out.println("--------------------------------");
        //getHeaderNames()获取所有的请求头名称
        Enumeration<String> headerNames = request.getHeaderNames();
            //遍历
            while (headerNames.hasMoreElements()){
            String name = headerNames.nextElement();
            //根据名称获取请求头的值
                String value = request.getHeader(name);
                System.out.println(name+"---"+value);
            }
        System.out.println("--------------------------------");

        //演示获取referer
        String referer = request.getHeader("referer");
            if (referer.contains("march_21")){
                System.out.println(referer);
            }
        //防盗链
        if (referer!=null){
            if (referer.contains("march_21")){
                //正常访问
//                System.out.println("播放电影");
                response.setContentType("text/html;charset=utf-8");
                response.getWriter().write("播放电影");
            }
            else {  //盗链
                response.setContentType("text/html;charset=utf-8");
                response.getWriter().write("想看电影吗，来正版官网来看吧");
            }
        }
    }
}
