package com.jiang.service;

public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("增加一个对象");
    }

    @Override
    public void delete() {
        System.out.println("删除一个对象");
    }

    @Override
    public void update() {
        System.out.println("更新一个对象");
    }

    @Override
    public void select() {
        System.out.println("查询一个对象");
    }
}
