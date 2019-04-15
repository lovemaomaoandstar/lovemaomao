package com.zs.study.day.dayTwo;

import java.util.*;

public abstract class Pizza {
    public  enum Topping {HAM,MUSHROOM,ONION,PEPPER,SAUSAGE};
    final Set<Topping> toppings;
    abstract static  class Builder<T extends Builder<T>>{
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);//创建一个null的枚举set
        //EnumSet<Topping> toppings = EnumSet.allOf(Topping.class);
        public T addTopping(Topping topping){
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }
        abstract Pizza bulid();
        protected abstract T self();
    }
    Pizza(Builder<?> builder){
        toppings=builder.toppings.clone();
    }
}
