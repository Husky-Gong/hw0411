package com.zx.controller;

import com.zx.domain.Email;
import com.zx.domain.User;
import com.zx.service.IEmailService;
import com.zx.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class EmailController {

    @Autowired
    IEmailService iEmailService;

    @Autowired
    IUserService iUserService;

    @RequestMapping("/listEmails")
    public ModelAndView listEmails(){
        ModelAndView mav = new ModelAndView();
        List<Email> emails = iEmailService.findAll();
        for(Email email:emails){
            System.out.println(email);
        }
        mav.addObject("emails",emails);
        mav.setViewName("email");
        return mav;
    }

    @RequestMapping("/userLogin")
    public String userLogin(String uname, String pwd, HttpServletRequest request){
        System.out.println("username:"+uname+"\t password:"+pwd);
        User user = iUserService.selectOne(uname,pwd);
        if(user != null) return "redirect:/email.jsp";
        else{
            request.setAttribute("msg", "Failed");
            return "forward:/login.jsp";
        }
    }


}
