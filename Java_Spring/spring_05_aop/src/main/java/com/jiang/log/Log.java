package com.jiang.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Log implements MethodBeforeAdvice {//
    @Override
    //target 目标对象
    //method 目标对象的方法
    //args 方法参数
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"类的"+method.getName()+"方法被执行");
    }
}
