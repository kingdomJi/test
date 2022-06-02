package com.jiang.demo03;

public class Host implements Rent{
    @Override
    public void rent(String str) {
        System.out.println(str+"要出租房子");
    }

    @Override
    public float sell(float money) {
        return 880000+money;
    }
}
