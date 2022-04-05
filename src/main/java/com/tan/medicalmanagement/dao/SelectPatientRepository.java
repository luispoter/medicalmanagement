package com.tan.medicalmanagement.dao;

import com.tan.medicalmanagement.vo.DataVO;
import com.tan.medicalmanagement.vo.PatientVO;

public interface SelectPatientRepository {
    DataVO<PatientVO> findData(Integer page, Integer limit);
}
