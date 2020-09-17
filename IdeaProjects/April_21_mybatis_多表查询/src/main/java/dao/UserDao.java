package dao;

import domain.User;

import java.util.List;

public interface UserDao {
    /*
    * 查询所有用户
    * */
     List<User> findAll();//java接口的方法默认都是public abstract类型，
    //因此我们在如果要编写接口的实现类的时候，方法的实现前面要显式的加上public访问控制符


    /*
    * 根据id查询用户
    * */
    User findById(int id);

}
