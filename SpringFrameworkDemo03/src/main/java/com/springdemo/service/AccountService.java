package com.springdemo.service;

import com.springdemo.domain.Account;

import java.util.List;

/**
 * account业务接口层
 */
public interface AccountService {
    List<Account> findAllAccount();
    Account findOneAccount(int id);
    void updateAccount(Account account);
    void insertAccount(Account account);
    void delAccount(int id);
}
