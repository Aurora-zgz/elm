package com.example.elmspring.dao;

import com.example.elmspring.dto.BusInfoFoodDto;
import com.example.elmspring.model.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDao {
    public void saveOrder(Order order);
    public List<BusInfoFoodDto> findOrder(String userId);
    public void removeOrder(String userId);
}
