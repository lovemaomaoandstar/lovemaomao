package com.zs.study.day.dayTwo;

import lombok.Data;

/**
 * 如果类的构造器或者静态工厂中具有多个参数时，BUILDER模式较好用
 * 2.遇到多个构造参数时，要考虑使用构建器
 * 1>重叠构造器在属性过多时，不好用
 * 2>JavaBeans 使用set属性的模式，使得把类做的不可变变成不可实现
 * 3>更易于阅读 模拟了具名的可选参数
 * 4>适用于类层次结构
 */
@Data
public class BuilderMode {
    /**
     * 本来属于重叠构造器
     */
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
        pizzaSize = builder.pizzaSize;
        pizzaColor=builder.pizzaColor;
        pizzaPrice=builder.pizzaPrice;
    }

}
