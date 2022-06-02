package com.jiang.demo02;

public class UserServiceProxy implements UserService{//为了在原有的UserService上做出一些增强，可以套一层代理
    private UserServiceImpl userService;//这里声明userService，对它进行代理
    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;//这里注入userService
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void query() {
        log("query");
        userService.query();
    }
    public void log(String msg){//日志方法
        System.out.println("使用了"+msg+"方法");
    }
}
