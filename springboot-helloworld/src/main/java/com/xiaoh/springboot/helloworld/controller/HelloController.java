package com.xiaoh.springboot.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaoH
 * @date 2019/10/16
 * @description
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello")
    public String hello() {

        return "Hello, SpringBoot!";
    }
}
