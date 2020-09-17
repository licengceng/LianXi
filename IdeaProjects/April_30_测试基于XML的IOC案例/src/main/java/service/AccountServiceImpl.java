package service;

import dao.IAccountDao;
import domain.Account;
import org.springframework.stereotype.Component;

import java.util.List;
public class AccountServiceImpl implements IAccountService{
    //业务层调用dao层
    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }

    public Account findAccountById(Integer accountId) {
         return accountDao.findAccountById(accountId);
    }

    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    public void deleteAccount(Account account) {
        accountDao.deleteAccount(account);
    }
}
