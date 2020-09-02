package com.springdemo.dao;

import com.springdemo.domain.Account;

import java.util.List;

public interface AccountDao {
    List<Account> findAllAccount();
    Account findAccountById(int id);
    void updateAccount(Account account);
}
