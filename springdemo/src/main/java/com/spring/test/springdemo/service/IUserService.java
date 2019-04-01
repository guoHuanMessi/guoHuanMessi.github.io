package com.spring.test.springdemo.service;

import com.spring.test.springdemo.pojo.UserVo;

import java.util.List;

public interface IUserService {

    public UserVo queryUserInfo(String password);
    public List<UserVo> queryUserInfo1();

    public boolean addUser(UserVo user);




}
