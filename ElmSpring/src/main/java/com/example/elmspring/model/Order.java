package com.example.elmspring.model;

/**
 * @ClassName: Order
 * @Description: TODO
 * @Author: Zgz
 * @Date: 2022/8/16 15:24
 * @Version: 1.0
 **/
public class Order {
    private long orderId;
    private long foodId;
    private long quantity;
    private String userId;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getFoodId() {
        return foodId;
    }

    public void setFoodId(long foodId) {
        this.foodId = foodId;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
