package com.zx.controller;

import com.zx.domain.Email;
import com.zx.service.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/email")
public class EmailController {
    @Autowired
    IEmailService iEmailService;

    @RequestMapping("/listEmails")
    public ModelAndView listEmails(){
        ModelAndView mav = new ModelAndView();
        List<Email> emals = iEmailService.findAll();
        mav.addObject("emails",emals);
        mav.setViewName("email");
        return mav;
    }


}
