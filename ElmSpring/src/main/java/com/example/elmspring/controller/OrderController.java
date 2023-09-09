package com.example.elmspring.controller;

import com.example.elmspring.dto.BusInfoDto;
import com.example.elmspring.dto.BusInfoFoodDto;
import com.example.elmspring.model.Business;
import com.example.elmspring.service.BusinessService;
import com.example.elmspring.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName: OrderController
 * @Description: TODO
 * @Author: Zgz
 * @Date: 2022/8/16 16:40
 * @Version: 1.0
 **/
@RestController
public class OrderController {
    @Autowired
    BusinessService businessService;
    @Autowired
    OrderService orderService;
    @RequestMapping("/findOrder")
    public BusInfoDto findOrder(String userId, String businessId){
        BusInfoDto busInfoDto = new BusInfoDto();
        Business business = businessService.findBusById(Long.parseLong(businessId));
        List<BusInfoFoodDto> bifds = orderService.findOrder(userId);
        for (BusInfoFoodDto bifd :bifds){
            bifd.setTotalPrice(bifd.getNumber() * bifd.getPrice());
        }
        busInfoDto.setId(business.getId());
        busInfoDto.setName(business.getName());
        busInfoDto.setImg(business.getImg());
        busInfoDto.setStartPrice(business.getStartPrice());
        busInfoDto.setDeliveryPrice(business.getDeliveryPrice());
        busInfoDto.setFoods(bifds);
        return busInfoDto;
    }
}
