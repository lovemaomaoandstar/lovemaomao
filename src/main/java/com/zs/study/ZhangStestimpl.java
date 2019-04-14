package com.zs.study;

import com.zs.study.day.dayOne.BuilderMode;
import org.springframework.stereotype.Service;

@Service
public class ZhangStestimpl implements ZhangStestService{

    public void dayOne(){
        BuilderMode builderMode =
                new BuilderMode.Builder(2,3).setPizzaPrice(5).builder();
        System.out.println(builderMode.getPizzaColor()+""+builderMode.getPizzaPrice()+"啦啦啦");
    };
}
