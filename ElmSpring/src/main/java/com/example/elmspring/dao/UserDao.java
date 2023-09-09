package com.example.elmspring.dao;

import com.example.elmspring.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    public User login(User user);
    public void register(User user);
    public User findUserById(String userId);
}
