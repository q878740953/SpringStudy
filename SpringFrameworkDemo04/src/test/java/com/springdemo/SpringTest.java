package com.springdemo;

import com.springdemo.domain.Account;
import com.springdemo.service.AccountService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringTest {
    @Test
    public void findAllAccount(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        AccountService service = context.getBean("accountService", AccountService.class);
        List<Account> accountList = service.findAllAccount();
        for (Account account : accountList) {
            System.out.println(account);
        }
    }
    @Test
    public void findOneAccount(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        AccountService service = context.getBean("accountService", AccountService.class);
        Account account = service.findOneAccount(7);
        System.out.println(account);
    }
    @Test
    public void updateAccount(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        AccountService service = context.getBean("accountService", AccountService.class);
        Account account = service.findOneAccount(7);
        account.setMoney(878740);
        service.updateAccount(account);
        System.out.println(account);
    }
    @Test
    public void insertAccount(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        AccountService service = context.getBean("accountService", AccountService.class);
        Account account = new Account();
        account.setUid(8);
        account.setMoney(9797);
        service.insertAccount(account);
        System.out.println(account);
    }
    @Test
    public void delAccount(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        AccountService service = context.getBean("accountService", AccountService.class);
        service.delAccount(10);
    }
}
