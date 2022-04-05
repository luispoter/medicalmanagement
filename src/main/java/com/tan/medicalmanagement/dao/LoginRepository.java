package com.tan.medicalmanagement.dao;

import com.tan.medicalmanagement.entity.Admin;
import com.tan.medicalmanagement.entity.User;

public interface LoginRepository {
    User loginUser(String username, String password);
    Admin loginAdmin(String username, String password);
}
