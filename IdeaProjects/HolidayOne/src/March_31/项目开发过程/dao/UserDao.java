package March_31.项目开发过程.dao;

import March_31.项目开发过程.domain.User;

import java.util.List;
/*用户操作的dao*/
public interface UserDao {
    public List<User> findAll();
}
