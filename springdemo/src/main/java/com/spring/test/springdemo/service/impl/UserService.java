package com.spring.test.springdemo.service.impl;

import com.spring.test.springdemo.dao.UserDao;
import com.spring.test.springdemo.pojo.UserVo;
import com.spring.test.springdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@Transactional(propagation = Propagation.NOT_SUPPORTED,rollbackFor = Exception.class)
public class UserService implements IUserService {

    @Autowired
    private UserDao userdao;

    @Override
    public UserVo queryUserInfo(String password) {
        return userdao.queryUserInfo(password);
    }

    @Override
    public List<UserVo> queryUserInfo1() {
        return userdao.queryUserInfo1();
    }

    @Override
    public boolean addUser(UserVo user) {
        return userdao.addUser(user);
    }
}
