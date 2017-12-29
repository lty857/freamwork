package com.lty.freamwork.pojo;

public class User implements Eatable{
    private int id;
    private String username;
    private String password;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void eat() {
        System.out.println("正在吃");
    }
}
