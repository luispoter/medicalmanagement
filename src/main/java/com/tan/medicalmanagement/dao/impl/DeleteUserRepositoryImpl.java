package com.tan.medicalmanagement.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tan.medicalmanagement.dao.DeleteUserRepository;
import com.tan.medicalmanagement.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DeleteUserRepositoryImpl implements DeleteUserRepository {

    @Autowired
    private UserMapper userMapper;
    @Override
    public void deleteUser(Integer id) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("docid",id);
        userMapper.delete(wrapper);
    }
}
