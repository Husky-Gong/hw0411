package com.zx.service.impl;

import com.zx.domain.User;
import com.zx.mapper.UserMapper;
import com.zx.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User selectOne(String uname, String pwd) {
        User user = userMapper.selectOne(uname, pwd);
        return user;
    }
}
