package com.example.elmspring.controller;

import com.example.elmspring.dto.IndexDto;
import com.example.elmspring.model.Business;
import com.example.elmspring.model.BusinessType;
import com.example.elmspring.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @ClassName: Index
 * @Description: TODO
 * @Author: Zgz
 * @Date: 2022/8/12 13:23
 * @Version: 1.0
 **/
@RestController
public class IndexController {
    @Autowired
    IndexService indexService;
    @GetMapping("/index")
    public IndexDto index(){
        List<BusinessType> businessTypeList=indexService.findAllBusinessTypes();
        List<Business> businessList=indexService.findAllBusinesses();
        IndexDto indexDto = new IndexDto();
        indexDto.setBusinesses(businessList);
        indexDto.setBusinessTypes(businessTypeList);
        return indexDto;
    }

}
