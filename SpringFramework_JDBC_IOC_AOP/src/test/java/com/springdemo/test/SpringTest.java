package com.springdemo.test;

import com.springdemo.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void test01() {
        // 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        AccountService service = context.getBean("accountService", AccountService.class);
        service.transfer(2, 1, 1000);
    }
}
