package com.example.elmspring.service.impl;

import com.example.elmspring.dao.UserDao;
import com.example.elmspring.model.User;
import com.example.elmspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserSerivceImpl
 * @Description: TODO
 * @Author: Zgz
 * @Date: 2022/8/15 14:31
 * @Version: 1.0
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public User login(User user) {
        return userDao.login(user);
    }

    @Override
    public void register(User user) {
        userDao.register(user);
    }

    @Override
    public User findUserById(String userId) {
        return userDao.findUserById(userId);
    }
}
