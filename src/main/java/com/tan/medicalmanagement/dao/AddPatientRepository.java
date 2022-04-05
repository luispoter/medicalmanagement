package com.tan.medicalmanagement.dao;


import org.springframework.web.multipart.MultipartFile;

public interface AddPatientRepository {
    public void addPatient(String username, String sex, String age, String tel,
                           String home, String doc, String treatTime, String postalCode,
                           String maritalStatus, String diseaseSituation, String newFileName, String result, String type);
}
