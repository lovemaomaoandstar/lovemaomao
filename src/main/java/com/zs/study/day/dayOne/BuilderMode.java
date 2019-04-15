package com.zs.study.day.dayOne;

import lombok.Data;

/**
* @Description:    建造者模式
* @Author:         zs
* @CreateDate:     2019/4/15 12:42
* @UpdateRemark:   修改内容
* @Version:        1.0
 *  多属性类使用构造器Model
*/
@Data
public class BuilderMode {
    private final int pizzaSize;
    private final int pizzaColor;
    private final int pizzaPrice;

    public static class Builder{
        private final int pizzaSize;
        private final int pizzaColor;
        private int pizzaPrice;
        public Builder(int pizzaSize,int pizzaColor){
            this.pizzaSize=pizzaSize;
            this.pizzaColor=pizzaColor;
        }
        public Builder setPizzaPrice(int pizzaPrice){
            this.pizzaPrice=pizzaPrice;
            return this;
        }

        public BuilderMode builder(){
            return new BuilderMode(this);
        }
    }

    private BuilderMode(Builder builder){
        this.pizzaColor = builder.pizzaColor;
        this.pizzaPrice= builder.pizzaPrice;
        this.pizzaSize = builder.pizzaSize;
    }
}
