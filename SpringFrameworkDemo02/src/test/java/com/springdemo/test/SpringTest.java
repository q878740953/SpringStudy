package com.springdemo.test;

import com.springdemo.domain.SetTest;
import com.springdemo.domain.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void test01(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//        User user = (User) context.getBean("user");
//        System.out.println(user.toString());
        SetTest setTest = (SetTest) context.getBean("setTest");
        System.out.println(setTest.toString());
    }
}
