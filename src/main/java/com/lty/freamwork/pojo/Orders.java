package com.lty.freamwork.pojo;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Orders {
    private int id;
   @Resource
    private User user;
    private String orderstatus;
    private int user_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
