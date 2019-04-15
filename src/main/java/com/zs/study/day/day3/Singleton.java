package com.zs.study.day.day3;

/**
 * TODO 加备注
 */

public class Singleton {
    //第一种单例模式
//    public static final Singleton singleton = new Singleton();
//    private Singleton(){}
    private static final Singleton singleton = new Singleton();
    private Singleton(){}
    public static Singleton create(){
        return singleton;
    }
}
