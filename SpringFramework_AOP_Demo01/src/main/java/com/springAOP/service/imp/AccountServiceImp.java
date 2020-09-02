package com.springAOP.service.imp;

import com.springAOP.service.AccountService;

public class AccountServiceImp implements AccountService{
    @Override
    public void savaAccount() {
        System.out.println("我执行了保存账户");
    }
    @Override
    public void updateAccount(int id) {
        System.out.println("我执行了更新账户" + id);
    }
    @Override
    public int delAccount() {
        System.out.println("我执行了删除账户");
        return 0;
    }
}
