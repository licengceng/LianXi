
import dao.AccountDao;
import domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class AccountTest {
    private InputStream in;
    private SqlSession sqlSession;
    private AccountDao accountDao;
    @Before //加before注解，用于在测试方法执行之前执行
    public void init() throws IOException {
        //1.读取配置文件
         in= Resources.getResourceAsStream("主配置文件config.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactory factory =new SqlSessionFactoryBuilder().build(in);
        //3.使用工厂创建dao对象
         sqlSession = factory.openSession();//注：openSession(true)时即可设为自动提交事务，下面代码可以不再写 sqlSession.commit();
        //4.使用sqlSession创建Dao接口的代理对象
         accountDao = sqlSession.getMapper(AccountDao.class);
    }

    @After //加After注解，用于在测试方法执行之后执行
    public void destory() throws IOException {
        //***JDBC操作后，要提交事务***
        sqlSession.commit();
        //释放资源
        sqlSession.close();
        in.close();
    }

    /*
     * 测试查询所有用户
     * */
    @Test //会有一个run方法
    public  void TestAll() throws IOException {

        //5.使用代理对象执行方法
        List<Account> accounts = accountDao.findAll();
        for (Account account : accounts) {
            System.out.println(account);
        }

    }

    /*
     * 测试查询所有账户，并且带有用户名称和地址信息
     * */
    @Test
    public  void TestAllAccountUser() throws IOException {

        List<Account> allAccount = accountDao.findAll();
        for (Account account : allAccount) {
            System.out.println("每个account信息：");
            System.out.println(account);
            System.out.println(account.getUser());
           //System.out.println("User{"+"id="+account.getUser().getId()+",username="+account.getUser().getUsername()+",address="+account.getUser().getAddress()+"}");
        }

    }
}
