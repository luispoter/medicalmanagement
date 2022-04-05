package com.tan.medicalmanagement.dao.impl;

import com.tan.medicalmanagement.dao.AddUserRepository;
import com.tan.medicalmanagement.entity.User;
import com.tan.medicalmanagement.mapper.UserMapper;
import com.tan.medicalmanagement.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
@Repository
public class AddUserRepositoryImpl implements AddUserRepository {


    @Autowired
    private UserMapper userMapper;
    @Override
    public void addUser(String username, String name, String password,
                        String sexs, String title, String age, String tel, String registerTime) {
        Integer ages = Integer.parseInt(age);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
        Date registerTimes = null;
        try {
            registerTimes = dateFormat.parse(registerTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        User user = new User(username,name,password,sexs,title,ages,tel,registerTimes);
        UserVO userVO = new UserVO(username,name,password,sexs,title,ages,tel,registerTimes,registerTimes);
        userMapper.insert(user);
    }
}
