package com.tan.medicalmanagement.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tan.medicalmanagement.entity.Patient;
import org.apache.ibatis.annotations.Select;

public interface PatientMapper extends BaseMapper<Patient> {
    //0-10
    @Select("select count(type) as '肱骨干骨折' from patient where type='肱骨干骨折' and age>=0 and age<=10;")
    public Integer findall1();
    @Select("select count(type) as '佝偻病' from patient where type='佝偻病' and age>=0 and age<=10;")
    public Integer findall2();
    @Select("select count(type) as '肋骨骨折' from patient where type='肋骨骨折' and age>=0 and age<=10;")
    public Integer findall3();
    @Select("select count(type) as '颈椎病' from patient where type='颈椎病' and age>=0 and age<=10;")
    public Integer findall4();
    @Select("select count(type) as '肩周炎' from patient where type='肩周炎' and age>=0 and age<=10;")
    public Integer findall5();
    @Select("select count(type) as '坐骨神经损伤' from patient where type='坐骨神经损伤' and age>=0 and age<=10;")
    public Integer findall6();
    @Select("select count(type) as '脊椎骨骨髓炎' from patient where type='脊椎骨骨髓炎' and age>=0 and age<=10;")
    public Integer findall7();
    @Select("select count(type) as '半月板损伤' from patient where type='半月板损伤' and age>=0 and age<=10;")
    public Integer findall8();
    @Select("select count(type) as '血源性骨髓炎' from patient where type='血源性骨髓炎' and age>=0 and age<=10;")
    public Integer findall9();

    //10-20
    @Select("select count(type) as '肱骨干骨折' from patient where type='肱骨干骨折' and age>=10 and age<=20;")
    public Integer findall01();
    @Select("select count(type) as '佝偻病' from patient where type='佝偻病' and age>=10 and age<=20;")
    public Integer findall02();
    @Select("select count(type) as '肋骨骨折' from patient where type='肋骨骨折' and age>=10 and age<=20;")
    public Integer findall03();
    @Select("select count(type) as '颈椎病' from patient where type='颈椎病' and age>=10 and age<=20;")
    public Integer findall04();
    @Select("select count(type) as '肩周炎' from patient where type='肩周炎' and age>=10 and age<=20;")
    public Integer findall05();
    @Select("select count(type) as '坐骨神经损伤' from patient where type='坐骨神经损伤' and age>=10 and age<=20;")
    public Integer findall06();
    @Select("select count(type) as '脊椎骨骨髓炎' from patient where type='脊椎骨骨髓炎' and age>=10 and age<=20;")
    public Integer findall07();
    @Select("select count(type) as '半月板损伤' from patient where type='半月板损伤' and age>=10 and age<=20;")
    public Integer findall08();
    @Select("select count(type) as '血源性骨髓炎' from patient where type='血源性骨髓炎' and age>=10 and age<=20;")
    public Integer findall09();

    //20-30
    @Select("select count(type) as '肱骨干骨折' from patient where type='肱骨干骨折' and age>=20 and age<=30;")
    public Integer findall001();
    @Select("select count(type) as '佝偻病' from patient where type='佝偻病' and age>=20 and age<=30;")
    public Integer findall002();
    @Select("select count(type) as '肋骨骨折' from patient where type='肋骨骨折' and age>=20 and age<=30;")
    public Integer findall003();
    @Select("select count(type) as '颈椎病' from patient where type='颈椎病' and age>=20 and age<=30;")
    public Integer findall004();
    @Select("select count(type) as '肩周炎' from patient where type='肩周炎' and age>=20 and age<=30;")
    public Integer findall005();
    @Select("select count(type) as '坐骨神经损伤' from patient where type='坐骨神经损伤' and age>=20 and age<=30;")
    public Integer findall006();
    @Select("select count(type) as '脊椎骨骨髓炎' from patient where type='脊椎骨骨髓炎' and age>=20 and age<=30;")
    public Integer findall007();
    @Select("select count(type) as '半月板损伤' from patient where type='半月板损伤' and age>=20 and age<=30;")
    public Integer findall008();
    @Select("select count(type) as '血源性骨髓炎' from patient where type='血源性骨髓炎' and age>=20 and age<=30;")
    public Integer findall009();

    //30-40
    @Select("select count(type) as '肱骨干骨折' from patient where type='肱骨干骨折' and age>=30 and age<=40;")
    public Integer findallQ1();
    @Select("select count(type) as '佝偻病' from patient where type='佝偻病' and age>=30 and age<=40;")
    public Integer findallQ2();
    @Select("select count(type) as '肋骨骨折' from patient where type='肋骨骨折' and age>=30 and age<=40;")
    public Integer findallQ3();
    @Select("select count(type) as '颈椎病' from patient where type='颈椎病' and age>=30 and age<=40;")
    public Integer findallQ4();
    @Select("select count(type) as '肩周炎' from patient where type='肩周炎' and age>=30 and age<=40;")
    public Integer findallQ5();
    @Select("select count(type) as '坐骨神经损伤' from patient where type='坐骨神经损伤' and age>=30 and age<=40;")
    public Integer findallQ6();
    @Select("select count(type) as '脊椎骨骨髓炎' from patient where type='脊椎骨骨髓炎' and age>=30 and age<=40;")
    public Integer findallQ7();
    @Select("select count(type) as '半月板损伤' from patient where type='半月板损伤' and age>=30 and age<=40;")
    public Integer findallQ8();
    @Select("select count(type) as '血源性骨髓炎' from patient where type='血源性骨髓炎' and age>=30 and age<=40;")
    public Integer findallQ9();

