package com.apple.developer.entity;

import java.io.Serializable;

public class User implements Serializable {
    private int u_id;
    private String userName;
    private String password;

    /**
     * 构造方法:无参,有参构造
     */
    public User() {
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public User(int u_id, String userName, String password) {
        this.u_id = u_id;
        this.userName = userName;
        this.password = password;
    }

    /**
     * getter setter方法
     *
     */

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 重写toString()方法
     */
    @Override
    public String toString() {
        return "user:" +
                "\tid--->"+this.u_id+
                "\tuserName--->"+this.userName+
                "\tpassword--->"+this.password;
    }
}
