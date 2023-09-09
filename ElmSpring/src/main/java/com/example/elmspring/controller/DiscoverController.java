package com.example.elmspring.controller;

import com.example.elmspring.model.Discover;
import com.example.elmspring.service.DiscoverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @projectName: ElmSpring
 * @package: com.example.elmspring.controller
 * @className: DiscoverController
 * @author: coderJ
 * @description: TODO
 * @date: 2022/8/18 12:28
 * @version: 1.0
 */

@RestController
public class DiscoverController {

    @Autowired
    DiscoverService discoverService;

    @GetMapping("/getAllDiscover")
    public List<Discover> getAllDiscover(){
        return discoverService.getAllDiscover();
    }
}
