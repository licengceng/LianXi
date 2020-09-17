package service;
/*账户的业务层接口
* */
public interface IAccountService {
    /*
    * 模拟保存账户
    * */
    void saveAccount();
    /*
    *模拟更新用户
    * */
    void updateAccount(int i);
    /*
    *删除用户
    * */
    int deleteAccount();
}
