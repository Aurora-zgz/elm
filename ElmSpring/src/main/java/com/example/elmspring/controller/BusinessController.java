package com.example.elmspring.controller;

import com.example.elmspring.model.Business;
import com.example.elmspring.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @ClassName: BusinessController
 * @Description: TODO
 * @Author: Zgz
 * @Date: 2022/8/15 15:29
 * @Version: 1.0
 **/
@RestController
public class BusinessController {
    @Autowired
    BusinessService businessService;

    @RequestMapping("/businessList")
    public List<Business> businessList(HttpServletRequest request){
        String typeId = request.getParameter("id");
        // System.out.println(typeId);
        return businessService.findBusByTypeId(Long.parseLong(typeId));
    }


}
