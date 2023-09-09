package com.example.elmspring.controller;

import com.example.elmspring.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: PaymentController
 * @Description: TODO
 * @Author: Zgz
 * @Date: 2022/8/16 17:33
 * @Version: 1.0
 **/
@RestController
public class PaymentController {
    @Autowired
    OrderService orderService;
    @RequestMapping("/payment")
    public String payment(String userId){
        orderService.removeOrder(userId);
        return "ok";
    }
}
