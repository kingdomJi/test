package com.jiang.pojo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
private String name;
private String[] books;//数组
    private Map<String,String> card;
private List<String> hobbies;//集合，string[]数组里面是存放string型的值，List<string>是存放string类型的对象。List<>存放一个实体类可以是string，int或者自定义的
    // 数组的容量是固定的，您只能一次获取或设置一个元素的值，而List<T>的容量可根据需要自动扩充、修改、删除或插入数据。
private Set<String> games;//Set是集合的意思，是同种对象的集合。
private Address address;
private Properties info;

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCard(Map<String, String> card) {
        this.card = card;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public void setGames(Set<String> games) {
        this.games = games;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getCard() {
        return card;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public Set<String> getGames() {
        return games;
    }

    @Override
    public String toString() {
        return "Student:"+name+'\n'+"hobbies:"+hobbies;
    }
}
