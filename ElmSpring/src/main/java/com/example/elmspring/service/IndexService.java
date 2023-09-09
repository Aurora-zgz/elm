package com.example.elmspring.service;

import com.example.elmspring.model.Business;
import com.example.elmspring.model.BusinessType;

import java.util.List;
public interface IndexService {
    public List<BusinessType> findAllBusinessTypes();
    public List<Business> findAllBusinesses();
}
