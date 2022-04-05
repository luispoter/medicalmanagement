package com.tan.medicalmanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    private Integer paid;
    private String name;
    private Integer age;
    private String sex;
    private String maritalStatus;
    private String tel;
    private String home;
    private Integer postalCode;
    private Integer userDocid;
    private Date treatmentTime;
    private String diseaseSituation;
    private String ct;
    private String results;
    private String type;
    private Date updateTime;

    public Patient(String name, Integer age, String sex, String maritalStatus,
                   String tel, String home, Integer postalCode, Integer userDocid,
                   Date treatmentTime, String diseaseSituation,String ct, String results, String type,Date updateTime) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.maritalStatus = maritalStatus;
        this.tel = tel;
        this.home = home;
        this.postalCode = postalCode;
        this.userDocid = userDocid;
        this.treatmentTime = treatmentTime;
        this.diseaseSituation = diseaseSituation;
        this.ct = ct;
        this.results = results;
        this.type = type;
        this.updateTime = updateTime;
    }
}
