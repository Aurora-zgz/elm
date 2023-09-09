package com.example.elmspring.model;

import java.util.List;

/**
 * @ClassName: Business
 * @Description: TODO
 * @Author: Zgz
 * @Date: 2022/8/12 16:39
 * @Version: 1.0
 **/

public class Business {
    private long id;
    private String name;
    private String img;
    private double startPrice;
    private double deliveryPrice;
    private String explain;

    // 一对多
    private List<Food> foods;

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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public double getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(double startPrice) {
        this.startPrice = startPrice;
    }

    public double getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }
}
