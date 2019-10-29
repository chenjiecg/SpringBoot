package com.xiaoh.springboot.transaction.service;

import com.xiaoh.springboot.transaction.dao.UserDao;
import com.xiaoh.springboot.transaction.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

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

    /**
     * 开启事务，采用读写提交的隔离级别，超时时间设置为1s
     * @return
     */
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED, timeout = 1)
    public List<User> findAll() {
        return userDao.findAll();
    }

    /**
     * 开启事务，采用读写提交的隔离级别，超时时间设置为1s
     * @return
     * */
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED, timeout = 1)
    public Long save(User user) {
        return userDao.save(user);
    }
}
