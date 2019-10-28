package com.xiaoh.springboot.mybatis.controller;

import com.xiaoh.springboot.mybatis.domain.User;
import com.xiaoh.springboot.mybatis.service.UserService;
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
}
