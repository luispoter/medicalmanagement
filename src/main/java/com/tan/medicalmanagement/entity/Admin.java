package com.tan.medicalmanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
    private Integer adid;
    private String username;
    private String name;
    private String password;
    private Integer age;
    private Date registerTime;
    private Date updateTime;

    public Admin(String username, String name, String password, Integer age, Date registerTime, Date updateTime) {
        this.username = username;
        this.name = name;
        this.password = password;
        this.age = age;
        this.registerTime = registerTime;
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", registerTime=" + registerTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public Admin(Integer adid, String name, String password) {
        this.adid = adid;
        this.name = name;
        this.password = password;
    }
}
