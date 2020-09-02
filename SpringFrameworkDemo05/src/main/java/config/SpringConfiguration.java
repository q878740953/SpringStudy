package config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

/**
 * 该类是一个配置类，他的作用和bean.xml是一样的
 * spring中的新注解
 * Configuration
 *  作用：指定这个类是一个配置类
 * ComponentSan
 *  作用：用于通过注解指定spring在创建容器时需要扫描的包
 */
@ComponentScan("com.springdemo")
@Import(JdbcConfig.class)
@PropertySource("classpath:jdbcConfig.properties")
public class SpringConfiguration {

}
