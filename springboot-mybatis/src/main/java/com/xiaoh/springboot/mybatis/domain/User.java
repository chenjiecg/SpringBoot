package com.xiaoh.springboot.mybatis.domain;

/**
 * 用户表
 * @author xiaoH
 * @date 2019/10/21
 * @description
 */
public class User {

    // 主键
    private String id;

    // 用户名
    private String name;

    // 密码
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
