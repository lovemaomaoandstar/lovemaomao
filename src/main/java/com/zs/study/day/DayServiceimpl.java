package com.zs.study.day;

import com.zs.study.day.dayTwo.BuilderMode;
import com.zs.study.day.dayTwo.NyPizza;
import com.zs.study.day.dayTwo.Pizza;
import org.springframework.stereotype.Service;

@Service
public class DayServiceimpl implements DayService{
    @Override
    public void dayOne(){
    }

    @Override
    public void dayTwo() {
        BuilderMode builderMode =
                new BuilderMode.Builder(2,3).setPizzaPrice(5).builder();
        System.out.println(builderMode.getPizzaColor()+""+builderMode.getPizzaPrice()+"啦啦啦");

        NyPizza pizza = new NyPizza.Builder(NyPizza.Size.SMALL)
                .addTopping(Pizza.Topping.SAUSAGE).addTopping(Pizza.Topping.MUSHROOM).bulid();
    }
}
