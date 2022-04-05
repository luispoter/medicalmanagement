package com.tan.medicalmanagement.dao;

import com.tan.medicalmanagement.entity.Admin;
import com.tan.medicalmanagement.vo.DataVO;

public interface SelectAdminRepository {
    DataVO<Admin> findAdmin(Integer page, Integer limit);
}
