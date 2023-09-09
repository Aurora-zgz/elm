package com.example.elmspring.controller;

import com.example.elmspring.dao.OrderDao;
import com.example.elmspring.dto.BusInfoDto;
import com.example.elmspring.dto.BusInfoFoodDto;
import com.example.elmspring.model.Business;
import com.example.elmspring.model.Food;
import com.example.elmspring.model.Order;
import com.example.elmspring.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @ClassName: BusinessInfoController
 * @Description: TODO
 * @Author: Zgz
 * @Date: 2022/8/15 16:11
 * @Version: 1.0
 **/
@RestController
public class BusinessInfoController {
    @Autowired
    BusinessService businessService;
    @Autowired
    OrderDao orderDao;
    @GetMapping("/businessInfo")
    public BusInfoDto businessInfo(HttpServletRequest request){
        String id = request.getParameter("id");
        Business business =businessService.findBusById(Long.parseLong(id));
        List<Food> foods = business.getFoods();
        BusInfoDto busInfoDto = new BusInfoDto();
        //调用BusInfoDto类 将商品business和食物BusInfoFoodDto封装成一个整体返回
        BusInfoDto biDto = busInfoDto.setBuInfoDto(business, foods);
        return biDto;
    }
    
    @RequestMapping("/saveOrder")
    public String saveOrder(@RequestBody BusInfoDto busInfoDto){
        //商家信息页面 去结算数据封装：
        List<BusInfoFoodDto> fds = busInfoDto.getFoods();
        for (BusInfoFoodDto fd : fds){
            Long number=fd.getNumber();
            if (number==0) continue;
            Order order = new Order();
            order.setFoodId(fd.getId());
            order.setQuantity(number);
            order.setUserId(busInfoDto.getUserId());
            orderDao.saveOrder(order);
        }
        return "ok";
    }
}
