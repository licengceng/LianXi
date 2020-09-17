package March_31.项目开发过程.service;

import March_31.项目开发过程.domain.User;

import java.util.List;

/*
用户管理接口*/
public interface UserService {
    /*
    * 查询所有用户信息*/
    public List<User> findAll();
}
