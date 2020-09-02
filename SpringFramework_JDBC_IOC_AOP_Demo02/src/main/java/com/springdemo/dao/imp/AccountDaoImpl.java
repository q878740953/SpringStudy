package com.springdemo.dao.imp;

import com.springdemo.dao.AccountDao;
import com.springdemo.domain.Account;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    @Override
    public List<Account> findAllAccount() {
        return getJdbcTemplate().query("select * from account", new BeanPropertyRowMapper<Account>(Account.class));
    }

    @Override
    public Account findAccountById(int id) {
        List<Account> accounts = getJdbcTemplate().query("select * from account where id=?", new BeanPropertyRowMapper<>(Account.class), id);
        return accounts.get(0);
    }

    @Override
    public void updateAccount(Account account) {
        getJdbcTemplate().update("update account set money=? where id=?", account.getMoney(), account.getId());
    }
}