    //40-50
    @Select("select count(type) as '肱骨干骨折' from patient where type='肱骨干骨折' and age>=40 and age<=50;")
    public Integer findallQ01();
    @Select("select count(type) as '佝偻病' from patient where type='佝偻病' and age>=40 and age<=50;")
    public Integer findallQ02();
    @Select("select count(type) as '肋骨骨折' from patient where type='肋骨骨折' and age>=40 and age<=50;")
    public Integer findallQ03();
    @Select("select count(type) as '颈椎病' from patient where type='颈椎病' and age>=40 and age<=50;")
    public Integer findallQ04();
    @Select("select count(type) as '肩周炎' from patient where type='肩周炎' and age>=40 and age<=50;")
    public Integer findallQ05();
    @Select("select count(type) as '坐骨神经损伤' from patient where type='坐骨神经损伤' and age>=40 and age<=500;")
    public Integer findallQ06();
    @Select("select count(type) as '脊椎骨骨髓炎' from patient where type='脊椎骨骨髓炎' and age>=40 and age<=50;")
    public Integer findallQ07();
    @Select("select count(type) as '半月板损伤' from patient where type='半月板损伤' and age>=40 and age<=50;")
    public Integer findallQ08();
    @Select("select count(type) as '血源性骨髓炎' from patient where type='血源性骨髓炎' and age>=40 and age<=50;")
    public Integer findallQ09();

    //50-60
    @Select("select count(type) as '肱骨干骨折' from patient where type='肱骨干骨折' and age>=50 and age<=60;")
    public Integer findallQ001();
    @Select("select count(type) as '佝偻病' from patient where type='佝偻病' and age>=50 and age<=60;")
    public Integer findallQ002();
    @Select("select count(type) as '肋骨骨折' from patient where type='肋骨骨折' and age>=50 and age<=60;")
    public Integer findallQ003();
    @Select("select count(type) as '颈椎病' from patient where type='颈椎病' and age>=50 and age<=60;")
    public Integer findallQ004();
    @Select("select count(type) as '肩周炎' from patient where type='肩周炎' and age>=50 and age<=60;")
    public Integer findallQ005();
    @Select("select count(type) as '坐骨神经损伤' from patient where type='坐骨神经损伤' and age>=50 and age<=60;")
    public Integer findallQ006();
    @Select("select count(type) as '脊椎骨骨髓炎' from patient where type='脊椎骨骨髓炎' and age>=50 and age<=600;")
    public Integer findallQ007();
    @Select("select count(type) as '半月板损伤' from patient where type='半月板损伤' and age>=50 and age<=60;")
    public Integer findallQ008();
    @Select("select count(type) as '血源性骨髓炎' from patient where type='血源性骨髓炎' and age>=50 and age<=60;")
    public Integer findallQ009();

    //60-70
    @Select("select count(type) as '肱骨干骨折' from patient where type='肱骨干骨折' and age>=60 and age<=70;")
    public Integer findallW1();
    @Select("select count(type) as '佝偻病' from patient where type='佝偻病' and age>=60 and age<=70;")
    public Integer findallW2();
    @Select("select count(type) as '肋骨骨折' from patient where type='肋骨骨折' and age>=60 and age<=70;")
    public Integer findallW3();
    @Select("select count(type) as '颈椎病' from patient where type='颈椎病' and age>=60 and age<=70;")
    public Integer findallW4();
    @Select("select count(type) as '肩周炎' from patient where type='肩周炎' and age>=60 and age<=70;")
    public Integer findallW5();
    @Select("select count(type) as '坐骨神经损伤' from patient where type='坐骨神经损伤' and age>=60 and age<=70;")
    public Integer findallW6();
    @Select("select count(type) as '脊椎骨骨髓炎' from patient where type='脊椎骨骨髓炎' and age>=60 and age<=70;")
    public Integer findallW7();
    @Select("select count(type) as '半月板损伤' from patient where type='半月板损伤' and age>=60 and age<=70;")
    public Integer findallW8();
    @Select("select count(type) as '血源性骨髓炎' from patient where type='血源性骨髓炎' and age>=60 and age<=70;")
    public Integer findallW9();

