package com.tan.medicalmanagement.service.impl;

import com.tan.medicalmanagement.dao.LoginRepository;
import com.tan.medicalmanagement.entity.Admin;
import com.tan.medicalmanagement.entity.User;
import com.tan.medicalmanagement.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginRepository loginRepository;

    @Override
    public String Login(String username, String password, String type, HttpSession session) {
        String str = "";
        User user =new User();
        Admin admin = new Admin();
        Object obj = "";

        switch (type){
            case "user":
                user = loginRepository.loginUser(username,password);
                obj = user;
                break;
            case "admin":
                admin = loginRepository.loginAdmin(username, password);
                obj = admin;
                break;
        }
        if (obj == null){
            str = "redirect:/login";
        }else if (obj == user){
            session.setAttribute("user",user);
            session.setAttribute("name",user.getName());
            str = "redirect:/usermain";
        }else if (obj == admin){
            session.setAttribute("admin",admin);
            session.setAttribute("name",admin.getName());
            str = "redirect:/adminmain";
        }
        return str;
    }
}
