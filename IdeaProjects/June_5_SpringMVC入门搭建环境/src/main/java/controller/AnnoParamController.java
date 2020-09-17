package controller;

import domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Date;

@Controller
@RequestMapping("/ano")
@SessionAttributes(value = {"msg"}) //把msg=美美存入到session域对象中
public class AnnoParamController {
    @RequestMapping("/testRequestParam")
    public String testRequest(@RequestParam(name="uname") String username){ //常用注解RequestParam
        System.out.println("执行中。。");
        System.out.println(username);
        return "success";
    }

    /*
    * 获取请求体内容
    * */
    @RequestMapping("/testRequestBody")
    public String testBody(@RequestBody String body){ //获取请求体 注解RequestBody
        System.out.println("执行中。。");
        System.out.println(body);
        return "success";
    }

    /*
     * restful风格
     *@PathVariable注解
     * */
    @RequestMapping("/testPathVariable/{sid}") // <a href="ano/testPathVariable/10"></a>  10赋值给sid
    public String testPathVariable(@PathVariable(name = "sid") String id){ //获取请求体 注解RequestBody
        System.out.println("获取id中。。");
        System.out.println("id="+id);
        return "success";
    }

    /*
     *获取cookie的值 CookieValue注解
     * */
    @RequestMapping("/testCookieValue")
    public String testCookie(@CookieValue(name = "JSESSIONID") String cookievalue){
        System.out.println("获取cookie中。。");
        System.out.println(cookievalue);
        return "success";
    }

    /*
     *ModelAttribute注解
     * */
    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(User user){ //把表单数据封装到user 此处提交的表单数据没有日期属性，当提交不完整属性的数据到数据库，没有提交的数据属性会使用数据库原来属性的数据
        System.out.println("testModelAttribute执行了。。");
        System.out.println(user);
        return "success";
    }
    @ModelAttribute  //该方法先执行
    public User show(String uname){
        System.out.println("ModelAttribute出现在方法上会在控制器方法执行之前先执行");
        //通过用户查询数据库(模拟)
        User user = new User();
        user.setUname("张三");
        user.setAge(20);
        user.setDate(new Date());
        return user;
    }

    /*
     *SessionAttributes注解
     * 用于执行控制器方法间的参数共享
     * */
    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(Model model){
        System.out.println("testSessionAttributes执行了。。");
        //底层会存储到request域对象中
        model.addAttribute("msg","美美");
        return "success";
    }
    //从session域取值
    @RequestMapping("/getSessionAttributes")
    public String getSessionAttributes(ModelMap modelMap){
        System.out.println("getSessionAttributes执行了。。");
        String msg = (String) modelMap.get("msg");
        System.out.println(msg);
        return "success";
    }
    //删除
    @RequestMapping("/deleteSessionAttributes")
    public String deleteSessionAttributes(SessionStatus sessionStatus){
        System.out.println("deleteSessionAttributes执行了。。");
        sessionStatus.setComplete();//把session里的东西清除
        return "success";
    }
}
