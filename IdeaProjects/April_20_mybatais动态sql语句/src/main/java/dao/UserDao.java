package dao;

import domain.QueryVo;
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

    /*
    * 根据信息模糊查询用户信息
    * */
    List<User> findByName(String name);

    /*
    * 根据queryVo条件查询用户
    * */
    List<User> findUserByVo(QueryVo vo);

    /*
     * 根据传入参数条件
     * user 查询的条件，有可能有用户名，可能有地址，可能有性别，可能都有等等
     * */
    List<User> findUserByCondition(User user);

    /*
    *根据queryVo中提供的id集合（如id 1,2,5,6,9）遍历查询这些id的用户信息
    * */
    List<User> findUserInIds(QueryVo vo);
}
