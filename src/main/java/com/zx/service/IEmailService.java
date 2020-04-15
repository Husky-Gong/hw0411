package com.zx.service;

import com.zx.domain.Email;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IEmailService {
    public List<Email> findAll(String uname);
}
