package com.tan.medicalmanagement.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tan.medicalmanagement.dao.UserSelfUpdateRepository;
import com.tan.medicalmanagement.entity.User;
import com.tan.medicalmanagement.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class UserSelfUpdateRepositoryImpl implements UserSelfUpdateRepository {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void userSelfUpdate(Integer id, String password, String tel) {
        User user = new User(password, tel);
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("docid",id);
        userMapper.update(user,wrapper);
    }
}
