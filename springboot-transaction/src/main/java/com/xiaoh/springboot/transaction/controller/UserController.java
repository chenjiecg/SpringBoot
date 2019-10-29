package com.xiaoh.springboot.transaction.controller;

import com.xiaoh.springboot.transaction.domain.User;
import com.xiaoh.springboot.transaction.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author xiaoH
 * @date 2019/10/28
 * @description
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users")
    public List<User> findAll() {
        return userService.findAll();
    }

    @RequestMapping(value = "/add")
    public List<User> save(String name, String password) {
        User user = new User();
        user.setName(name);
        user.setPassword(password);

        Long userId = userService.save(user);

        return userService.findAll();
    }
}
