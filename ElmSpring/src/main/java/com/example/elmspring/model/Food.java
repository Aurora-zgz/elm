package com.example.elmspring.model;

/**
 * @ClassName: Food
 * @Description: TODO
 * @Author: Zgz
 * @Date: 2022/8/15 16:36
 * @Version: 1.0
 **/
public class Food {
    private long id;
    private String name;
    private String explain;
    private String img;
    private double price;

    //一对一 目前不需要
    // private Business business;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
