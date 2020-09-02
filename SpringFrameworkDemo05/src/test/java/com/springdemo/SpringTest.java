package com.springdemo;

import com.springdemo.domain.Account;
import com.springdemo.service.AccountService;
import config.JdbcConfig;
import config.SpringConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class SpringTest {
    @Autowired
    private AccountService service;
    @Test
    public void findAllAccount(){
        List<Account> accountList = service.findAllAccount();
        for (Account account : accountList) {
            System.out.println(account);
        }
    }
    @Test
    public void findOneAccount(){
        Account account = service.findOneAccount(7);
        System.out.println(account);
    }
    @Test
    public void updateAccount(){
        Account account = service.findOneAccount(7);
        account.setMoney(878740);
        service.updateAccount(account);
        System.out.println(account);
    }
    @Test
    public void insertAccount(){
        Account account = new Account();
        account.setUid(8);
        account.setMoney(9797);
        service.insertAccount(account);
        System.out.println(account);
    }
    @Test
    public void delAccount(){
        service.delAccount(10);
    }
}
