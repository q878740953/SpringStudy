package com.springdemo.dao.imp;

import com.springdemo.dao.AccountDao;
import com.springdemo.domain.Account;
import com.springdemo.utils.ConnectionUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class AccountDaoImpl implements AccountDao {
    private QueryRunner runner;
    private ConnectionUtil connectionUtil;
    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }

    public void setConnectionUtil(ConnectionUtil connectionUtil) {
        this.connectionUtil = connectionUtil;
    }

    @Override
    public List<Account> getAllAccount() {
        String sql = "select * from account";
        try {
            return runner.query(connectionUtil.getThreadConnection(), sql, new BeanListHandler<Account>(Account.class));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Account getAccountById(int id) {
        String sql = "select * from account where id=?";
        try {
            return runner.query(connectionUtil.getThreadConnection(), sql, new BeanHandler<Account>(Account.class), id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void saveAccount(Account account) {
        String sql = "insert into account(uid, money) values (?,?)";
        try {
            runner.update(connectionUtil.getThreadConnection(), sql, account.getUid(), account.getMoney());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateAccount(Account account) {
        String sql = "update account set money=? where id=?";
        try {
            runner.update(connectionUtil.getThreadConnection(), sql, account.getMoney(), account.getId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delAccount(int id) {
        try {
            runner.update(connectionUtil.getThreadConnection(),"delete from account where id=?", id);
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
    }
}
