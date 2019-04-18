package com.zs.study.day.day5;

import java.util.function.Supplier;

/**
 * 5.优先考虑依赖注入来引用资源
 * 在类初始化时直接注入属性
 */

//依赖注入的类
public class DependencyInjection {
    //普通注入方式
     private final InjectionProp injectionProp;//注入的属性
    //在类初始化的时候直接注入进来
//    public DependencyInjection(InjectionProp injectionProp){
//        this.injectionProp=injectionProp;
//    }

    //工厂模式进行注入
    public DependencyInjection(Supplier<?extends InjectionProp> supplier){
     this.injectionProp=supplier.get();
    }

    //Supplier<?extends InjectionProp> supplier
    //JDK8 中是一个生产工厂生产对象
    //Consumer 是一个消费者进行消费对象


}
