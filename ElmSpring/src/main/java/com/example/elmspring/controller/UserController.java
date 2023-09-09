package com.example.elmspring.controller;

import com.example.elmspring.model.User;
import com.example.elmspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: UserController
 * @Description: TODO
 * @Author: Zgz
 * @Date: 2022/8/15 14:12
 * @Version: 1.0
 **/
@RestController
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/login")
    public User login(@RequestBody User user){
        User u = userService.login(user);
        if(u != null) {
            u.setPassword("");
        }
        return u;
    }

    @RequestMapping("/register")
    public String register(@RequestBody User user){
        User u = userService.findUserById(user.getUserId());
        if(u==null){
            userService.register(user);
            return "ok";
        }
        return "false";
    }
}
