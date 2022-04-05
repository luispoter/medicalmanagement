package com.tan.medicalmanagement.dao;

import com.tan.medicalmanagement.entity.User;
import com.tan.medicalmanagement.vo.DataVO;

public interface SelectUserRepository {
    DataVO<User> findUser(Integer page, Integer limit);
}
