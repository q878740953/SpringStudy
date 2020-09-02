package com.springdemo.service.imp;

import com.springdemo.dao.AccountDao;
import com.springdemo.domain.Account;
import com.springdemo.service.AccountService;

import java.util.List;

public class AccountServiceImp implements AccountService {
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }

    @Override
    public void transaction(int sourceId, int targetId, Double money) {
        // 查询出每个账户
        Account source = accountDao.findAccountById(sourceId);
        Account target = accountDao.findAccountById(targetId);
        source.setMoney(source.getMoney() - money);
        target.setMoney(target.getMoney() + money);
        accountDao.updateAccount(source);
        int i =1/0;
        accountDao.updateAccount(target);
    }
}
