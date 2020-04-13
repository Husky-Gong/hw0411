package com.zx.controller;

import com.zx.domain.Email;
import com.zx.service.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/email")
public class EmailController {
    @Autowired
    IEmailService iEmailService;

    @RequestMapping("/list.do")
    public List<Email> list(){
        return iEmailService.findAll();
    }


}
