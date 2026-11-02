package com.example.cruddemo.service.impl;

import com.example.cruddemo.entity.User;
import com.example.cruddemo.mapper.UserMapper;
import com.example.cruddemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() { return userMapper.findAll(); }
    @Override
    public User findById(Integer id) { return userMapper.findById(id); }
    @Override
    public void addUser(User user) { userMapper.insert(user); }
    @Override
    public void updateUser(User user) { userMapper.update(user); }
    @Override
    public void deleteUser(Integer id) { userMapper.deleteById(id); }
}