package com.jiang.demo02;

public class Client {//需要用增删改查

    public static void main(String[] args) {
        UserServiceImpl userService=new UserServiceImpl();//真实角色
        UserServiceProxy proxy=new UserServiceProxy();//代理角色
        proxy.setUserService(userService);//完成代理的注入，将真实角色的权力赋给代理角色
        proxy.add();//使用代理角色的能力（比如完善真实角色的能力）
        proxy.delete();
        proxy.update();
        proxy.query();
    }


}
