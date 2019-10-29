package com.xiaoh.springboot.transaction.service;

import com.xiaoh.springboot.transaction.domain.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    Long save(User user);
}
