package com.tan.medicalmanagement.dao.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tan.medicalmanagement.dao.SelectAdminRepository;
import com.tan.medicalmanagement.entity.Admin;
import com.tan.medicalmanagement.mapper.AdminMapper;
import com.tan.medicalmanagement.vo.DataVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class SelectAdminRepositoryImpl implements SelectAdminRepository {

    @Autowired
    private AdminMapper adminMapper;
    @Override
    public DataVO<Admin> findAdmin(Integer page, Integer limit) {
        DataVO dataVO = new DataVO();

        IPage<Admin> rootIPage = new Page<>(page,limit);
        IPage<Admin> result = adminMapper.selectPage(rootIPage, null);
        dataVO.setCode(0);
        dataVO.setMsg("");
        dataVO.setCount(result.getTotal());
        List<Admin> records = result.getRecords();
        dataVO.setData(records);
        return dataVO;
    }
}
