package com.xiaoh.springboot.jpa.repository;

import com.xiaoh.springboot.jpa.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

/**
 * 用户Repository
 * @author xiaoH
 * @date 2019-10-21
 */
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * 根据id集合查询
     * @param ids
     * @return
     */
    List<User> findByIdIn(Collection<Long> ids);

}
