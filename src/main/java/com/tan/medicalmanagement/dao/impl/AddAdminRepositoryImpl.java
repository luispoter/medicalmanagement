package com.tan.medicalmanagement.dao.impl;

import com.tan.medicalmanagement.dao.AddAdminRepository;
import com.tan.medicalmanagement.entity.Admin;
import com.tan.medicalmanagement.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Repository
public class AddAdminRepositoryImpl implements AddAdminRepository {

    @Autowired
    private AdminMapper adminMapper;
    @Override
    public void addAdmin(String username, String name, String password, String age, String registerTime) {
        Integer ages = Integer.parseInt(age);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
        try {
            Date registerTimes = dateFormat.parse(registerTime);

            Admin admin = new Admin(username,name,password,ages,registerTimes,registerTimes);
            adminMapper.insert(admin);
        }catch (ParseException e){
            e.printStackTrace();
        }
    }
}
