package com.springdemo.dao;

import com.springdemo.domain.Account;

import java.util.List;

public interface AccountDao {
    List<Account> getAllAccount();
    Account getAccountById(int id);
    void saveAccount(Account account);
    void updateAccount(Account account);
    void delAccount(int id);
}
