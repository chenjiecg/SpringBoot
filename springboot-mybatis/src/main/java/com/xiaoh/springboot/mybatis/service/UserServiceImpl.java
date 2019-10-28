package com.xiaoh.springboot.mybatis.service;

import com.xiaoh.springboot.mybatis.dao.UserDao;
import com.xiaoh.springboot.mybatis.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xiaoH
 * @date 2019/10/28
 * @description
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
