package com.spring.test.springdemo;

import com.spring.test.springdemo.dao.UserDao;
import com.spring.test.springdemo.pojo.UserVo;
import com.spring.test.springdemo.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringdemoApplicationTests {
    @Autowired
    IUserService userDao;

    @Autowired
    UserDao userdao1;
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
}
