package com.jiang.config;

import com.jiang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration//@Configuration代表这是一个配置类，如果开启包扫描，加载配置类以后就可以通过反射拿到配置类中的对象了
@ComponentScan("com.jiang.pojo")//如果在这里用这个扫描注解，配合pojo下的类上的@Component注解，就可以不用下面的@bean的内容了，这里实际上是创建了两次User对象。
@Import(JiangConfig2.class)//import注解将两个注解文件引到一起
public class JiangConfig {
@Bean//注册一个bean,相当于在xml写一个bean标签，Bean只写在方法上，这个方法的名字相当于bean的id,其返回值相当于class属性。
// 返回的是一个对象，但一般不获取已经在容器中的对象
    public User getUser(){//getUser是一个获得User对象的方法
    return new User();
}
}
