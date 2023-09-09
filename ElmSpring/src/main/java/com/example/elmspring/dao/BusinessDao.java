package com.example.elmspring.dao;

import com.example.elmspring.model.Business;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BusinessDao {
    public List<Business> findAllBusinesses();
    public List<Business> findBusByTypeId(long typeId);
    public Business findBusById(long id);
}
