package controller;
import domain.Account;
import domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/param")
public class ParamController {
    @RequestMapping(value="/testParam")
    public String testParam(String username,String password){  //请求参数绑定，该方法的参数需要和jsp页面url请求参数的名字相同
        System.out.println("请求参数绑定");
        System.out.println("执行中。。。");
        System.out.println("用户名："+username+",密码："+password);
        return "success";
    }
    /*
    * 多个请求参数，可以把数据封装到javaBean的类中
    * */
    @RequestMapping(value="/saveAccount")
    public String saAccount(Account account){  //当提交表单会把这些数据封装到account
        System.out.println("多个请求参数封装");
        System.out.println("执行中。。。");
        System.out.println(account);
//        System.out.println("用户名："+account.getUsername()+",密码："+account.getPassword()+",金额："+account.getMoney());
        //引用类型的封装
//        System.out.println("用户姓名："+account.getUser().getUname()+",用户年龄："+account.getUser().getAge());
        return "success";
    }

    @RequestMapping(value="/saveUser")
    public String saAccount(User user){  //当提交表单会把这些数据封装到account
        System.out.println("执行中。。。");
        System.out.println(user);
        System.out.println("用户姓名："+user.getUname()+",用户年龄："+user.getAge()+",用户生日："+user.getDate());
        return "success";
    }
}
