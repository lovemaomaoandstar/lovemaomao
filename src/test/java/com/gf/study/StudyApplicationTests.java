package com.gf.study;

import com.zs.study.algorithm.Algorithm;
import com.zs.study.algorithm.EuclideanAlgorithmImpl;
import com.zs.study.company.service.CompanyService;
import com.zs.study.day.DayService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest()
public class StudyApplicationTests {

    @Resource
    private DayService dayServiceimpl;
    @Resource
    private Algorithm euclideanAlgorithm;
    @Resource
    private CompanyService companyService;

    @Test
    public void contextLoads() {
    }
    @Test
    public void dayOne(){
        dayServiceimpl.dayOne();
    }

    @Test
    public void quick(){
        euclideanAlgorithm.mergeSort(EuclideanAlgorithmImpl.array_insert);
    }

    @Test
    public void isValidString(){
//        companyService.isValidString();
        List<Integer> list = Arrays.asList(18,17,14,9,2,5,8,4);
        Collections.sort(list);
        System.out.println(list.get(0));
    }

}
