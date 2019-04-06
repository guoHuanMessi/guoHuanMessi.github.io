package com.spring.test.springdemo.service;

import com.spring.test.springdemo.pojo.UserVo;

import java.util.List;

public interface IUserService {

    UserVo queryUserInfo(String password);

    List<UserVo> queryUserInfo1();

    boolean addUser(UserVo user);


}
