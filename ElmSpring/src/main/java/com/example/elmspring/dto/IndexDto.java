package com.example.elmspring.dto;

import com.example.elmspring.model.Business;
import com.example.elmspring.model.BusinessType;

import java.util.List;

/**
 * @ClassName: IndexDto
 * @Description: TODO
 * @Author: Zgz
 * @Date: 2022/8/12 16:49
 * @Version: 1.0
 **/
public class IndexDto {
    List<BusinessType> businessTypes;
    List<Business> businesses;

    public List<BusinessType> getBusinessTypes() {
        return businessTypes;
    }

    public void setBusinessTypes(List<BusinessType> businessTypes) {
        this.businessTypes = businessTypes;
    }

    public List<Business> getBusinesses() {
        return businesses;
    }

    public void setBusinesses(List<Business> businesses) {
        this.businesses = businesses;
    }
}
