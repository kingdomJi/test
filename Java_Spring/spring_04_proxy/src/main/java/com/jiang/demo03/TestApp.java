package com.jiang.demo03;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestApp {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //Host target=new Host();
        //Host target2=new Host2();这样写不行
        Rent target=new Host();//左为名分，右为实际（编译看左，运行看右）
        Rent target2=new Host2();//这样写可以，左接口，右实现类，接口作为他们共同的头衔
        //method只在乎方法名称以及其参数类型
        Method method=Rent.class.getMethod("rent",String.class);//Rent.class:返回的对象是实现这个接口的某一个类型的实例,
                                                                     // 这个实例因为实现了Rent接口，都会有一个叫rent的方法存在
        //获取接口中方法rent对应的方法对象,传入(方法名，参数类型)，此时method代表rent方法了
        //invoke的两个参数，一个是该方法属于的类对象，一个是具体参数
        //这里method是一个独立的方法对象（与类对象对应）
        Object ret=method.invoke(target,"JiangShan");//执行target对象的rent方法，参数是Jiangshan
        Object ret2=method.invoke(target2,"ShanShan");//装填对象名，这里不需要知道方法名，方法名之前已经注册过了
        //一般调用方法是对象.方法（参数），这里是方法.invoke（对象，参数）
        //方法执行后返回一个Object
    }
}
