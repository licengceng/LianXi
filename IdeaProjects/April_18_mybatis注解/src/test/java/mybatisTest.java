
import dao.UserDao;
import domain.User;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class mybatisTest {
    public static void main(String[] args) throws IOException {
        //1.读取配置文件
        InputStream in= Resources.getResourceAsStream("主配置文件config.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂创建dao对象
        SqlSession sqlSession = factory.openSession();
        //4.使用sqlSession创建Dao接口的代理对象
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        //5.使用代理对象执行方法
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user.getId());
            System.out.println(user.getUsername());
            System.out.println(user.getBirthday());
            System.out.println(user.getAddress());
        }
        //6.释放资源
        sqlSession.close();
        in.close();
    }
}
