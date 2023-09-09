package com.example.elmspring.service;

import com.example.elmspring.model.User;

public interface UserService {
    public User login(User user);
    public void register(User user);
    public User findUserById(String userId);

}
