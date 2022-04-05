package com.tan.medicalmanagement.dao;

import javax.servlet.http.HttpServletResponse;

public interface AdminSelfUpdateRepository {
    void rootSelfUpdate(Integer id,String name,String password);
}
