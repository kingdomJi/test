package com.jiang.pojo;


import lombok.Data;
@Data//注解在类，生成setter/getter、equals、canEqual、hashCode、toString方法
public class User {//实体类
    private int id;
    private String name;
    private String pwd;

}
