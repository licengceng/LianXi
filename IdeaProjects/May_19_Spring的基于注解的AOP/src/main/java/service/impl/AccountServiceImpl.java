package service.impl;

import org.springframework.stereotype.Service;
import service.IAccountService;
@Service("accountService") //要增强的方法
public class AccountServiceImpl implements IAccountService {
    public void saveAccount() {
        System.out.println("执行了保存");
//        int i=1/0;    //出现异常，此时后置通知不会执行，会执行最终通知
    }

    public void updateAccount(int i) {
        System.out.println("执行了更新"+i);
    }

    public int deleteAccount() {
        System.out.println("执行了删除");
        return 0;
    }
}
