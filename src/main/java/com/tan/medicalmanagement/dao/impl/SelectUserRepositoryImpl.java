package com.tan.medicalmanagement.dao.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tan.medicalmanagement.dao.SelectUserRepository;
import com.tan.medicalmanagement.entity.User;
import com.tan.medicalmanagement.mapper.UserMapper;
import com.tan.medicalmanagement.vo.DataVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class SelectUserRepositoryImpl implements SelectUserRepository {
    @Autowired
    private UserMapper userMapper;

    @Override
    public DataVO<User> findUser(Integer page, Integer limit) {
        DataVO dataVO = new DataVO();
        IPage<User> userIPage = new Page<>(page,limit);
        IPage<User> result = userMapper.selectPage(userIPage, null);
        dataVO.setCode(0);
        dataVO.setMsg("");
        dataVO.setCount(result.getTotal());
        List<User> records = result.getRecords();
        dataVO.setData(records);
        return dataVO;
    }
}
