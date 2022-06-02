package com.jiang.demo03;

public class Host2 implements Rent{
    @Override
    public void rent(String str) {
        System.out.println(str+"要出租豪宅房子");
    }

    @Override
    public float sell(float money) {
        return 0;
    }
}
