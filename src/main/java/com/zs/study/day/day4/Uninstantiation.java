package com.zs.study.day.day4;

/**
 * 4.通过私有构造器来强化不可实例化的类
 */
public class Uninstantiation {
    //将构造器私有化
    //再调用时抛异常，避免在类的内部调用构造器
    private Uninstantiation(){
        throw new AssertionError();
    }
    //弊端: 不能被子类化
}
