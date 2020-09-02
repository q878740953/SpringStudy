package com.springdemo.utils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * 链接的工具类，它用于从数据源中获取一个连接，并且实现与线程绑定
 */
public class ConnectionUtil {
    private ThreadLocal<Connection> tl = new ThreadLocal<Connection>();
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * 获取线程上的连接
     *
     * @return
     */
    public Connection getThreadConnection() {
//        获取线程上的连接
        Connection conn = tl.get();
        // 判断是否存在连接

        try {
            if (conn == null) {
                // 如果不存在，从数据源取出一个连接，并存入ThreadLocal
                conn = dataSource.getConnection();
                tl.set(conn);
            }
            // 返回当前线程上conn
            return conn;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
