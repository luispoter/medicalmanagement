package com.tan.medicalmanagement.dao.impl;

import com.tan.medicalmanagement.dao.UserAgeToTitleRepository;
import com.tan.medicalmanagement.mapper.UserMapper;
import com.tan.medicalmanagement.vo.PieVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class UserAgeToTitleRepositoryImpl implements UserAgeToTitleRepository {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<PieVO> getPieVO() {
        Integer titleAgeVO = userMapper.findall1();
        Integer titleAgeVO1 = userMapper.findall2();
        Integer titleAgeVO2 = userMapper.findall3();
        Integer titleAgeVO3 = userMapper.findall4();

        List<PieVO> pieVolist  = new ArrayList();
        pieVolist.add(new PieVO(titleAgeVO,"住院医师"));
        pieVolist.add(new PieVO(titleAgeVO1,"主治医师"));
        pieVolist.add(new PieVO(titleAgeVO2,"副主任医师"));
        pieVolist.add(new PieVO(titleAgeVO3,"主任医师"));

        return pieVolist;
    }

    @Override
    public List<PieVO> getPieVO1() {
        Integer titleAgeVO = userMapper.findall01();
        Integer titleAgeVO1 = userMapper.findall02();
        Integer titleAgeVO2 = userMapper.findall03();
        Integer titleAgeVO3 = userMapper.findall04();

        List<PieVO> pieVolist1  = new ArrayList();
        pieVolist1.add(new PieVO(titleAgeVO,"住院医师"));
        pieVolist1.add(new PieVO(titleAgeVO1,"主治医师"));
        pieVolist1.add(new PieVO(titleAgeVO2,"副主任医师"));
        pieVolist1.add(new PieVO(titleAgeVO3,"主任医师"));

        return pieVolist1;
    }

    @Override
    public List<PieVO> getPieVO2() {
        Integer titleAgeVO = userMapper.findall001();
        Integer titleAgeVO1 = userMapper.findall002();
        Integer titleAgeVO2 = userMapper.findall003();
        Integer titleAgeVO3 = userMapper.findall004();

        List<PieVO> pieVolist2  = new ArrayList();
        pieVolist2.add(new PieVO(titleAgeVO,"住院医师"));
        pieVolist2.add(new PieVO(titleAgeVO1,"主治医师"));
        pieVolist2.add(new PieVO(titleAgeVO2,"副主任医师"));
        pieVolist2.add(new PieVO(titleAgeVO3,"主任医师"));

        return pieVolist2;
    }

    @Override
    public List<PieVO> getPieVO3() {
        Integer titleAgeVO = userMapper.findall0001();
        Integer titleAgeVO1 = userMapper.findall0002();
        Integer titleAgeVO2 = userMapper.findall0003();
        Integer titleAgeVO3 = userMapper.findall0004();

        List<PieVO> pieVolist3  = new ArrayList();
        pieVolist3.add(new PieVO(titleAgeVO,"住院医师"));
        pieVolist3.add(new PieVO(titleAgeVO1,"主治医师"));
        pieVolist3.add(new PieVO(titleAgeVO2,"副主任医师"));
        pieVolist3.add(new PieVO(titleAgeVO3,"主任医师"));

        return pieVolist3;
    }
}
