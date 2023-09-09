package com.example.elmspring.service.impl;

import com.example.elmspring.dao.OrderDao;
import com.example.elmspring.dto.BusInfoFoodDto;
import com.example.elmspring.model.Order;
import com.example.elmspring.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: OrderServiceImpl
 * @Description: TODO
 * @Author: Zgz
 * @Date: 2022/8/16 15:28
 * @Version: 1.0
 **/
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderDao orderDao;
    @Override
    public void saveOrder(Order order) {
        orderDao.saveOrder(order);
    }

    @Override
    public List<BusInfoFoodDto> findOrder(String userId) {
        return orderDao.findOrder(userId);
    }

    @Override
    public void removeOrder(String userId) {
        orderDao.removeOrder(userId);
    }
}
