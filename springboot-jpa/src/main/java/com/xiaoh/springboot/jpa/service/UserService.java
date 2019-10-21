package com.xiaoh.springboot.jpa.service;

import com.xiaoh.springboot.jpa.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Collection;
import java.util.List;

/**
 * 用户Repository
 * @author xiaoH
 * @date 2019-10-21
 */
public interface UserService {

    User findById(long id);

    List<User> findAll();

    User save(User user);

    void delete(Long id);

    Page<User> findAll(Pageable pageable);

    /**
     * 根据id集合查询
     * @param ids
     * @return
     */
    List<User> findByIdIn(Collection<Long> ids);
}
