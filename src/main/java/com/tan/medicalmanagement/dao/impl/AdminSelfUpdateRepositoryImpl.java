package com.tan.medicalmanagement.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tan.medicalmanagement.dao.AdminSelfUpdateRepository;
import com.tan.medicalmanagement.entity.Admin;
import com.tan.medicalmanagement.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdminSelfUpdateRepositoryImpl implements AdminSelfUpdateRepository {
    @Autowired
    private AdminMapper adminMapper;


    @Override
    public void rootSelfUpdate(Integer id,String name,String password) {
        Admin admin = new Admin(id,name,password);
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("adid",id);
        adminMapper.update(admin,wrapper);
    }
}
