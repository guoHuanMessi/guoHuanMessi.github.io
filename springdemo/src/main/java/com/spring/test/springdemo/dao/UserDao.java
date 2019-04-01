package com.spring.test.springdemo.dao;

import com.spring.test.springdemo.pojo.UserVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserDao {

        public UserVo queryUserInfo(@Param("password") String  password);
        public List<UserVo> queryUserInfo1();

        public boolean add(UserVo user);
}
