package controller;

import domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController {

    /*
    *返回String
    * */
    @RequestMapping("/testString")
    public String testStrin(Model model){
        System.out.println("testString执行了");
        //模拟从数据库中查询User对象
        User user = new User();
        user.setUsername("张三");
        user.setPassword("123456");
         //发送请求从后台查询数据，把数据存到model对象，存到request域，转发到页面 从request域中取出数据

                //底层会存储到request域对象中
        model.addAttribute("user",user);//user对象存入user键中，再在Jsp页面将user键取出数据
        return "success";
    }

    /*
     *返回ModelAndView
     * */
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        System.out.println("testModelAndView执行了");
        //模拟从数据库中查询User对象
        User user = new User();
        user.setUsername("张三");
        user.setPassword("123456");
        //1.创建ModelAndView对象
        ModelAndView mv = new ModelAndView();
        //把user对象存储到mv对象，也会把user对象存入到request对象
        mv.addObject("user",user);
        //跳转到哪个页面
        mv.setViewName("success");//返回mv对象，视图解析器会跳转到相应目录下找success对应资源
        return mv;
    }

    /*没有返回
    * 请求转发是一次请求，不用编写项目的名称
    * 重定向是两次请求，url会发生变化，要写项目名称
    * 注：---------重定向不能请求WEB-INF里面的内容，转发可以--------
    * */
    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("testVoid执行了");
        //编写请求转发的页面    此时视图解析器不会为我们跳转页面，需要手动写上跳转页面url
//        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);

        //注：重定向两次请求 ，相当于重新发了请求，但重定向不能请求WEB-INF里面的内容，转发可以
//        response.sendRedirect(request.getContextPath()+"/_1index.jsp");

        //直接响应
        response.setContentType("text/html;charset=UTF-8"); //解决页面中文乱码问题
        response.getWriter().write("你好");
        //可以让后面的代码不执行，可以加上return ;
        return;
    }

    /*
    *使用关键字的方式进行转发或重定向
    * 此时重定向不需要加入项目路径
     * */
    @RequestMapping("/testForwardOrRedirect")
    public String testForwardOrRedirect() {
        System.out.println("testForwardOrRedirect执行了");
        //请求的转发 forward:
//        return "forward:/WEB-INF/pages/success.jsp";

        //重定向的转发 redirect: 此时不需要再加项目名称
        return "redirect:/_1index.jsp";

    }

    /*
    *模拟异步请求响应
     * */
    @RequestMapping("/testAjax")
    public @ResponseBody User testAjax(@RequestBody User user) {
        System.out.println("testAjax执行了..");
        //客户端发送的是ajax请求，传的是json字符串，后端把json字符串封装到user对象
        System.out.println(user);
        //做响应，模拟查询数据库
        user.setUsername("haha");
        user.setAge(50);
        //响应
        return user;//@RequestBody接收 @ResponseBody返回 把user对象转成json字符串 响应
    }

}
