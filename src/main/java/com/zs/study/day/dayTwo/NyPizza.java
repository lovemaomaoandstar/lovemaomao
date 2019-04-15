package com.zs.study.day.dayTwo;

import java.util.Objects;

/**
 * 子类的构造器中，返回正常的子类.
 * 与构造器相比，builder的优势在于可以有多个可变参数，且在一个作用域中
 */
public class NyPizza extends Pizza {
    public enum Size {SMALL,ENDIUM,LANGE}
    private final Size size;
    public static class Builder extends Pizza.Builder<Builder>{
        private final Size size;
        public Builder(Size size){
            this.size=Objects.requireNonNull(size);//如果为null 报空指针异常
        }

        @Override
        public NyPizza bulid() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private NyPizza(Builder builder) {
        super(builder);
        this.size=builder.size;
    }
}
