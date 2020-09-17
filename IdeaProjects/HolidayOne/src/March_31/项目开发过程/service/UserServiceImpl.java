package March_31.项目开发过程.service;

import March_31.项目开发过程.dao.UserDao;
import March_31.项目开发过程.dao.impl.UserDaoImpl;
import March_31.项目开发过程.domain.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao dao=new UserDaoImpl();
    @Override
    public List<User> findAll() {
        //调用dao完成查询
        return dao.findAll();
    }
}
