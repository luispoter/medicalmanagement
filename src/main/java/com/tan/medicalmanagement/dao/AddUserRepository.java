package com.tan.medicalmanagement.dao;

public interface AddUserRepository {
    void addUser(String username, String name, String password,
                 String sexs, String title, String age, String tel, String registerTime);
}