    //70-80
    @Select("select count(type) as '肱骨干骨折' from patient where type='肱骨干骨折' and age>=70 and age<=80;")
    public Integer findallW01();
    @Select("select count(type) as '佝偻病' from patient where type='佝偻病' and age>=70 and age<=80;")
    public Integer findallW02();
    @Select("select count(type) as '肋骨骨折' from patient where type='肋骨骨折' and age>=70 and age<=80;")
    public Integer findallW03();
    @Select("select count(type) as '颈椎病' from patient where type='颈椎病' and age>=70 and age<=80;")
    public Integer findallW04();
    @Select("select count(type) as '肩周炎' from patient where type='肩周炎' and age>=70 and age<=80;")
    public Integer findallW05();
    @Select("select count(type) as '坐骨神经损伤' from patient where type='坐骨神经损伤' and age>=70 and age<=80;")
    public Integer findallW06();
    @Select("select count(type) as '脊椎骨骨髓炎' from patient where type='脊椎骨骨髓炎' and age>=70 and age<=80;")
    public Integer findallW07();
    @Select("select count(type) as '半月板损伤' from patient where type='半月板损伤' and age>=70 and age<=80;")
    public Integer findallW08();
    @Select("select count(type) as '血源性骨髓炎' from patient where type='血源性骨髓炎' and age>=70 and age<=80;")
    public Integer findallW09();

    //80-90
    @Select("select count(type) as '肱骨干骨折' from patient where type='肱骨干骨折' and age>=80 and age<=90;")
    public Integer findallW001();
    @Select("select count(type) as '佝偻病' from patient where type='佝偻病' and age>=80 and age<=90;")
    public Integer findallW002();
    @Select("select count(type) as '肋骨骨折' from patient where type='肋骨骨折' and age>=80 and age<=90;")
    public Integer findallW003();
    @Select("select count(type) as '颈椎病' from patient where type='颈椎病' and age>=80 and age<=90;")
    public Integer findallW004();
    @Select("select count(type) as '肩周炎' from patient where type='肩周炎' and age>=80 and age<=90;")
    public Integer findallW005();
    @Select("select count(type) as '坐骨神经损伤' from patient where type='坐骨神经损伤' and age>=80 and age<=90;")
    public Integer findallW006();
    @Select("select count(type) as '脊椎骨骨髓炎' from patient where type='脊椎骨骨髓炎' and age>=80 and age<=90;")
    public Integer findallW007();
    @Select("select count(type) as '半月板损伤' from patient where type='半月板损伤' and age>=80 and age<=90;")
    public Integer findallW008();
    @Select("select count(type) as '血源性骨髓炎' from patient where type='血源性骨髓炎' and age>=80 and age<=90;")
    public Integer findallW009();

    //90-100
    @Select("select count(type) as '肱骨干骨折' from patient where type='肱骨干骨折' and age>=90 and age<=100;")
    public Integer findallA1();
    @Select("select count(type) as '佝偻病' from patient where type='佝偻病' and age>=90 and age<=100;")
    public Integer findallA2();
    @Select("select count(type) as '肋骨骨折' from patient where type='肋骨骨折' and age>=90 and age<=100;")
    public Integer findallA3();
    @Select("select count(type) as '颈椎病' from patient where type='颈椎病' and age>=90 and age<=100;")
    public Integer findallA4();
    @Select("select count(type) as '肩周炎' from patient where type='肩周炎' and age>=90 and age<=100;")
    public Integer findallA5();
    @Select("select count(type) as '坐骨神经损伤' from patient where type='坐骨神经损伤' and age>=90 and age<=100;")
    public Integer findallA6();
    @Select("select count(type) as '脊椎骨骨髓炎' from patient where type='脊椎骨骨髓炎' and age>=90 and age<=100;")
    public Integer findallA7();
    @Select("select count(type) as '半月板损伤' from patient where type='半月板损伤' and age>=90 and age<=100;")
    public Integer findallA8();
    @Select("select count(type) as '血源性骨髓炎' from patient where type='血源性骨髓炎' and age>=90 and age<=100;")
    public Integer findallA9();

    //全年龄段
    @Select("select count(type) as '肱骨干骨折' from patient where type='肱骨干骨折'")
    public Integer findallA11();
    @Select("select count(type) as '佝偻病' from patient where type='佝偻病' ")
    public Integer findallA12();
    @Select("select count(type) as '肋骨骨折' from patient where type='肋骨骨折'")
    public Integer findallA13();
    @Select("select count(type) as '颈椎病' from patient where type='颈椎病'")
    public Integer findallA14();
    @Select("select count(type) as '肩周炎' from patient where type='肩周炎'")
    public Integer findallA15();
    @Select("select count(type) as '坐骨神经损伤' from patient where type='坐骨神经损伤' ")
    public Integer findallA16();
    @Select("select count(type) as '脊椎骨骨髓炎' from patient where type='脊椎骨骨髓炎'")
    public Integer findallA17();
    @Select("select count(type) as '半月板损伤' from patient where type='半月板损伤' ")
    public Integer findallA18();
    @Select("select count(type) as '血源性骨髓炎' from patient where type='血源性骨髓炎' ")
    public Integer findallA19();
}
