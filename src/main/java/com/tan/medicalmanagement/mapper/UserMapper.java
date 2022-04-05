package com.tan.medicalmanagement.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tan.medicalmanagement.entity.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper extends BaseMapper<User> {
    @Select("select count(title) as '住院医师' from user where title='住院医师' and age>20 and age<=30;")
    public Integer findall1();
    @Select("select count(title) as '主治医师' from user where title='主治医师' and age>20 and age<=30;")
    public Integer findall2();
    @Select("select count(title) as '副主任医师' from user where title='副主任医师' and age>20 and age<=30;")
    public Integer findall3();
    @Select("select count(title) as '主任医师' from user where title='主任医师' and age>20 and age<=30;")
    public Integer findall4();


    @Select("select count(title) as '住院医师' from user where title='住院医师' and age>30 and age<=40;")
    public Integer findall01();
    @Select("select count(title) as '主治医师' from user where title='主治医师' and age>30 and age<=40;")
    public Integer findall02();
    @Select("select count(title) as '副主任医师' from user where title='副主任医师' and age>30 and age<=40;")
    public Integer findall03();
    @Select("select count(title) as '主任医师' from user where title='主任医师' and age>30 and age<=40;")
    public Integer findall04();


    @Select("select count(title) as '住院医师' from user where title='住院医师' and age>40 and age<=50;")
    public Integer findall001();
    @Select("select count(title) as '主治医师' from user where title='主治医师' and age>40 and age<=50;")
    public Integer findall002();
    @Select("select count(title) as '副主任医师' from user where title='副主任医师' and age>40 and age<=50;")
    public Integer findall003();
    @Select("select count(title) as '主任医师' from user where title='主任医师' and age>40 and age<=50;")
    public Integer findall004();


    @Select("select count(title) as '住院医师' from user where title='住院医师' and age>50 and age<=60;")
    public Integer findall0001();
    @Select("select count(title) as '主治医师' from user where title='主治医师' and age>50 and age<=60;")
    public Integer findall0002();
    @Select("select count(title) as '副主任医师' from user where title='副主任医师' and age>50 and age<=60;")
    public Integer findall0003();
    @Select("select count(title) as '主任医师' from user where title='主任医师' and age>50 and age<=60;")
    public Integer findall0004();
}
