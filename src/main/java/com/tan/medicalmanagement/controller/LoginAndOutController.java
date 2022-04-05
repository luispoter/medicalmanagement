package com.tan.medicalmanagement.controller;

import com.tan.medicalmanagement.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginAndOutController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/mainpage")
    public String login(String username, String password, String type, HttpSession session){
        String str = loginService.Login(username,password,type,session);
        return str;
    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/login";
    }
}
