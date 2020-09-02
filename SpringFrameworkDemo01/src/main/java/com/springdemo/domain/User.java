package com.springdemo.domain;

public class User {
    private String name;
    private int age;

    public User() {
        System.out.println("我是构造函数，我被创建了");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void show(){
        System.out.println(name);
    }
}
