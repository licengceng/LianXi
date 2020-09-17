package controller;

import domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.AccountService;

import java.util.List;

/*
* 账户web层（表现层）
* */
@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired  //web.xml配置监听器，现在controller和servlet全部放进容器中了，controller可以依赖注入了
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){ //存放到model
        System.out.println("表现层：查询所有用户。。。");
        //调用service层的方法
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);

        return "list";
    }
}
