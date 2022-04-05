package com.tan.medicalmanagement.dao.impl;

import com.tan.medicalmanagement.dao.PiePatientAgeToAgeRepository;
import com.tan.medicalmanagement.mapper.PatientMapper;
import com.tan.medicalmanagement.vo.BarVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PiePatientAgeToAgeRepositoryImpl implements PiePatientAgeToAgeRepository {
    @Autowired
    private PatientMapper patientMapper;

    @Override
    public List<BarVO> getBarV0() {
        Integer type1 = patientMapper.findall1();
        Integer type2 = patientMapper.findall2();
        Integer type3 = patientMapper.findall3();
        Integer type4 = patientMapper.findall4();
        Integer type5 = patientMapper.findall5();
        Integer type6 = patientMapper.findall6();
        Integer type7 = patientMapper.findall7();
        Integer type8 = patientMapper.findall8();
        Integer type9 = patientMapper.findall9();

        List<BarVO> barVOList1 = new ArrayList<>();
        barVOList1.add(new BarVO(type1,"肱骨干骨折"));
        barVOList1.add(new BarVO(type2,"佝偻病"));
        barVOList1.add(new BarVO(type3,"肋骨骨折"));
        barVOList1.add(new BarVO(type4,"颈椎病"));
        barVOList1.add(new BarVO(type5,"肩周炎"));
        barVOList1.add(new BarVO(type6,"坐骨神经损伤"));
        barVOList1.add(new BarVO(type7,"脊椎骨骨髓炎"));
        barVOList1.add(new BarVO(type8,"半月板损伤"));
        barVOList1.add(new BarVO(type9,"血源性骨髓炎"));

        return barVOList1;
    }

    @Override
    public List<BarVO> getBarVO1() {
        Integer type1 = patientMapper.findall01();
        Integer type2 = patientMapper.findall02();
        Integer type3 = patientMapper.findall03();
        Integer type4 = patientMapper.findall04();
        Integer type5 = patientMapper.findall05();
        Integer type6 = patientMapper.findall06();
        Integer type7 = patientMapper.findall07();
        Integer type8 = patientMapper.findall08();
        Integer type9 = patientMapper.findall09();

        List<BarVO> barVOList2 = new ArrayList<>();
        barVOList2.add(new BarVO(type1,"肱骨干骨折"));
        barVOList2.add(new BarVO(type2,"佝偻病"));
        barVOList2.add(new BarVO(type3,"肋骨骨折"));
        barVOList2.add(new BarVO(type4,"颈椎病"));
        barVOList2.add(new BarVO(type5,"肩周炎"));
        barVOList2.add(new BarVO(type6,"坐骨神经损伤"));
        barVOList2.add(new BarVO(type7,"脊椎骨骨髓炎"));
        barVOList2.add(new BarVO(type8,"半月板损伤"));
        barVOList2.add(new BarVO(type9,"血源性骨髓炎"));

        return barVOList2;
    }

    @Override
    public List<BarVO> getBarVO2() {
        Integer type1 = patientMapper.findall001();
        Integer type2 = patientMapper.findall002();
        Integer type3 = patientMapper.findall003();
        Integer type4 = patientMapper.findall004();
        Integer type5 = patientMapper.findall005();
        Integer type6 = patientMapper.findall006();
        Integer type7 = patientMapper.findall007();
        Integer type8 = patientMapper.findall008();
        Integer type9 = patientMapper.findall009();

        List<BarVO> barVOList3 = new ArrayList<>();
        barVOList3.add(new BarVO(type1,"肱骨干骨折"));
        barVOList3.add(new BarVO(type2,"佝偻病"));
        barVOList3.add(new BarVO(type3,"肋骨骨折"));
        barVOList3.add(new BarVO(type4,"颈椎病"));
        barVOList3.add(new BarVO(type5,"肩周炎"));
        barVOList3.add(new BarVO(type6,"坐骨神经损伤"));
        barVOList3.add(new BarVO(type7,"脊椎骨骨髓炎"));
        barVOList3.add(new BarVO(type8,"半月板损伤"));
        barVOList3.add(new BarVO(type9,"血源性骨髓炎"));

        return barVOList3;

    }

    @Override
    public List<BarVO> getBarVO3() {
        Integer type1 = patientMapper.findallQ1();
        Integer type2 = patientMapper.findallQ2();
        Integer type3 = patientMapper.findallQ3();
        Integer type4 = patientMapper.findallQ4();
        Integer type5 = patientMapper.findallQ5();
        Integer type6 = patientMapper.findallQ6();
        Integer type7 = patientMapper.findallQ7();
        Integer type8 = patientMapper.findallQ8();
        Integer type9 = patientMapper.findallQ9();

        List<BarVO> barVOList4 = new ArrayList<>();
        barVOList4.add(new BarVO(type1,"肱骨干骨折"));
        barVOList4.add(new BarVO(type2,"佝偻病"));
        barVOList4.add(new BarVO(type3,"肋骨骨折"));
        barVOList4.add(new BarVO(type4,"颈椎病"));
        barVOList4.add(new BarVO(type5,"肩周炎"));
        barVOList4.add(new BarVO(type6,"坐骨神经损伤"));
        barVOList4.add(new BarVO(type7,"脊椎骨骨髓炎"));
        barVOList4.add(new BarVO(type8,"半月板损伤"));
        barVOList4.add(new BarVO(type9,"血源性骨髓炎"));

        return barVOList4;

    }

    @Override
    public List<BarVO> getBarVO4() {
        Integer type1 = patientMapper.findallQ01();
        Integer type2 = patientMapper.findallQ02();
        Integer type3 = patientMapper.findallQ03();
        Integer type4 = patientMapper.findallQ04();
        Integer type5 = patientMapper.findallQ05();
        Integer type6 = patientMapper.findallQ06();
        Integer type7 = patientMapper.findallQ07();
        Integer type8 = patientMapper.findallQ08();
        Integer type9 = patientMapper.findallQ09();

        List<BarVO> barVOList5 = new ArrayList<>();
        barVOList5.add(new BarVO(type1,"肱骨干骨折"));
        barVOList5.add(new BarVO(type2,"佝偻病"));
        barVOList5.add(new BarVO(type3,"肋骨骨折"));
        barVOList5.add(new BarVO(type4,"颈椎病"));
        barVOList5.add(new BarVO(type5,"肩周炎"));
        barVOList5.add(new BarVO(type6,"坐骨神经损伤"));
        barVOList5.add(new BarVO(type7,"脊椎骨骨髓炎"));
        barVOList5.add(new BarVO(type8,"半月板损伤"));
        barVOList5.add(new BarVO(type9,"血源性骨髓炎"));

        return barVOList5;
    }

    @Override
    public List<BarVO> getBarVO5() {
        Integer type1 = patientMapper.findallQ001();
        Integer type2 = patientMapper.findallQ002();
        Integer type3 = patientMapper.findallQ003();
        Integer type4 = patientMapper.findallQ004();
        Integer type5 = patientMapper.findallQ005();
        Integer type6 = patientMapper.findallQ006();
        Integer type7 = patientMapper.findallQ007();
        Integer type8 = patientMapper.findallQ008();
        Integer type9 = patientMapper.findallQ009();

        List<BarVO> barVOList6 = new ArrayList<>();
        barVOList6.add(new BarVO(type1,"肱骨干骨折"));
        barVOList6.add(new BarVO(type2,"佝偻病"));
        barVOList6.add(new BarVO(type3,"肋骨骨折"));
        barVOList6.add(new BarVO(type4,"颈椎病"));
        barVOList6.add(new BarVO(type5,"肩周炎"));
        barVOList6.add(new BarVO(type6,"坐骨神经损伤"));
        barVOList6.add(new BarVO(type7,"脊椎骨骨髓炎"));
        barVOList6.add(new BarVO(type8,"半月板损伤"));
        barVOList6.add(new BarVO(type9,"血源性骨髓炎"));

        return barVOList6;

    }

    @Override
    public List<BarVO> getBarVO6() {
        Integer type1 = patientMapper.findallW1();
        Integer type2 = patientMapper.findallW2();
        Integer type3 = patientMapper.findallW3();
        Integer type4 = patientMapper.findallW4();
        Integer type5 = patientMapper.findallW5();
        Integer type6 = patientMapper.findallW6();
        Integer type7 = patientMapper.findallW7();
        Integer type8 = patientMapper.findallW8();
        Integer type9 = patientMapper.findallW9();

        List<BarVO> barVOList7 = new ArrayList<>();
        barVOList7.add(new BarVO(type1,"肱骨干骨折"));
        barVOList7.add(new BarVO(type2,"佝偻病"));
        barVOList7.add(new BarVO(type3,"肋骨骨折"));
        barVOList7.add(new BarVO(type4,"颈椎病"));
        barVOList7.add(new BarVO(type5,"肩周炎"));
        barVOList7.add(new BarVO(type6,"坐骨神经损伤"));
        barVOList7.add(new BarVO(type7,"脊椎骨骨髓炎"));
        barVOList7.add(new BarVO(type8,"半月板损伤"));
        barVOList7.add(new BarVO(type9,"血源性骨髓炎"));

        return barVOList7;

    }

    @Override
    public List<BarVO> getBarVO7() {
        Integer type1 = patientMapper.findallW01();
        Integer type2 = patientMapper.findallW02();
        Integer type3 = patientMapper.findallW03();
        Integer type4 = patientMapper.findallW04();
        Integer type5 = patientMapper.findallW05();
        Integer type6 = patientMapper.findallW06();
        Integer type7 = patientMapper.findallW07();
        Integer type8 = patientMapper.findallW08();
        Integer type9 = patientMapper.findallW09();

        List<BarVO> barVOList8 = new ArrayList<>();
        barVOList8.add(new BarVO(type1,"肱骨干骨折"));
        barVOList8.add(new BarVO(type2,"佝偻病"));
        barVOList8.add(new BarVO(type3,"肋骨骨折"));
        barVOList8.add(new BarVO(type4,"颈椎病"));
        barVOList8.add(new BarVO(type5,"肩周炎"));
        barVOList8.add(new BarVO(type6,"坐骨神经损伤"));
        barVOList8.add(new BarVO(type7,"脊椎骨骨髓炎"));
        barVOList8.add(new BarVO(type8,"半月板损伤"));
        barVOList8.add(new BarVO(type9,"血源性骨髓炎"));

        return barVOList8;
    }

    @Override
    public List<BarVO> getBarVO8() {
        Integer type1 = patientMapper.findallW001();
        Integer type2 = patientMapper.findallW002();
        Integer type3 = patientMapper.findallW003();
        Integer type4 = patientMapper.findallW004();
        Integer type5 = patientMapper.findallW005();
        Integer type6 = patientMapper.findallW006();
        Integer type7 = patientMapper.findallW007();
        Integer type8 = patientMapper.findallW008();
        Integer type9 = patientMapper.findallW009();

        List<BarVO> barVOList9 = new ArrayList<>();
        barVOList9.add(new BarVO(type1,"肱骨干骨折"));
        barVOList9.add(new BarVO(type2,"佝偻病"));
        barVOList9.add(new BarVO(type3,"肋骨骨折"));
        barVOList9.add(new BarVO(type4,"颈椎病"));
        barVOList9.add(new BarVO(type5,"肩周炎"));
        barVOList9.add(new BarVO(type6,"坐骨神经损伤"));
        barVOList9.add(new BarVO(type7,"脊椎骨骨髓炎"));
        barVOList9.add(new BarVO(type8,"半月板损伤"));
        barVOList9.add(new BarVO(type9,"血源性骨髓炎"));

        return barVOList9;

    }

    @Override
    public List<BarVO> getBarVO9() {
        Integer type1 = patientMapper.findallA1();
        Integer type2 = patientMapper.findallA2();
        Integer type3 = patientMapper.findallA3();
        Integer type4 = patientMapper.findallA4();
        Integer type5 = patientMapper.findallA5();
        Integer type6 = patientMapper.findallA6();
        Integer type7 = patientMapper.findallA7();
        Integer type8 = patientMapper.findallA8();
        Integer type9 = patientMapper.findallA9();

        List<BarVO> barVOList10 = new ArrayList<>();
        barVOList10.add(new BarVO(type1,"肱骨干骨折"));
        barVOList10.add(new BarVO(type2,"佝偻病"));
        barVOList10.add(new BarVO(type3,"肋骨骨折"));
        barVOList10.add(new BarVO(type4,"颈椎病"));
        barVOList10.add(new BarVO(type5,"肩周炎"));
        barVOList10.add(new BarVO(type6,"坐骨神经损伤"));
        barVOList10.add(new BarVO(type7,"脊椎骨骨髓炎"));
        barVOList10.add(new BarVO(type8,"半月板损伤"));
        barVOList10.add(new BarVO(type9,"血源性骨髓炎"));

        return barVOList10;

    }

    //全年龄段各疾病发病情况统计
    @Override
    public List<BarVO> getBarVO10() {
        Integer type1 = patientMapper.findallA11();
        Integer type2 = patientMapper.findallA12();
        Integer type3 = patientMapper.findallA13();
        Integer type4 = patientMapper.findallA14();
        Integer type5 = patientMapper.findallA15();
        Integer type6 = patientMapper.findallA16();
        Integer type7 = patientMapper.findallA17();
        Integer type8 = patientMapper.findallA18();
        Integer type9 = patientMapper.findallA19();

        List<BarVO> barVOList11 = new ArrayList<>();
        barVOList11.add(new BarVO(type1,"肱骨干骨折"));
        barVOList11.add(new BarVO(type2,"佝偻病"));
        barVOList11.add(new BarVO(type3,"肋骨骨折"));
        barVOList11.add(new BarVO(type4,"颈椎病"));
        barVOList11.add(new BarVO(type5,"肩周炎"));
        barVOList11.add(new BarVO(type6,"坐骨神经损伤"));
        barVOList11.add(new BarVO(type7,"脊椎骨骨髓炎"));
        barVOList11.add(new BarVO(type8,"半月板损伤"));
        barVOList11.add(new BarVO(type9,"血源性骨髓炎"));

        return barVOList11;
    }
}
