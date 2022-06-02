package com.jiang.demo01;

public class Client {
    public static void main(String[] args) {
        Host host=new Host();
        Proxy proxy=new Proxy(host);//代理,代替房东行事
        proxy.rent();

    }
}
