package com.example.elmspring.service.impl;

import com.example.elmspring.dao.BusinessDao;
import com.example.elmspring.model.Business;
import com.example.elmspring.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: BusinessServiceImpl
 * @Description: TODO
 * @Author: Zgz
 * @Date: 2022/8/15 15:29
 * @Version: 1.0
 **/
@Service
public class BusinessServiceImpl implements BusinessService {
    @Autowired
    BusinessDao businessDao;

    @Override
    public List<Business> findBusByTypeId(long typeId) {
        return businessDao.findBusByTypeId(typeId);
    }

    @Override
    public Business findBusById(long id) {
        return businessDao.findBusById(id);
    }
}
