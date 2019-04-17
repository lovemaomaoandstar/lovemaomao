package com.zs.study.day.dayOne;

/**
 *  1.用静态工厂代替构造器
 * 好处：
 * 1>有方法名，更容易阅读
 * 2>不必调用时创建对象（也用于单例模式）
 * 3>可以返回改类型的任何子类型对象（构造器只能返回当前类）
 * 4>可以根据不同的调用返回不同的类对象
 * 5>在编写静态方法时，返回的类可以不存在（例如Object 以及子类）
 */
public class StaticFactory {
    private StaticFactory(){

    }
    public static StaticFactory create(){
        return new StaticFactory();
    }
    //对于boolean进行装载
    public static Boolean valueOf(boolean b){
        return b?Boolean.TRUE:Boolean.FALSE;
    }
}
