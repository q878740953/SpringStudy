package com.springdemo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

public class jdbcTest {
    @Test
    public void test01(){
        //使用spring IOC配置他们
        //DriverManagerDataSource dataSource = new DriverManagerDataSource();
        //dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        //dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/test?serverTimezone=GMT%2B8");
        //dataSource.setUsername("root");
        //dataSource.setPassword("zxcvbnm1234");
        //JdbcTemplate template = new JdbcTemplate(dataSource);
        // 读取spring IOC配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
        template.execute("insert into account(uid, money) values (00, 87840953)");
    }
}
