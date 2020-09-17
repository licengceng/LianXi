package dao.impl;

import dao.IAccountDao;
import domain.Account;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class AccountDaoImpl implements IAccountDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Account findAccountById(Integer accountId) {
        List<Account> accounts = jdbcTemplate.query("select *from account where id = ?", new BeanPropertyRowMapper<Account>(Account.class), accountId);
        return accounts.isEmpty()?null:accounts.get(0);//根据id查询，结果只有一个，故此处代码可这样写
    }

    public Account findAccountByName(String accountName) {
        List<Account> accounts = jdbcTemplate.query("select *from account where name = ? ", new BeanPropertyRowMapper<Account>(Account.class), accountName);
        if (accounts.isEmpty()){
            return null;
        }
        if (accounts.size()>1){
           throw new RuntimeException("结果集不唯一");
        }
       return accounts.get(0);
    }

    public void updateAccount(Account account) {
        jdbcTemplate.update("update account set name= ?,money=? where id=?",account.getName(),account.getMoney(),account.getId());
    }
}
