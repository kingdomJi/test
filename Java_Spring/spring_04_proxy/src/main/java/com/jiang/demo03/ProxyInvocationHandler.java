package com.jiang.demo03;

import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public class ProxyInvocationHandler implements InvocationHandler{//这个类不是代理类，是动态代理生成类，用这个类自动生成代理类,InvocationHandler位于JDK反射包下，
                                                                // 其作用是在实现JDK动态代理的时候提供了动态执行增强逻辑的方法。
    private Object rent=null;//等待被处理的对象

    public void setRent(Rent rent){//获得传入对象的方法,这里传入的可能是名义接口，实际是实体类（多态）
        this.rent=rent;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {//核心，处理代理实例，并返回结果
            Object result=null;
            if(method.getName()=="rent"){//这里可以判断method的情况，然后编辑需要拓展的方法的功能
                result = method.invoke(rent, args);
                System.out.println("执行rent方法的拓展功能，返回结果为："+result);
            }
            else if(method.getName()=="sell"){
                result = method.invoke(rent, args);//这里的rent指的是被代理的对象名，而非方法名；这里的返回的result是？
                System.out.println("执行sell方法的拓展功能，返回结果为："+result);
            }
            //动态代理的实质是用反射机制实现
            myMethod();
        return result;//当method.invoke（）的方法有返回值时，会把它保存在result里返回
    }
    public void myMethod(){
        System.out.println("这里可以实现一些拓展功能");
    }


}
