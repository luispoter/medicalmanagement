package com.tan.medicalmanagement.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientVO {
    private Integer paid;
    private String name;
    private Integer age;
    private String sex;
    private String maritalStatus;
    private String tel;
    private String home;
    private Integer postalCode;
    private String docname;
    private Date treatmentTime;
    private String diseaseSituation;
    private String ct;
    private String results;
    private String type;
    private Date updateTime;

    public PatientVO(String name, Integer age, String sex, String maritalStatus,
                     String tel, String home, Integer postalCode, String docname,
                     Date treatmentTime, String diseaseSituation, String results,
                     String type, Date updateTime) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.maritalStatus = maritalStatus;
        this.tel = tel;
        this.home = home;
        this.postalCode = postalCode;
        this.docname = docname;
        this.treatmentTime = treatmentTime;
        this.diseaseSituation = diseaseSituation;

        this.results = results;
        this.type = type;
        this.updateTime = updateTime;
    }
}
