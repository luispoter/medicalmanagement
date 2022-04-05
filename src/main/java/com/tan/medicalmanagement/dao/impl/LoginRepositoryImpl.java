package com.tan.medicalmanagement.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tan.medicalmanagement.dao.LoginRepository;
import com.tan.medicalmanagement.entity.Admin;
import com.tan.medicalmanagement.entity.User;
import com.tan.medicalmanagement.mapper.AdminMapper;
import com.tan.medicalmanagement.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoginRepositoryImpl implements LoginRepository {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public User loginUser(String username, String password) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("username",username);
        wrapper.eq("password",password);
        User user = userMapper.selectOne(wrapper);
        return user;
    }

    @Override
    public Admin loginAdmin(String username, String password) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("username",username);
        wrapper.eq("password",password);
        Admin admin = adminMapper.selectOne(wrapper);
        return admin;
    }
}
