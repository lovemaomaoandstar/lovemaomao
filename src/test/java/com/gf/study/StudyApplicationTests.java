package com.gf.study;

import com.zs.study.ZhangStestService;
import com.zs.study.algorithm.Algorithm;
import com.zs.study.algorithm.EuclideanAlgorithmImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


@RunWith(SpringRunner.class)
@SpringBootTest()
public class StudyApplicationTests {

    @Resource
    private ZhangStestService zhangStestimpl;
    @Resource
    private Algorithm euclideanAlgorithm;

    @Test
    public void contextLoads() {
    }
    @Test
    public void dayOne(){
        zhangStestimpl.dayOne();
    }

    @Test
    public void quick(){
        euclideanAlgorithm.mergeSort(EuclideanAlgorithmImpl.array_insert);
    }

}
