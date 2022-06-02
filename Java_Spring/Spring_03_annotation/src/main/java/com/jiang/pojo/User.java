package com.jiang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component//组件，等价于<bean id="user" class="com.kuang.pojo.User">在容器中注册
public class User{
    @Value("蒋山")//相当于<property name="name" value="蒋山"/>
    private String name;
    private int age;
    public User(){
    }//无参构造

    public User(String name,int age){//构造函数
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    //@Value("蒋山")也可以放在set上面
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
