package com.xiaoh.springboot.env.controller;

import com.xiaoh.springboot.env.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaoH
 * @date 2019/10/18
 * @description
 */
@RestController
public class PersonController {

    @Autowired
    Person person;

    @RequestMapping(value = "/env")
    public String env() {

        return person.toString();
    }
}
