package com.example.elmspring.service;

import com.example.elmspring.model.Business;

import java.util.List;

public interface BusinessService {
    public List<Business> findBusByTypeId(long typeId);
    public Business findBusById(long id);
}
