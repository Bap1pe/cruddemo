package com.example.cruddemo.controller;

import com.example.cruddemo.common.Result;
import com.example.cruddemo.entity.User;
import com.example.cruddemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // 1. 查列表：GET http://localhost:8080/users
    @GetMapping
    public Result<List<User>> list() {
        return Result.success(userService.findAll());
    }

    // 2. 查单条：GET http://localhost:8080/users/1
    @GetMapping("/{id}")
    public Result<User> getById(@PathVariable Integer id) {
        return Result.success(userService.findById(id));
    }

    // 3. 新增：POST http://localhost:8080/users
    @PostMapping
    public Result<String> add(@RequestBody User user) {
        userService.addUser(user);
        return Result.success("新增成功");
    }

    // 4. 修改：PUT http://localhost:8080/users
    @PutMapping
    public Result<String> update(@RequestBody User user) {
        userService.updateUser(user);
        return Result.success("修改成功");
    }

    // 5. 删除：DELETE http://localhost:8080/users/1
    @DeleteMapping("/{id}")
    public Result<String> delete(@PathVariable Integer id) {
        userService.deleteUser(id);
        return Result.success("删除成功");
    }
}