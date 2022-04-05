package com.tan.medicalmanagement.controller;

import com.tan.medicalmanagement.entity.User;
import com.tan.medicalmanagement.service.UserMainService;
import com.tan.medicalmanagement.vo.BarVO;
import com.tan.medicalmanagement.vo.DataVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
//import java.net.http.HttpResponse;
import java.util.List;

@Controller
public class UserMainController {

    @Autowired
    private UserMainService userMainService;

    //添加病历
    @PostMapping("/save")
    public void addPatient(String username, String sex, String age, String tel,
                           String home, String doc, String treatTime, String postalCode,
                           String maritalStatus, String diseaseSituation, MultipartFile ct, String result,
                           String type, HttpServletResponse response){
        userMainService.addPatient(username,sex,age,tel,home,doc,treatTime,postalCode,maritalStatus,diseaseSituation,ct,result,type);
        try {
            response.sendRedirect("/addpatient");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //查询病历
    @RequestMapping("/list")
    @ResponseBody
    public DataVO list(Integer page, Integer limit){

        return userMainService.findData(page,limit);
    }

    //删除病历
    @PostMapping("/delete")
    public void delete(String paid, HttpServletResponse resp){
        Integer ids = Integer.parseInt(paid);
        userMainService.delete(ids);
        int i=0;
        if (ids != null){
            try {
                resp.getWriter().write("200");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    //全年龄段各疾病发病情况统计
    @RequestMapping("/allage")
    @ResponseBody
    public List<BarVO> getBarVO10() {
        return userMainService.getBarVO10();
    }

    //病人年龄疾病饼状图
    @RequestMapping("/bar0")
    @ResponseBody
    public List<BarVO> getBarVO() {
        return userMainService.getBarVO();
    }

    @RequestMapping("/bar1")
    @ResponseBody
    public List<BarVO> getBarVO1() {
        return userMainService.getBarVO1();
    }

    @RequestMapping("/bar2")
    @ResponseBody
    public List<BarVO> getBarVO2() {
        return userMainService.getBarVO2();
    }

    @RequestMapping("/bar3")
    @ResponseBody
    public List<BarVO> getBarVO3() {
        return userMainService.getBarVO3();
    }

    @RequestMapping("/bar4")
    @ResponseBody
    public List<BarVO> getBarVO4() {
        return userMainService.getBarVO4();
    }

    @RequestMapping("/bar5")
    @ResponseBody
    public List<BarVO> getBarVO5() {
        return userMainService.getBarVO5();
    }

    @RequestMapping("/bar6")
    @ResponseBody
    public List<BarVO> getBarVO6() {
        return userMainService.getBarVO6();
    }

    @RequestMapping("/bar7")
    @ResponseBody
    public List<BarVO> getBarVO7() {
        return userMainService.getBarVO7();
    }

    @RequestMapping("/bar8")
    @ResponseBody
    public List<BarVO> getBarVO8() {
        return userMainService.getBarVO8();
    }

    @RequestMapping("/bar9")
    @ResponseBody
    public List<BarVO> getBarVO9() {
        return userMainService.getBarVO9();
    }

    //用户设置
    @PostMapping("/userupdateself")
    public void UserUpdateSelf(String password, String tel, HttpServletResponse resp, HttpSession session) {
        Object obj = session.getAttribute("user");
        User user = (User)obj;
        Integer docid = user.getDocid();
        userMainService.userSelfUpdate(docid,password,tel);
        try {
            resp.sendRedirect("/userupdateself");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
