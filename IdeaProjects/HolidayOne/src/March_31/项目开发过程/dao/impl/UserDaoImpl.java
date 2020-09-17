package March_31.项目开发过程.dao.impl;

import March_31.项目开发过程.dao.UserDao;
import March_31.项目开发过程.domain.User;
import March_31.项目开发过程.util工具包.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao {
    private JdbcTemplate template=new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public List<User> findAll() {
        //使用JDBC操作数据库
         //1.定义sql
        String sql="select *from user";
        List<User> users = template.query(sql, new BeanPropertyRowMapper<User>(User.class));//里面对应的class字节码文件 最后返回一个List集合
        return users;
    }
}
