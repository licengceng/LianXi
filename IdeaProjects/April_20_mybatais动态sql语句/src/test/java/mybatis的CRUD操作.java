
import dao.UserDao;
import domain.QueryVo;
import domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class mybatis的CRUD操作 {
    private InputStream in;
    private SqlSession sqlSession;
    private UserDao userDao;
    @Before //加before注解，用于在测试方法执行之前执行
    public void init() throws IOException {
        //1.读取配置文件
         in= Resources.getResourceAsStream("主配置文件config.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactory factory =new SqlSessionFactoryBuilder().build(in);
        //3.使用工厂创建dao对象
         sqlSession = factory.openSession();//注：openSession(true)时即可设为自动提交事务，下面代码可以不再写 sqlSession.commit();
        //4.使用sqlSession创建Dao接口的代理对象
         userDao = sqlSession.getMapper(UserDao.class);
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
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }

    }

    /*
     * 测试查询id信息
     * */
    @Test
    public void testFindById(){

        //执行查询id操作
        User user = userDao.findById(3);
        System.out.println(user);
    }

    /*
     * 测试模糊查询信息
     * */
    @Test
    public void testFindByName(){

        //执行模糊查询操作
        List<User> users = userDao.findByName("%小%");//加%有模糊查询效果
        for (User user : users) {
            System.out.println(user);
        }
    }


    /*
     * 测试根据QuseryVo条件查询用户信息
     * */
    @Test
    public void testQueryVo(){
        QueryVo vo = new QueryVo();
        User user = new User();
        user.setUsername("%王%");
        vo.setUser(user);
        //执行操作
        List<User> userListByVo = userDao.findUserByVo(vo);
        for (User users : userListByVo) {
            System.out.println(users);
        }
    }

    /*
    * 测试根据条件查询
    * */
    @Test
    public void testFindByCondition(){
        User user = new User();
        user.setUsername("老王");
        user.setSex("男");

        List<User> userByCondition = userDao.findUserByCondition(user);
        for (User user1 : userByCondition) {
            System.out.println(user1);
        }
    }

    /*
     * 测试根据id集合条件查询
     * */
    @Test
    public void testFindByUidCondition(){
        QueryVo vo =new QueryVo();
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(5);
        vo.setIds(list);

        List<User> userByCondition = userDao.findUserInIds(vo);
        for (User userlist : userByCondition) {
            System.out.println(userlist);
        }
    }
}
