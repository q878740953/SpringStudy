package com.springdemo.test;

import com.springdemo.dao.AccountDao;
import com.springdemo.domain.Account;
import com.springdemo.service.AccountService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringTest {
    @Test
    public void test01(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        AccountService service = context.getBean("accountService", AccountService.class);
//        List<Account> accounts = service.findAllAccount();
//        for (Account account : accounts) {
//            System.out.println(account);
//        }
        service.transaction(1, 2,1000D);
    }
}
