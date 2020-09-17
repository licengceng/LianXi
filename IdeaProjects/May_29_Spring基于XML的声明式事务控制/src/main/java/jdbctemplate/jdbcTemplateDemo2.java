package jdbctemplate;

import dao.IAccountDao;
import domain.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/*
* jdbcTemplate最基本的用法
* */
public class jdbcTemplateDemo2 {
    public static void main(String[] args) {

        //1.获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.获取对象
        IAccountDao accountDao = ac.getBean("accountDao", IAccountDao.class);

        //3.执行方法
        Account account = accountDao.findAccountById(2);
        System.out.println(account);
        Account account1 = accountDao.findAccountByName("zhangsan");
        System.out.println(account1);

    }

}
