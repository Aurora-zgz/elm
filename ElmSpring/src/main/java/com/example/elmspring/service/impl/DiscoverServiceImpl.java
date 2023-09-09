package com.example.elmspring.service.impl;

import com.example.elmspring.dao.DiscoverDao;
import com.example.elmspring.model.Discover;
import com.example.elmspring.service.DiscoverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: DisCoverServiceImpl
 * @Description: TODO
 * @Author: Zgz
 * @Date: 2022/8/18 17:38
 * @Version: 1.0
 **/
@Service
public class DiscoverServiceImpl implements DiscoverService {
    @Autowired
    DiscoverDao disCoverDao;
    @Override
    public List<Discover> getAllDiscover() {
        return disCoverDao.getAllDiscover();
    }
}
