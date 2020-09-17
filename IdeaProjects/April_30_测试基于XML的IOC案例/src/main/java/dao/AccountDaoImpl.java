package dao;
import domain.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.util.List;

public class AccountDaoImpl implements IAccountDao {
    private QueryRunner runner;

    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }
    public List<Account> findAllAccount() {
        try {
            return runner.query("select *from account",new BeanListHandler<Account>(Account.class));
        } catch (Exception e) {
            throw new RuntimeException();

        }
    }

    public Account findAccountById(Integer accountId) {
        try {
            return runner.query("select *from account where id = ?",new BeanHandler<Account>(Account.class),accountId);
        } catch (Exception e) {
            throw new RuntimeException();

        }
    }

    public void saveAccount(Account account) {
        try {
             runner.update("insert into account(name,money) values(?,?)",account.getName(),account.getMoney());//数据表id已设置自动增长，故不需插入id
        } catch (Exception e) {
            throw new RuntimeException();

        }
    }

    public void updateAccount(Account account) {
        try {
            runner.update("update account set name=?,money=? where id=?",account.getName(),account.getMoney(),account.getId());
        } catch (Exception e) {
            throw new RuntimeException();

        }
    }

    public void deleteAccount(Account account) {
        try {
            runner.update("delete from account  where id=?",account.getId());
        } catch (Exception e) {
            throw new RuntimeException();

        }
    }
}
