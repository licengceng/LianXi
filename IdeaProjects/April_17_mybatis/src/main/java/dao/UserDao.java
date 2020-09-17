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
    * 保存用户
    * */
    void saveUser(User user);

    /*
    * 更改信息
    * */
    void updateUser(User user);

    /*
    * 根据id删除用户
    * */
    void deleteUser(Integer id);

    /*
    * 根据id查询用户
    * */
    User findById(int id);

    /*
    * 根据信息模糊查询用户信息
    * */
    List<User> findByName(String name);

    /*
    * 查询总用户数
    * */
    int findTotal();

    /*
    * 根据queryVo条件查询用户
    * */
    List<User> findUserByVo(QueryVo vo);
}
