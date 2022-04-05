package com.tan.medicalmanagement.service.impl;

import com.tan.medicalmanagement.dao.*;
import com.tan.medicalmanagement.service.UserMainService;
import com.tan.medicalmanagement.vo.BarVO;
import com.tan.medicalmanagement.vo.DataVO;
import com.tan.medicalmanagement.vo.PatientVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Service
public class UserMainServiceImpl implements UserMainService {
    @Autowired
    private AddPatientRepository addPatientRepository;
    @Autowired
    private SelectPatientRepository selectPatientRepository;
    @Autowired
    private DeletePatientRepository deletePatientRepository;
    @Autowired
    private PiePatientAgeToAgeRepository piePatientAgeToAgeRepository;
    @Autowired
    private UserSelfUpdateRepository userSelfUpdateRepository;

    //添加病历
    @Override
    public void addPatient(String username, String sex, String age, String tel, String home, String doc,
                           String treatTime, String postalCode, String maritalStatus, String diseaseSituation, MultipartFile ct, String result, String type)  {
        String filePath = "E:\\毕业设计论文\\medicalmanagement\\src\\main\\resources\\static\\images";
//        String filePath = "/tmp/tomcat.8080.14195126684794607082/work/Tomcat/localhost/ROOT/medicalmanagement/src/main/resources/static/images/";
        String originalFilename = ct.getOriginalFilename();   //获取原始图片的扩展名
        String newFileName = UUID.randomUUID() + originalFilename;  //新文件的名字
        File targetFile = new File(filePath, newFileName);         //封装上传文件位置的全路径
        try {
            ct.transferTo(targetFile);     //把本地文件上传到封装上传文件位置的全路径
            addPatientRepository.addPatient(username,sex,age,tel,home,doc,treatTime,postalCode,maritalStatus,diseaseSituation,newFileName,result,type);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //查询病历
    @Override
    public DataVO<PatientVO> findData(Integer page, Integer limit) {

        return selectPatientRepository.findData(page,limit);
    }

    //删除病历
    @Override
    public void delete(Integer paid) {
        deletePatientRepository.delete(paid);
    }

    //病人年龄疾病饼状图
    @Override
    public List<BarVO> getBarVO() {
        return piePatientAgeToAgeRepository.getBarV0();
    }

    @Override
    public List<BarVO> getBarVO1() {
        return piePatientAgeToAgeRepository.getBarVO1();
    }

    @Override
    public List<BarVO> getBarVO2() {
        return piePatientAgeToAgeRepository.getBarVO2();
    }

    @Override
    public List<BarVO> getBarVO3() {
        return piePatientAgeToAgeRepository.getBarVO3();
    }

    @Override
    public List<BarVO> getBarVO4() {
        return piePatientAgeToAgeRepository.getBarVO4();
    }

    @Override
    public List<BarVO> getBarVO5() {
        return piePatientAgeToAgeRepository.getBarVO5();
    }

    @Override
    public List<BarVO> getBarVO6() {
        return piePatientAgeToAgeRepository.getBarVO6();
    }

    @Override
    public List<BarVO> getBarVO7() {
        return piePatientAgeToAgeRepository.getBarVO7();
    }

    @Override
    public List<BarVO> getBarVO8() {
        return piePatientAgeToAgeRepository.getBarVO8();
    }

    @Override
    public List<BarVO> getBarVO9() {
        return piePatientAgeToAgeRepository.getBarVO9();
    }

    //全年龄段各疾病统计
    @Override
    public List<BarVO> getBarVO10() {
        return piePatientAgeToAgeRepository.getBarVO10();
    }

    //用户设置
    @Override
    public void userSelfUpdate(Integer docid, String password, String tel) {
        userSelfUpdateRepository.userSelfUpdate(docid,password,tel);
    }


}
