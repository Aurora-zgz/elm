package com.example.elmspring.dto;

import com.example.elmspring.model.Business;
import com.example.elmspring.model.Food;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: BusinessInfoDto
 * @Description: TODO
 * @Author: Zgz
 * @Date: 2022/8/16 14:06
 * @Version: 1.0
 **/
public class BusInfoDto {
    private long id;
    private String name;
    private String img;
    private double startPrice;
    private double deliveryPrice;
    private String explain;
    List<BusInfoFoodDto> foods;
    //商家信息页面 去结算需保存userId 仅仅为了需要返回userId而加的字段，
    private String userId;
    private int totalNum;
    private int allPrice;

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

    public List<BusInfoFoodDto> getFoods() {
        return foods;
    }

    public void setFoods(List<BusInfoFoodDto> foods) {
        this.foods = foods;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }

    public int getAllPrice() {
        return allPrice;
    }

    public void setAllPrice(int allPrice) {
        this.allPrice = allPrice;
    }

    //商家信息页面 封装前台数据BusInfoDto：BusInfoFoodDto,business
    public BusInfoDto setBuInfoDto(Business business,List<Food> foods){
        BusInfoDto busInfoDto = new BusInfoDto();
        List<BusInfoFoodDto> bfs = new ArrayList<BusInfoFoodDto>();
        for(Food food :foods){
            BusInfoFoodDto bf = new BusInfoFoodDto();
            bf.setId(food.getId());
            bf.setName(food.getName());
            bf.setImg(food.getImg());
            bf.setPrice(food.getPrice());
            bf.setExplain(food.getExplain());
            bf.setNumber(0);
            bf.setDisplay("display:none");
            bfs.add(bf);
        }
        busInfoDto.setFoods(bfs);
        busInfoDto.setId(business.getId());
        busInfoDto.setName(business.getName());
        busInfoDto.setImg(business.getImg());
        busInfoDto.setExplain(business.getExplain());
        busInfoDto.setStartPrice(business.getStartPrice());
        busInfoDto.setDeliveryPrice(business.getDeliveryPrice());
        busInfoDto.setTotalNum(0);
        busInfoDto.setAllPrice(0);
        return busInfoDto;
    }

}
