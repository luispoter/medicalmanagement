package com.tan.medicalmanagement.service;

import com.tan.medicalmanagement.entity.Admin;
import com.tan.medicalmanagement.entity.User;
import com.tan.medicalmanagement.vo.DataVO;
import com.tan.medicalmanagement.vo.PieVO;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface AdminMainService {
    //注册管理员
    void addAdmin(String username, String name, String password,
                  String age,String registerTime);

    //查询管理员
    DataVO<Admin> findAdmin(Integer page, Integer limit);

    //删除管理员
    void deleteAdmin(String id);

    //注册用户
    void addUser(String username, String name, String password,
                 String sex, String title, String age, String tel, String registerTime);
    //查询用户
    DataVO<User> findUser(String page, String limit);


    //删除用户
    void deleteUser(String docid);

    //查询各职称医生集合
    DataVO<User> findUser1(String page, String limit);
    DataVO<User> findUser2(String page, String limit);
    DataVO<User> findUser3(String page, String limit);
    DataVO<User> findUser4(String page, String limit);

    //医生年龄与职称情况饼状图
    List<PieVO> getPieVO();
    List<PieVO> getPieVO1();
    List<PieVO> getPieVO2();
    List<PieVO> getPieVO3();

    //个人设置
    void rootSelfUpdate(Integer id,String name,String password);
}
