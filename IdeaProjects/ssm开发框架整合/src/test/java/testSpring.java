import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.AccountService;


public class testSpring {
    @Test
    public void run1(){
        //加载配置文件
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
       //获取对象
        AccountService as = (AccountService) ac.getBean("accountService");
        //测试方法
        as.findAll();
    }
}
