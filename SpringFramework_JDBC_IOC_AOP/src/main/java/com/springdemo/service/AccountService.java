package com.springdemo.service;

import com.springdemo.domain.Account;

import java.util.List;

public interface AccountService {
    List<Account> getAllAccount();
    Account getAccountById(int id);
    void saveAccount(Account account);
    void updateAccount(Account account);
    void delAccount(int id);

    /**
     *
     * @param sourceId 转账原id
     * @param targetId 转账目标id
     * @param money    转多少钱
     */
    void transfer(int sourceId, int targetId, double money);
}
