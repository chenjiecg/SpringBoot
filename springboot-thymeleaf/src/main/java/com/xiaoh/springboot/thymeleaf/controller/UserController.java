package com.xiaoh.springboot.thymeleaf.controller;

import com.xiaoh.springboot.thymeleaf.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaoH
 * @date 2019/10/18
 * @description
 */
@Controller
public class UserController {

    @GetMapping(value = "/users")
    public ModelAndView users() {
        List<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setId(1L);
        user1.setName("xiaoH");
        user1.setAge(29);

        User user2 = new User();
        user2.setId(2L);
        user2.setName("萧炎");
        user2.setAge(29);

        users.add(user1);
        users.add(user2);

        ModelAndView mv = new ModelAndView();
        mv.addObject("users", users);
        mv.setViewName("users");

        return mv;

    }
}
