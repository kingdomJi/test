package com.jiang.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class Afterlog implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了"+method.getName()+"的方法"+"返回结果为："+returnValue);
    }
}
