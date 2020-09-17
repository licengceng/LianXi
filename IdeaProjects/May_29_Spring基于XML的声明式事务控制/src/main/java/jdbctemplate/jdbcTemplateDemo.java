package jdbctemplate;

import domain.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/*
 * jdbcTemplate最基本的用法
 * */
public class jdbcTemplateDemo {
    public static void main(String[] args) {
//        //准备数据源，spring的内置数据源
//        DriverManagerDataSource ds = new DriverManagerDataSource();
//        ds.setDriverClassName("com.mysql.jdbc.Driver");
//        ds.setUrl("jdbc:mysql://localhost/maven?serverTimezone=UTC");
//        ds.setUsername("root");
//        ds.setPassword("root");
//
//
//        //1.创建JdbcTemplate对象
//        JdbcTemplate jt = new JdbcTemplate(); //JdbcTemplate jt = new JdbcTemplate(ds);
//        //2.给jt设置数据源
//        jt.setDataSource(ds);
//        //3.执行操作
//        jt.execute("select *from account");

        //1.获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.获取对象
        JdbcTemplate jt = ac.getBean("jdbcTemplate", JdbcTemplate.class);
        //3.执行操作
//        jt.execute("insert into account(name,money) values ('jdbc1',500)");
        //CRUD 保存
//        jt.update("insert into account(name,money) values(?,?)", "jdbc2", 700);
//        //更新
//        jt.update("update account set name=? ,money=? where id=?", "jdbc3", 1000, 5);
        //删除
//        jt.update("delete from account where id=?", 8);

        //查询所有，并返回list集合
        //List<Account> accounts = jt.query("select *from account where money > ?", new AccountRowMapper(), 300);
        List<Account> accounts = jt.query("select *from account where money > ?", new BeanPropertyRowMapper<Account>(Account.class), 300);
        for (Account account : accounts) {
            System.out.println(account);
        }

        //查询一个
//        List<Account> accous = jt.query("select *from account where id = ?", new BeanPropertyRowMapper<Account>(Account.class), 99);
//        System.out.println(accous.isEmpty()?"没有内容":accous.get(0));//根据id查询，如果存在结果集只会存在一个，用get(0)获取即可
//        //查询返回一行一列 用queryForObject (使用聚合函数，但不加group by子句)
//        Long count = jt.queryForObject("select count(*) from account where momey > ?", Long.class, 1000f);
//        System.out.println(count);
    }


}
//    /*
//    * 定义Account的封装策略
//    * */
//    class AccountRowMapper implements RowMapper<Account>{
//
//        public Account mapRow(ResultSet rs, int i) throws SQLException {
//            Account account=new Account();
//            account.setId(rs.getInt("id"));
//            account.setName(rs.getString("name"));
//            account.setMoney(rs.getFloat("money"));
//            return account;
//        }
//    }

