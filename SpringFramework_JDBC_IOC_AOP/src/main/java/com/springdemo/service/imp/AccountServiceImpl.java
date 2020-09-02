package com.springdemo.service.imp;

import com.springdemo.dao.AccountDao;
import com.springdemo.domain.Account;
import com.springdemo.service.AccountService;

import java.util.List;

public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public List<Account> getAllAccount() {
        return accountDao.getAllAccount();
    }

    @Override
    public Account getAccountById(int id) {
        return accountDao.getAccountById(id);
    }

    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    @Override
    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    @Override
    public void delAccount(int id) {
        accountDao.delAccount(id);
    }

    @Override
    public void transfer(int sourceId, int targetId, double money) {
        // 查询转出账户是否存在
        Account source = accountDao.getAccountById(sourceId);
        // 查询转入账户是否存在
        Account target = accountDao.getAccountById(targetId);
        // 传出账户减钱，转入账户加钱
        target.setMoney(target.getMoney() + money);
        source.setMoney(source.getMoney() - money);
        // 更新账户
        accountDao.updateAccount(source);
        int i = 1/0;
        accountDao.updateAccount(target);
    }
}
