package com.tan.medicalmanagement.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tan.medicalmanagement.dao.AddPatientRepository;
import com.tan.medicalmanagement.entity.Patient;
import com.tan.medicalmanagement.mapper.PatientMapper;
import com.tan.medicalmanagement.mapper.UserMapper;
import com.tan.medicalmanagement.vo.PatientVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
@Repository
public class AddPatientRepositoryImpl implements AddPatientRepository {

    @Autowired
    private PatientMapper patientMapper;
    @Autowired
    private UserMapper userMapper;
    @Override
    public void addPatient(String username, String sex, String age, String tel,
                           String home, String doc, String treatTime, String postalCode,
                           String maritalStatus, String diseaseSituation, String newFileName, String result, String type) {
        Patient patient = null;
        PatientVO patientVO = null;
        Integer id = 0;
        Integer ages = Integer.parseInt(age);
        Integer postalCodes = Integer.parseInt(postalCode);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sexs = null;
        switch (sex){
            case "0":
                sexs = "男";
                break;
            case "1":
                sexs = "女";
                break;
        }
        String maritalStatuss = null;
        switch (maritalStatus){
            case "0":
                maritalStatuss = "未婚";
                break;
            case "1":
                maritalStatuss = "已婚";
                break;
            case "2":
                maritalStatuss = "离异";
                break;
        }
        String types = null;
        switch (type){
            case "0":
                types = "骨折";
                break;
            case "1":
                types = "佝偻病";
                break;
            case "2":
                types = "肋骨骨折";
                break;
            case "3":
                types = "颈椎病";
                break;
            case "4":
                types = "肩周炎";
                break;
            case "5":
                types = "坐骨神经损伤";
                break;
            case "6":
                types = "脊椎骨骨髓炎";
                break;
            case "7":
                types = "半月板损伤";
                break;
        }

        try {
//            //获取图片的字节数组输入流
//            InputStream ins = ct.getInputStream();
//            byte[] buffer = new byte[104857600];
//            int len = 0;
//            ByteArrayOutputStream bos = new ByteArrayOutputStream();
//            while ((len = ins.read(buffer))!=-1){
//                bos.write(buffer,0,len);
//            }
//            bos.flush();
//            byte data[] = bos.toByteArray();

            Date treatTimes = dateFormat.parse(treatTime);
            patient = new Patient(username,ages,sex,maritalStatus,tel,home,postalCodes,id,treatTimes,
                    diseaseSituation,newFileName,result,type,treatTimes);
            patientVO = new PatientVO(username,ages,sexs,maritalStatuss,tel,home,postalCodes,doc,treatTimes,
                    diseaseSituation,result,types,treatTimes);
            QueryWrapper wrapper = new QueryWrapper();
            wrapper.eq("name",doc);
            BeanUtils.copyProperties(patientVO,patient);
            patient.setUserDocid(userMapper.selectOne(wrapper).getDocid());
            patient.setCt(newFileName);
            patientMapper.insert(patient);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
