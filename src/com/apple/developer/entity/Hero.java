package com.apple.developer.entity;

import java.io.Serializable;

public class Hero implements Serializable {
    private int h_id;
    private String h_name;
    private int t_id;
    private String publish_time;
    private String h_des;
    private String h_pic;

    private Type type;

    public Hero() {
    }

    public Hero(String h_name, String publish_time, String h_des, String h_pic) {
        this.h_name = h_name;
        this.publish_time = publish_time;
        this.h_des = h_des;
        this.h_pic = h_pic;
    }

    public int getH_id() {
        return h_id;
    }

    public void setH_id(int h_id) {
        this.h_id = h_id;
    }

    public String getH_name() {
        return h_name;
    }

    public void setH_name(String h_name) {
        this.h_name = h_name;
    }

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public String getPublish_time() {
        return publish_time;
    }

    public void setPublish_time(String publish_time) {
        this.publish_time = publish_time;
    }

    public String getH_des() {
        return h_des;
    }

    public void setH_des(String h_des) {
        this.h_des = h_des;
    }

    public String getH_pic() {
        return h_pic;
    }

    public void setH_pic(String h_pic) {
        this.h_pic = h_pic;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
