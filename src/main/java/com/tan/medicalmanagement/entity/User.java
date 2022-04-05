package com.tan.medicalmanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer docid;
    private String username;
    private String name;
    private String password;
    private Integer age;
    private String sex;
    private String title;
    private String tel;
    //下划线转驼峰
    private Date registerTime;
    private Date updateTime;

    public User(String username, String name, String password,  String sex,
                String title,Integer age, String tel,Date registerTime) {
        this.username = username;
        this.name = name;
        this.password = password;
        this.age = age;
        this.sex = sex;
        this.title = title;
        this.tel = tel;
        this.registerTime = registerTime;
    }

    public User(String username, String name, String password, Integer age,
                String sex, String title, String tel) {
        this.username = username;
        this.name = name;
        this.password = password;
        this.age = age;
        this.sex = sex;
        this.title = title;
        this.tel = tel;
        this.updateTime = updateTime;
    }

    public User(String password, String tel) {
        this.password = password;
        this.tel = tel;
    }
}
