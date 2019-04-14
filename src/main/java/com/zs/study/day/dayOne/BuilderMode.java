package com.zs.study.day.dayOne;

import lombok.Data;

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

    private BuilderMode(Builder bulider){
        this.pizzaColor = bulider.pizzaColor;
        this.pizzaPrice= bulider.pizzaPrice;
        this.pizzaSize = bulider.pizzaSize;
    }
}
