package com.jiang.pojo;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class Human {
        @Autowired//注解装配,每一个属性都注解一次，使用注解时可以不需要编写set方法，装配时默认bytype,同类型大于1时用byname装配。
        //@Resource(name = "cat"),自动装填跟Autowired相似，但可以指定bean id装配
        private Cat cat;//@Nullable注解指该
        @Autowired(required = false)//如果auto wired后面括号写了required设置为false，说明这个对象可以为null，否则不许为空
        private Dog dog;
        private String name;

        public Cat getCat() {
                return cat;
        }

        public void setCat(Cat cat) {
                this.cat = cat;
        }

        public Dog getDog() {
                return dog;
        }

        public void setDog(Dog dog) {
                this.dog = dog;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }
}
