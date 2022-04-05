package com.tan.medicalmanagement.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tan.medicalmanagement.dao.DeleteAdminRepository;
import com.tan.medicalmanagement.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DeleteAdminRepositoryImpl implements DeleteAdminRepository {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public void deleteAdmin(Integer id) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("adid",id);
        adminMapper.delete(wrapper);
    }
}
