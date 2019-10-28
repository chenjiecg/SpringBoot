package com.xiaoh.springboot.mybatis.service;

import com.xiaoh.springboot.mybatis.domain.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
}
