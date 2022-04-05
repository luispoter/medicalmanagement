package com.tan.medicalmanagement.dao;

import com.tan.medicalmanagement.entity.User;
import com.tan.medicalmanagement.vo.DataVO;

public interface SelectEachDocListRepository {
    DataVO<User> findUser1(Integer page, Integer limit);
    DataVO<User> findUser2(Integer page, Integer limit);
    DataVO<User> findUser3(Integer page, Integer limit);
    DataVO<User> findUser4(Integer page, Integer limit);
}
