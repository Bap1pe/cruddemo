package com.example.cruddemo.service;

import com.example.cruddemo.entity.User;
import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(Integer id);
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(Integer id);
}

