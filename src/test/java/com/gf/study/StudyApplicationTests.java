package com.gf.study;

import com.zs.study.ZhangStestService;
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
    @Test
    public void contextLoads() {
    }
    @Test
    public void dayOne(){
        zhangStestimpl.dayOne();
    }

}
