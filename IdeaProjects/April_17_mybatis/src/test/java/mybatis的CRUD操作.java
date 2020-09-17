
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
    * 测试保存操作
    * */
    @Test
    public void testSave(){
        User user=new User();
        user.setUsername("test");
        user.setSex("ma");
        user.setBirthday(new Date());
        user.setAddress("湛江");
        System.out.println("保存操作之前id:"+user);//select last_insert_id();
                                                //插入数据后，查询该插入数据的id
        //执行保存方法
        userDao.saveUser(user);
        System.out.println("保存操作之后id:"+user);

        //最后注意以下CRUD都要提交事务才能把数据真正保存到数据库
        //sqlSession.commit();
    }
    /*
    * 测试更改信息
    * */
    @Test
    public void testUpdate(){
        User user = new User();
        user.setId(5);
        user.setAddress("黑马");
        user.setBirthday(new Date());
        //从MySQL4.1开始，varchar (N)中的N指的是该字段最多能存储多少个字符(characters)，不是字节数。
        //不管是一个中英文字符或者数字、或者一个汉字，都当做一个字符。
        user.setSex("女性"); //  mysql里varvhar(2)表示最大存储两个字符
        user.setUsername("小王");

        userDao.updateUser(user);
    }

    /*
    * 测试删除信息
    * */
    @Test
    public void testDelete(){
        Integer i=6;
        //执行删除操作
        userDao.deleteUser(i);
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
     * 测试模糊查询信息
     * */
    @Test
    public void testFindTotal(){

        //执行查询用户总条数操作
        int total = userDao.findTotal();
        System.out.println(total);
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
}
