package com.tan.medicalmanagement.service;

import javax.servlet.http.HttpSession;

public interface LoginService {
    String Login(String username, String password, String type, HttpSession session);
}
