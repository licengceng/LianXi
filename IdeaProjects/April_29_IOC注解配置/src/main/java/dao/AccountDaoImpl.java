package dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDaoImpl implements IAccountDao {
    public AccountDaoImpl(){
        System.out.println("对象创建了。。");
    }

    public void saveAccount() {
        System.out.println("AccountDaoImpl执行了");
    }
}
