package com.zx.service;

import com.zx.domain.User;

public interface IUserService {
    User selectOne(String uname, String pwd);
}
