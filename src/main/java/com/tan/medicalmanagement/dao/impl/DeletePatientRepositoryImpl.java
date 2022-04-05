package com.tan.medicalmanagement.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tan.medicalmanagement.dao.DeletePatientRepository;
import com.tan.medicalmanagement.mapper.PatientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DeletePatientRepositoryImpl implements DeletePatientRepository {
    @Autowired
    PatientMapper patientMapper;

    @Override
    public void delete(Integer paid) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("paid",paid);
        patientMapper.delete(wrapper);
        }

}
