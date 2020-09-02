package com.springAOP;

import com.springAOP.service.AccountService;
import com.springAOP.service.imp.AccountServiceImp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {
    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        AccountService service = (AccountService) context.getBean("accountService");
        service.savaAccount();
        service.delAccount();
        service.updateAccount(1);
    }
}
