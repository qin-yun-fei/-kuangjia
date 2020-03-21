package com.q.entity;

public class User {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void show() {
        System.out.println("我的名字是：" + name+",我正在学习spring!");
    }
}
