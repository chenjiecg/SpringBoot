package com.xiaoh.springboot.transaction.dao;

import com.xiaoh.springboot.transaction.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    List<User> findAll();

    Long save(User user);

}
