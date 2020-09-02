package com.springdemo.service;

import com.springdemo.domain.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAllAccount();
    void transaction(int sourceId, int targetId, Double money);
}
