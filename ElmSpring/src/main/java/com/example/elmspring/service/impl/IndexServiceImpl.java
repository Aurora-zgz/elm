package com.example.elmspring.service.impl;

import com.example.elmspring.dao.BusinessDao;
import com.example.elmspring.dao.BusinessTypeDao;
import com.example.elmspring.model.Business;
import com.example.elmspring.model.BusinessType;
import com.example.elmspring.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: IndexSeriveImpl
 * @Description: TODO
 * @Author: Zgz
 * @Date: 2022/8/12 15:18
 * @Version: 1.0
 **/
@Service
public class IndexServiceImpl implements IndexService {
    @Autowired
    BusinessTypeDao businessTypeDao;
    @Autowired
    BusinessDao businessDao;

    @Override
    public List<BusinessType> findAllBusinessTypes() {
        return businessTypeDao.findAllBusinessTypes();
    }

    @Override
    public List<Business> findAllBusinesses() {
        return businessDao.findAllBusinesses();
    }
}
