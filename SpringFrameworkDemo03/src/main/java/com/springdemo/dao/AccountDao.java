package com.springdemo.dao;

import com.springdemo.domain.Account;

import java.util.List;

public interface AccountDao {
    List<Account> findAllAccount();
    Account findOneAccount(int id);
    void updateAccount(Account account);
    void insertAccount(Account account);
    void delAccount(int id);
}
