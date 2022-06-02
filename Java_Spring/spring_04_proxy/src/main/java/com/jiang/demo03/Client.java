package com.jiang.demo03;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        //这里需要一个真实角色和一个代理角色
        //真实角色
        //1、创建目标对象
        Rent host=new Host();
        Rent host2=new Host2();
        //没有现成的代理类（代理角色），要调用程序处理角色生成用户需要的代理类.
        //2、创建InvocationHandler对象
        ProxyInvocationHandler pih=new ProxyInvocationHandler();//通过代理对象召唤师实现生成
        ProxyInvocationHandler pih2=new ProxyInvocationHandler();
        pih.setRent(host);//注入代理的真实角色到处理角色中去,让pih.invoke中的method知道执行的是host的方法

        //3、通过newProxyInstance方法创建Proxy动态代理对象，
        // 生成代理角色，记得转成接口类型，因为host.getClass()实际上是接口类型Rent,所以可以转
        //这里传入host的类加载器、host的实现接口、代理类要完成的功能pih。前两个是固定写法
        Rent proxy = (Rent) Proxy.newProxyInstance(host.getClass().getClassLoader(), host.getClass().getInterfaces(),pih);
        //4.1、通过代理执行无返回值方法。
        proxy.rent("jiangshan");//注意，这里的rent执行的其实是在Proxy.newProxyInstance中传入的pih中的invoke方法
        //这里会将rent作为method参数传到invoke方法中
        //4.2、当代理的方法有返回值时的情况
        float result=proxy.sell(50);
        System.out.println(result);
    }
}
