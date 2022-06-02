package com.jiang.demo01;

public class Proxy implements Rent{//代理
    private Host host;//代理里面有一个房东，这里用组合而非继承，提高内聚，降低耦合
    public Proxy(){//wucan构造函数
    }
    public Proxy(Host host){//有参构造，代理模式，除了原本的被代理对象，还包含一部分自身添加的内容
        this.host=host;
        seeHouse();
        contract();
        fare();
    }
    @Override
    public void rent() {
     host.rent();
    }
    public void seeHouse(){
        System.out.println("看看房子");
    }
    public void contract(){
        System.out.println("签个合同");
    }
    public void fare(){
        System.out.println("付个房费");
    }
}
