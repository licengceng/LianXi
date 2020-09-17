package dao;
/*
* 用户持久层接口
* */
import domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//不用xml配置, 利用注解配置
public interface UserDao {
    @Select("select *from user")
    List<User> findAll();//java接口的方法默认都是public abstract类型，

    //因此我们在编写接口的实现类的时候，方法的实现前面要显式的加上public访问控制符
}
