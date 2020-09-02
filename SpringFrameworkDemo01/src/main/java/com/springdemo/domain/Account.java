package com.springdemo.domain;

public class Account {
    private int id;
    private double money;
    private User user;

    public Account() {
        System.out.println("我被创建啦");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public void show(){
        user.show();
    }
}
