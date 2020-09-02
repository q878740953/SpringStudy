package com.springAOP.log;

import org.aspectj.lang.ProceedingJoinPoint;

public class Logger {
    // 前置通知增强方法
    public void beforePrintLog(){
        System.out.println("我前置通知");
    }
    // 后置通知增强方法
    public void afterPrintLog(){
        System.out.println("我后置通知");
    }
    // 异常通知增强方法
    public void throwPrintLog(){
        System.out.println("我异常通知");
    }
    // 最终通知增强方法
    public void finallyPrintLog(){
        System.out.println("我最终通知");
    }
    // 环绕通知增强方法
    public Object aroundPrintLog(ProceedingJoinPoint joinPoint){
        Object returnValue = null;
        try {
            Object[] args = joinPoint.getArgs(); // 得到方法运行时的参数
            System.out.println("我前置通知");
            returnValue = joinPoint.proceed(args);// 明确调用业务层方法（切入点方法）
            System.out.println("我后置通知");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("我异常通知");
        }finally {
            System.out.println("我最终通知");
        }
        System.out.println("我是环绕通知");
        return returnValue;
    }
}
