package com.tan.medicalmanagement.dao;

public interface AddAdminRepository {
     void addAdmin(String username, String name, String password,
                     String age,String registerTime);
}
