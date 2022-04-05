package com.tan.medicalmanagement.service;

import com.tan.medicalmanagement.vo.BarVO;
import com.tan.medicalmanagement.vo.DataVO;
import com.tan.medicalmanagement.vo.PatientVO;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface UserMainService {
    //添加病历
    void addPatient(String username, String sex, String age, String tel,
                    String home, String doc, String treatTime, String postalCode,
                    String maritalStatus, String diseaseSituation, MultipartFile ct, String result, String type);

    //查询病历
    DataVO<PatientVO> findData(Integer page, Integer limit);

    //删除病历
    void delete(Integer paid);

    //病人年龄疾病饼状图
    List<BarVO> getBarVO();
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


    //用户设置
    void userSelfUpdate(Integer docid,String password,String tel);
}
