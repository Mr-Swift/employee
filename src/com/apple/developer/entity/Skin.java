package com.apple.developer.entity;

public class Skin {
    private int s_id;
    private String s_name;
    private String s_pic;
    private String h_id;

    private Hero hero;


    /**
     * 构造方法:无参,有参构造
     */

    public Skin() {
    }

    public Skin(String s_name, String s_pic, String h_id) {
        this.s_name = s_name;
        this.s_pic = s_pic;
        this.h_id = h_id;
    }

    public Skin(int s_id, String s_name, String s_pic, String h_id) {
        this.s_id = s_id;
        this.s_name = s_name;
        this.s_pic = s_pic;
        this.h_id = h_id;
    }

    /**
     * getter setter方法
     *
     */

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_pic() {
        return s_pic;
    }

    public void setS_pic(String s_pic) {
        this.s_pic = s_pic;
    }

    public String getH_id() {
        return h_id;
    }

    public void setH_id(String h_id) {
        this.h_id = h_id;
    }

    /**
     * 重写toString()方法
     */

    @Override
    public String toString() {
        return "skin:"+
                "\ts_id--->"+this.s_id+
                "\ts_name--->"+this.s_name+
                "\ts_pic--->"+this.s_pic+
                "\th_id--->"+this.h_id;
    }
}
