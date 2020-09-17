package dao;

import domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
* mybatis框架会帮助我们生成代理对象，所以只写接口，不需要写接口实现类   (但service接口实现类要自己写)
*
* */
@Repository
public interface AccountDao {
    //查询所有账户
    @Select("select *from account")
    public List<Account> findAll();

    //保存账户信息
    @Insert("insert into account(name,money) values (#{name},#{money})")
    public void saveAccount(Account account);
}
