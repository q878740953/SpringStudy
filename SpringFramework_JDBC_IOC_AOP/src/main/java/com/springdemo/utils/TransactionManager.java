package com.springdemo.utils;

import java.sql.Connection;
import java.sql.SQLException;

public class TransactionManager {
    private ConnectionUtil connectionUtil;

    public void setConnectionUtil(ConnectionUtil connectionUtil) {
        this.connectionUtil = connectionUtil;
    }
    /**
     * 开始事务，AOP中的前置通知
     */
    public void beginTransaction() throws SQLException {
        // 开启事务
        connectionUtil.getThreadConnection().setAutoCommit(false);
    }
    /**
     * 提交事务，AOP中的后置通知
     */
    public void commitTransaction() throws SQLException {
        connectionUtil.getThreadConnection().commit();
    }
    /**
     * 回滚事务，AOP中的异常通知
     */
    public void rollback() throws SQLException {
        connectionUtil.getThreadConnection().rollback();
    }
    /**
     * 释放连接，AOP中的最终通知
     */
    public void release() throws SQLException {
        connectionUtil.getThreadConnection().close();
    }
}
