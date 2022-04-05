package com.tan.medicalmanagement.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tan.medicalmanagement.dao.SelectPatientRepository;
import com.tan.medicalmanagement.entity.Patient;
import com.tan.medicalmanagement.mapper.PatientMapper;
import com.tan.medicalmanagement.mapper.UserMapper;
import com.tan.medicalmanagement.vo.DataVO;
import com.tan.medicalmanagement.vo.PatientVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class SelectPatientRepositoryImpl implements SelectPatientRepository {
    @Autowired
    private PatientMapper patientMapper;

    @Autowired
    private UserMapper userMapper;
    public DataVO<PatientVO> findData(Integer page, Integer limit){
        DataVO dataVO = new DataVO();

        //查询记录总数，在下面写了分页查询之后，就不在需要这个了，直接在分页查询的结果之上进行处理
//        dataVO.setCount(patientMapper.selectCount(null));
        //直接做分页处理
        IPage<Patient> patientIPage = new Page<>(page,limit);
        IPage<Patient> result = patientMapper.selectPage(patientIPage,null);

        //查询出所有病人的集合，然后遍历，把每一个病人的对象给PatientVO,只有VO才能显示医生的名字，
//        List<Patient> patientList = patientMapper.selectList(null);
        dataVO.setCode(0);
        dataVO.setMsg("");
        dataVO.setCount(result.getTotal());
        //分页查询之后，取出数据使用下面的方法
        List<Patient> patientList = result.getRecords();
        List<PatientVO> patientVOList = new ArrayList<>();
        for (Patient patient : patientList) {
            PatientVO patientVO = new PatientVO();
            //把patient的属性赋值给patientVO,数据类型匹配的就会自动复制过去，不匹配的就要手动后复制
            BeanUtils.copyProperties(patient,patientVO);
            QueryWrapper wrapper = new QueryWrapper();
            //取出patient的医生的id
            wrapper.eq("docid",patient.getUserDocid());
            //然后把医生的id传给UserMapper,去查医生的名字
            patientVO.setDocname(userMapper.selectOne(wrapper).getName());
            //查询完毕之后，把每次查询的值，放进集合中
            patientVOList.add(patientVO);
        }
        //patientVOList是类DataVO的一个属性，还要给属性赋值
        dataVO.setData(patientVOList);
        return dataVO;
    }
}
