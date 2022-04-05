package com.tan.medicalmanagement.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tan.medicalmanagement.dao.SelectEachDocListRepository;
import com.tan.medicalmanagement.entity.User;
import com.tan.medicalmanagement.mapper.UserMapper;
import com.tan.medicalmanagement.vo.DataVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SelectEachDocListRepositoryImpl implements SelectEachDocListRepository {

    @Autowired
    private UserMapper userMapper;

    @Override
    public DataVO<User> findUser1(Integer page, Integer limit) {
        DataVO dataVO = new DataVO();
        IPage<User> userIPage = new Page<>(page,limit);
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("title","主任医师");
        IPage<User> result = userMapper.selectPage(userIPage, wrapper);
        dataVO.setCode(0);
        dataVO.setMsg("");
        dataVO.setCount(result.getTotal());
        List<User> records = result.getRecords();
        dataVO.setData(records);
        return dataVO;
    }

    @Override
    public DataVO<User> findUser2(Integer page, Integer limit) {
        DataVO dataVO = new DataVO();
        IPage<User> userIPage = new Page<>(page,limit);
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("title","副主任医师");
        IPage<User> result = userMapper.selectPage(userIPage, wrapper);
        dataVO.setCode(0);
        dataVO.setMsg("");
        dataVO.setCount(result.getTotal());
        List<User> records = result.getRecords();
        dataVO.setData(records);
        return dataVO;
    }

    @Override
    public DataVO<User> findUser3(Integer page, Integer limit) {
        DataVO dataVO = new DataVO();
        IPage<User> userIPage = new Page<>(page,limit);
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("title","主治医师");
        IPage<User> result = userMapper.selectPage(userIPage, wrapper);
        dataVO.setCode(0);
        dataVO.setMsg("");
        dataVO.setCount(result.getTotal());
        List<User> records = result.getRecords();
        dataVO.setData(records);
        return dataVO;
    }

    @Override
    public DataVO<User> findUser4(Integer page, Integer limit) {
        DataVO dataVO = new DataVO();
        IPage<User> userIPage = new Page<>(page,limit);
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("title","住院医师");
        IPage<User> result = userMapper.selectPage(userIPage, wrapper);
        dataVO.setCode(0);
        dataVO.setMsg("");
        dataVO.setCount(result.getTotal());
        List<User> records = result.getRecords();
        dataVO.setData(records);
        return dataVO;
    }
}
