package com.zx.service.impl;

import com.zx.domain.Email;
import com.zx.mapper.EmailMapper;
import com.zx.service.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailServiceImpl implements IEmailService {

    @Autowired
    EmailMapper emailMapper;

    @Override
    public List<Email> findAll() {
        return emailMapper.findAll();
    }

}
