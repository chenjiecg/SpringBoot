package com.xiaoh.springboot.mybatis.dao;

import com.xiaoh.springboot.mybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    List<User> findAll();

}
