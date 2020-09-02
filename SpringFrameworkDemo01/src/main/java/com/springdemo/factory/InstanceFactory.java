package com.springdemo.factory;

import com.springdemo.domain.Account;

public class InstanceFactory {
    public Account getAccount(){
        return new Account();
    }
}
