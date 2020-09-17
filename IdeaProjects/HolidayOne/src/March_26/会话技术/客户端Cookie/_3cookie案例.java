package March_26.会话技术.客户端Cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

/*在服务器中的Servlet判断是否有一个名为lastTime的cookie
* 1.有：不是第一次访问
*       1.响应数据：欢迎回来，您上次访问的时间为xxx
*       2.写回cookie:lastTime=xxx
* 2.没有：第一次访问
*       1.响应数据：您好，欢迎首次访问
 *      2.写回cookie:lastTime=xxx*/
@WebServlet( "/cookieTest")
public class _3cookie案例 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置响应体数据格式和编码
        response.setContentType("text/html;charset=utf-8");
        //获取所有cookie
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie:cookies) {
            if (cookies!=null&&cookies.length>0){
                String name = cookie.getName();
               
                if ("lastTime".equals(name)){
                    //有cookie,不是第一次访问， 设置cookie的value，获取当前时间，重新设置cookie值，重新发送cookie
                    Date date = new Date();
                    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
                    String str_date = simpleDateFormat.format(date);

                    System.out.println("编码前："+str_date);
                    //URL编码
                    str_date= URLEncoder.encode(str_date,"utf-8");
                    System.out.println("编码后："+str_date);

                    cookie.setValue(str_date);
                    response.addCookie(cookie);

                    //响应数据 获取cookie的value时间
                    String value = cookie.getValue();
                    System.out.println("解码前："+value);
                    //URL解码
                   value= URLDecoder.decode(value,"utf-8");
                    System.out.println("解码后："+value);

                    response.getWriter().write("<h1>欢迎回来，您上次访问的时间为:"+value+"</h1>");
                    break;
                }
                else {
                    //没有cookie，是第一次访问
                    Date date = new Date();
                    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
                    String str_date = simpleDateFormat.format(date);

                    System.out.println("编码前："+str_date);
                    //URL编码
                    str_date= URLEncoder.encode(str_date,"utf-8");
                    System.out.println("编码后："+str_date);
                    Cookie cookie1 = new Cookie("lastTime", str_date);
                    response.addCookie(cookie1);
                    response.getWriter().write("<h1>欢迎，首次访问</h1>");
                }
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
