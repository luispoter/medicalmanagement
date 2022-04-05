package com.tan.medicalmanagement.dao;

import com.tan.medicalmanagement.vo.BarVO;

import java.util.List;

public interface PiePatientAgeToAgeRepository {
    List<BarVO> getBarV0();
    List<BarVO> getBarVO1();
    List<BarVO> getBarVO2();
    List<BarVO> getBarVO3();
    List<BarVO> getBarVO4();
    List<BarVO> getBarVO5();
    List<BarVO> getBarVO6();
    List<BarVO> getBarVO7();
    List<BarVO> getBarVO8();
    List<BarVO> getBarVO9();

    //全年龄段
    List<BarVO> getBarVO10();
}
