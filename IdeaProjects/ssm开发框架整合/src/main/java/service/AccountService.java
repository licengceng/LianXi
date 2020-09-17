package service;

import domain.Account;
import java.util.List;
        /*要写serice接口实现类*/

public interface AccountService {
    //查询所有账户
    public List<Account> findAll();

    //保存账户信息
    public void saveAccount(Account account);
}
