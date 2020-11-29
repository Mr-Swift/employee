package com.apple.developer.entity;

import java.io.Serializable;

public class Type implements Serializable {
    private int t_id;
    private String t_name;

    /**
     * 构造方法:无参,有参构造
     */

    public Type() {
    }

    public Type(String t_name) {
        this.t_name = t_name;
    }

    public Type(int t_id, String t_name) {
        this.t_id = t_id;
        this.t_name = t_name;
    }

    /**
     * getter setter方法
     *
     */

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    /**
     * 重写toString()方法
     */
    @Override
    public String toString() {
        return "type:"+
                "\tt_id--->"+this.t_id+
                "\tt_name--->"+this.t_name;
    }
}
