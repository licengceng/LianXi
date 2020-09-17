package service;

import dao.AccountDaoImpl;
import dao.IAccountDao;

public class AccountServiceImpl implements IAccountService{
    private IAccountDao iAccountDao =new AccountDaoImpl();

    public void saveAccount() {
        iAccountDao.saveAccount();
    }
}
