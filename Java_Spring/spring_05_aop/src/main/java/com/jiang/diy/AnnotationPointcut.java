package com.jiang.diy;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect//使用注解实现AOP，标注这个类是一个切面
public class AnnotationPointcut {
    @Before("execution(* com.jiang.service.UserServiceImpl.*(..))")//注解中的内容是写切入点
    public void before(){
    System.out.println("===方法执行前");}
    @After("execution(* com.jiang.service.UserServiceImpl.*(..))")
            public void after(){
            System.out.println("方法执行后");
        }
    //在环绕增强中，我们可以给定一个参数，代表我们要获取处理切入的点
    @Around("execution(* com.jiang.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {//输入切入点
        System.out.println("环绕前");
        Signature signature=jp.getSignature();//获得签名，签名就是被执行的东西的名字，如方法名
        System.out.println("signature:"+signature);

        //执行方法
        Object proceed=jp.proceed();
        System.out.println("环绕后");//这个环绕注解的核心就是环绕前、执行方法、环绕后
    }
}
