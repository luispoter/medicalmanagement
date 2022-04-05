package com.tan.medicalmanagement.service.impl;

import com.tan.medicalmanagement.dao.*;
import com.tan.medicalmanagement.dao.UserAgeToTitleRepository;
import com.tan.medicalmanagement.entity.Admin;
import com.tan.medicalmanagement.entity.User;
import com.tan.medicalmanagement.service.AdminMainService;
import com.tan.medicalmanagement.vo.DataVO;
import com.tan.medicalmanagement.vo.PieVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class AdminMainServiceImpl implements AdminMainService{

    @Autowired
    private AddAdminRepository addAdminRepository;
    @Autowired
    private SelectAdminRepository selectAdminRepository;
    @Autowired
    private DeleteAdminRepository deleteAdminRepository;
    @Autowired
    private AddUserRepository addUserRepository;
    @Autowired
    private SelectUserRepository selectUserRepository;
    @Autowired
    private DeleteUserRepository deleteUserRepository;
    @Autowired
    private UserAgeToTitleRepository userAgeToTitleRepository;
    @Autowired
    private AdminSelfUpdateRepository adminSelfUpdateRepository;
    @Autowired
    private SelectEachDocListRepository selectEachDocListRepository;

    //注册管理员
    @Override
    public void addAdmin(String username, String name, String password, String age, String registerTime) {
        addAdminRepository.addAdmin(username,name,password,age,registerTime);
    }

    //查询管理员
    public DataVO<Admin> findAdmin(Integer page, Integer limit){
        return selectAdminRepository.findAdmin(page,limit);
    }

    @Override
    public void deleteAdmin(String id) {
        Integer ids = Integer.parseInt(id);
        deleteAdminRepository.deleteAdmin(ids);
    }

    //注册用户
    @Override
    public void addUser(String username, String name, String password,
                        String sex, String title, String age, String tel, String registerTime) {
        String sexs = "";
        switch (sex){
            case "0":
                sexs = "男";
                break;
            case "1":
                sexs = "女";
                break;
        }
        addUserRepository.addUser(username,name,password,sexs,title,age,tel,registerTime);
    }

    //查询用户
    @Override
    public DataVO<User> findUser(String page, String limit) {
        Integer pages = Integer.parseInt(page);
        Integer limits = Integer.parseInt(limit);
        return selectUserRepository.findUser(pages,limits);
    }

    //删除用户
    @Override
    public void deleteUser(String docid) {
        Integer ids = Integer.parseInt(docid);
        deleteUserRepository.deleteUser(ids);
    }

    //查询各职称医生的集合
    @Override
    public DataVO<User> findUser1(String page, String limit) {
        Integer pages = Integer.parseInt(page);
        Integer limits = Integer.parseInt(limit);
        return selectEachDocListRepository.findUser1(pages,limits);
    }

    @Override
    public DataVO<User> findUser2(String page, String limit) {
        Integer pages = Integer.parseInt(page);
        Integer limits = Integer.parseInt(limit);
        return selectEachDocListRepository.findUser2(pages,limits);
    }

    @Override
    public DataVO<User> findUser3(String page, String limit) {
        Integer pages = Integer.parseInt(page);
        Integer limits = Integer.parseInt(limit);
        return selectEachDocListRepository.findUser3(pages,limits);
    }

    @Override
    public DataVO<User> findUser4(String page, String limit) {
        Integer pages = Integer.parseInt(page);
        Integer limits = Integer.parseInt(limit);
        return selectEachDocListRepository.findUser4(pages,limits);
    }

    //医生年龄与职称情况饼状图
    @Override
    public List<PieVO> getPieVO() {
        return userAgeToTitleRepository.getPieVO();
    }

    @Override
    public List<PieVO> getPieVO1() {
        return userAgeToTitleRepository.getPieVO1();
    }

    @Override
    public List<PieVO> getPieVO2() {
        return userAgeToTitleRepository.getPieVO2();
    }

    @Override
    public List<PieVO> getPieVO3() {
        return userAgeToTitleRepository.getPieVO3();
    }

    //个人设置
    @Override
    public void rootSelfUpdate(Integer id,String name,String password) {
        adminSelfUpdateRepository.rootSelfUpdate(id,name,password);
    }
}
