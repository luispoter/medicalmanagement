package com.tan.medicalmanagement;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.tan.medicalmanagement.mapper")
public class MedicalmanagementApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(MedicalmanagementApplication.class, args);
    }

}
