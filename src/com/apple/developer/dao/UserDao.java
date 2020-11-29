package com.apple.developer.dao;

import com.apple.developer.entity.User;

public interface UserDao {
    public int insertUser(User user);
    public User findUserByName(String userName);
}
