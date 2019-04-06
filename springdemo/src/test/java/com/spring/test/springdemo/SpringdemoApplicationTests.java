package com.spring.test.springdemo;

import com.spring.test.springdemo.dao.UserDao;
import com.spring.test.springdemo.pojo.UserVo;
import com.spring.test.springdemo.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringdemoApplicationTests {
    @Autowired
    IUserService userDao;

    @Autowired
    UserDao userdao1;

    @Autowired
    RedisTemplate redisTemplate;

    @Test
    public void contextLoads() {
    }
    @Test
    public void test01(){
        List<UserVo> vo = userDao.queryUserInfo1();
        System.out.println(vo);

        UserVo vo1 = userDao.queryUserInfo("132");
        UserVo vo2= userdao1.queryUserInfo("132");

        System.out.println(vo1);
        System.out.println(vo2);

    }
    @Test
    public void test02(){
        UserVo vo = new UserVo(4,"小苏","susu","132");
        boolean isOk =userDao.addUser(vo);
        System.out.println(isOk);
    }

    @Test
    public void testRedisAdd(){
        redisTemplate.opsForValue().set("name","zhuhuan");
    }

    @Test
    public void testRedisQuery(){
        Object name = redisTemplate.opsForValue().get("name");
        System.out.println("redis的值："+name);
    }

}
