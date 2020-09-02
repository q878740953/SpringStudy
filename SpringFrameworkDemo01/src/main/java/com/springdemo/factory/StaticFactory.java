package com.springdemo.factory;

import com.springdemo.domain.Account;

public class StaticFactory {
    public static Account getAccount(){
        return new Account();
    }
}
