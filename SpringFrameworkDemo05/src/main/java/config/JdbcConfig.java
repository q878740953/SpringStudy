package config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
public class JdbcConfig {
    @Value("${driver}")
    private String driver;
    @Value("${url}")
    private String url;
    @Value("${username1}")
    private String username;
    @Value("${password}")
    private String password;
    /**
     * Bean 的作用：用于把当前方法的返回值 作为bean对象存入spring的ioc容器中
     *        属性：name，用于指定bean的id，不写时，默认为方法的名称
     * @param dataSource
     * @return
     */
    @Bean
    public QueryRunner runner(DataSource dataSource){

        return new QueryRunner(dataSource);
    }

    /**
     * 创建数据源对象
     * @return
     */
    @Bean
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
}
