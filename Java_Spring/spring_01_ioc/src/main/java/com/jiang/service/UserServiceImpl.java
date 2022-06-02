package com.jiang.service;

import com.jiang.dao.UserDao;
import com.jiang.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
    //private UserDao userDao= new UserDaoImpl();//这里写死了，不好
    //换一种，利用set方法实现动态值的注入，接口的思想,好处是业务层的代码不用修改了。
    //将控制权（主动权）交给用户（调用者）
    //程序只负责提供接口

    private UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao=userDao;//前者表示该类拥有的userDao,后者指该方法传入的userDao.
    }
    @Override
    public void getUser() {//service中的方法实现通过调用Dao中的方法
        userDao.getUser();
    }

}
