package com.springdemo.test;

import com.springdemo.domain.Account;
import com.springdemo.domain.User;
import com.springdemo.factory.InstanceFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
    }
}
