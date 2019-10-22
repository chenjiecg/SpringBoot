package com.xiaoh.springboot.redis;

import com.xiaoh.springboot.redis.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRedisApplicationTests {

    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Test
    public void contextLoads() {

        ValueOperations<String, String> operations = stringRedisTemplate.opsForValue();
        operations.set("name", "小H");
        System.out.println("获取name：" + operations.get("name"));

        ValueOperations operations1 = redisTemplate.opsForValue();
        User user = new User();
        user.setId(1L);
        user.setName("xiaoH");
        user.setAge(29);

        operations1.set("user", user);
        User user1 = (User) operations1.get("user");
        System.out.println("获取用户信息：" + user1);

    }

}
