package com.example.elmspring.model;

/**
 * @ClassName: User
 * @Description: TODO
 * @Author: Zgz
 * @Date: 2022/8/15 14:10
 * @Version: 1.0
 **/
public class User {
    private String userId;
    private String password;
    private String name;
    private int gender;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
