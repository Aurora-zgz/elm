package com.example.elmspring.service;

import com.example.elmspring.dto.BusInfoFoodDto;
import com.example.elmspring.model.Order;

import java.util.List;

public interface OrderService {
    public  void saveOrder(Order order);
    public List<BusInfoFoodDto> findOrder(String userId);
    public void removeOrder(String userId);
}
