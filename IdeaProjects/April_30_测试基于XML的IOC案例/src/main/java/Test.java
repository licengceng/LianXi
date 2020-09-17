import dao.IAccountDao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.IAccountService;
//模拟一个表现层，用于调用业务层
public class Test {
//    public static void main(String[] args) {
//        IAccountService accountService = new AccountServiceImpl();
//        accountService.saveAccount();
//    }
    /*
     * 获取spring的IOC核心容器，并根据id获取对象
     *
     *ApplicationContext的三个常用实现类：
     *   1.ClassPathXmlApplicationContext：它可以加载类路径下的配置文件，要求配置文件必须在类路径下。不在的话，加载不了
     *   2.FileSystemXmlApplicationContext：它可以加载磁盘任意路径下的配置文件（必须有访问权限）
     *   3.AnnotationConfigApplicationContext：它用于读取注解创建容器
     * */

    /*
    * 核心容器的两个接口引发出的问题：
    * ApplicationContext:                       单例对象适用
    *       它在构建核心容器时，创建对象采取的策略是采用立即加载的方式，也就是说，只要一读取完配置文件马上就创建配置文件中的配置对象
    * BeanFactory:                              多例对象适用
    *       它在构建核心容器时，创建对象采取的策略是采用延迟加载的方式，也就是说，什么时候根据id获取对象了，什么时候才真正创建对象
    * */
    public static void main(String[] args) {
        //获取核心容器对象
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");//resources目录下的bean.xml
        //根据id获取Bean对象
        IAccountService as= (IAccountService) ac.getBean("accountServiceImpl");
        IAccountService as2= (IAccountService) ac.getBean("accountServiceImpl");
        System.out.println(as==as2);//@Scope 默认为单例 故为true

        //根据id获取Bean对象
        IAccountDao aDao = (IAccountDao) ac.getBean("accountDaoImpl");

        System.out.println(as);
        System.out.println(aDao);

        //把子类型看成父类型，则只能执行父类型方法，故此处ac.close()方法执行不了，会报错
//        ApplicationContext a (ac) = new ClassPathXmlApplicationContext("bean.xml");
//        a.close;    ac.close()
        //要想执行ac.close 子类型看成自己，执行自己的方法
        ClassPathXmlApplicationContext a=new ClassPathXmlApplicationContext("bean.xml");
        a.close();   //关闭容器，执行销毁方法，（单例对象被销毁） 注：多例对象在容器关闭后并不会销毁对象，他长久不用时只能由垃圾回收机制回收
    }
}
