package com.springdemo.service.imp;

import com.springdemo.dao.AccountDao;
import com.springdemo.domain.Account;
import com.springdemo.service.AccountService;

import java.util.List;

/**
 * account业务实现层
 */
public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }

    @Override
    public Account findOneAccount(int id) {
        return accountDao.findOneAccount(id);
    }

    @Override
    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    @Override
    public void insertAccount(Account account) {
        accountDao.insertAccount(account);
    }

    @Override
    public void delAccount(int id) {
        accountDao.delAccount(id);
    }
}
