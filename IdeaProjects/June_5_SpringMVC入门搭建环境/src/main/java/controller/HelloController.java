package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
//    @RequestMapping(path="/hello") path访问方法路径
@RequestMapping(value="/hello",method = {RequestMethod.GET},params = {"username"},headers = {"Accept"})//请求url必须带有username的属性,否则不能访问该方法
    public String sayHello(){                                                                          //超链接默认是get请求方式，method指定访问方式，此处method = {RequestMethod.GET}可省略
        System.out.println("hello mvc");
        return "success";
    }
}
