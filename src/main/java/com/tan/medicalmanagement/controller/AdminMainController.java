package com.tan.medicalmanagement.controller;

import com.tan.medicalmanagement.entity.Admin;
import com.tan.medicalmanagement.service.AdminMainService;
import com.tan.medicalmanagement.vo.DataVO;
import com.tan.medicalmanagement.vo.PieVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
public class AdminMainController {
    @Autowired
    private AdminMainService adminMainService;

    //注册管理员
    @PostMapping("/saveadmin")
    public void addAdmin(String username, String name, String password,
                  String age,String registerTime,HttpServletResponse response){
        adminMainService.addAdmin(username,name,password,age,registerTime);
        try {
            response.sendRedirect("/addroot");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //查询管理员
    @RequestMapping("/findroot")
    @ResponseBody
    public DataVO list(Integer page, Integer limit) {
        return adminMainService.findAdmin(page,limit);
    }

    //删除管理员
    @PostMapping("/deleteroot")
    public void deleteAdmin(String adid, HttpServletResponse resp){
        adminMainService.deleteAdmin(adid);
        if (adid != null){
            try {
                resp.getWriter().write("200");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //注册用户
    @PostMapping("/saveuser")
    public void addUser(String username, String name, String password,
                     String sex, String title, String age, String tel,
                     String registerTime, HttpServletResponse resp)  {
        resp.setCharacterEncoding("UTF-8");   //问题
        adminMainService.addUser(username,name,password,sex,title,age,tel,registerTime);
        try {
            resp.sendRedirect("/addUser");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //查询用户
    @RequestMapping("/find")
    @ResponseBody
    //有rest返回jsonshuju分页
    public DataVO list(String page,String limit){
        return adminMainService.findUser(page,limit);
    }

    //删除用户
    @PostMapping("/deleteuser")
    public void deleteUser(String docid, HttpServletResponse resp){
        adminMainService.deleteUser(docid);
        if (docid != null){
            try {
                resp.getWriter().write("200");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //查询各职称医生集合
    @RequestMapping("/zhurenyishi")
    @ResponseBody
    public DataVO list1(String page,String limit){
        return adminMainService.findUser1(page,limit);
    }

    @RequestMapping("/fuzhurenyishi")
    @ResponseBody
    public DataVO list2(String page,String limit){
        return adminMainService.findUser2(page,limit);
    }

    @RequestMapping("/zhuzhiyishi")
    @ResponseBody
    public DataVO list3(String page,String limit){
        return adminMainService.findUser3(page,limit);
    }

    @RequestMapping("/zhuyuanyishi")
    @ResponseBody
    public DataVO list4(String page,String limit){
        return adminMainService.findUser4(page,limit);
    }


    //医生年龄与职称情况饼状图
    @RequestMapping("/pieVO")
    @ResponseBody
    public List<PieVO> getPieVO() {
        return adminMainService.getPieVO();
    }

    @RequestMapping("/pieVO1")
    @ResponseBody
    public List<PieVO> getPieVO1() {
        return adminMainService.getPieVO1();
    }

    @RequestMapping("/pieVO2")
    @ResponseBody
    public List<PieVO> getPieVO2() {
        return adminMainService.getPieVO2();
    }

    @RequestMapping("/pieVO3")
    @ResponseBody
    public List<PieVO> getPieVO3() {
        return adminMainService.getPieVO3();
    }

    //个人设置
    @PostMapping("/rootupdateself")
    public void rootUpdateSelf(String name, String password, HttpServletResponse resp, HttpSession session){
        Object admin = session.getAttribute("admin");
        Admin admin1 = (Admin)admin;
        Integer adid = admin1.getAdid();
        adminMainService.rootSelfUpdate(adid,name,password);
        try {
            resp.sendRedirect("/rootupdateself");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
