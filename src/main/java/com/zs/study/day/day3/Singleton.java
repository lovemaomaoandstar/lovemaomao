package com.zs.study.day.day3;

/**
 * 3.通过私有构造器强化singleton
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
