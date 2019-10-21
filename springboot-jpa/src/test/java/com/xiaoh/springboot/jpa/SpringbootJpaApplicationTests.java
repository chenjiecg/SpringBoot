package com.xiaoh.springboot.jpa;

import com.xiaoh.springboot.jpa.domain.User;
import com.xiaoh.springboot.jpa.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootJpaApplicationTests {

    @Resource
    UserService userService;

    @Test
    public void contextLoads() {

        // 查询所有数据
        List<User> users = userService.findAll();
        System.out.println("findAll():" + users);

        // 通过ID列表查询
        List<Long> ids = new ArrayList<>();
        ids.add(1L);
        ids.add(2L);
        List<User> users1 = userService.findByIdIn(ids);
        System.out.println("findByIdIn():" + users1);

        // 分页查询
        PageRequest pageRequest = new PageRequest(0, 10);
        Page<User> users2 = userService.findAll(pageRequest);
        System.out.println("page findAll():" + users2 + ", totlaPages:" + users2.getTotalPages() + ", pageSize:" + users2.getSize());

        // 新增数据
        User user = new User();
        user.setId(3l);
        user.setName("lindong");
        user.setPassword("123456");
        userService.save(user);
        System.out.println("save():" + userService.findAll());

        // 删除数据
        userService.delete(3l);
        System.out.println("delete():" + userService.findAll());

    }

}
