package com.springdemo.dao.imp;

import com.springdemo.dao.AccountDao;
import com.springdemo.domain.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;
@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {
    @Autowired
    private QueryRunner runner;
    @Override
    public List<Account> findAllAccount() {
        String sql = "select * from account";
        try {
            return runner.query(sql, new BeanListHandler<Account>(Account.class));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    @Override
    public Account findOneAccount(int id) {
        String sql = "select * from account where id=?";
        try {
            return runner.query(sql, new BeanHandler<Account>(Account.class), id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateAccount(Account account) {
        String sql = "update account set money=? where id=?";
        try {
            runner.update(sql, account.getMoney(), account.getId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void insertAccount(Account account) {
        String sql = "insert into account(uid, money) values (?,?)";
        try {
            runner.update(sql, account.getUid(), account.getMoney());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delAccount(int id) {
        try {
            runner.update("delete from account where id=?", id);
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
    }
}
