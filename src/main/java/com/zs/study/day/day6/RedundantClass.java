package com.zs.study.day.day6;

import com.StudyApplication;
import org.springframework.boot.SpringApplication;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 6.避免创建不必要的对象
 * String每次调用都会创建一个实例
 * 多使用静态方法（不会调用构造器，不会创建对象）
 * 优先使用基本类型而不是装箱基本类型，会造成无意识的自动装箱
 */
public class RedundantClass {

    public void test(){
        String s = new String("test");//每次调用都会创建一个实例
        String s1 = "test";//多次调用只会创建一个实例

        BigDecimal.valueOf(1);//多使用静态方法（不会调用构造器，不会创建对象）
        new BigDecimal(1);//会创建多个对象

        //适配器模式中，当适配器为后备对象提供一个可替代的接口。针对某个给定的适配器而已，不需要多个对象
        //例如
        Map map = new HashMap();
        map.keySet();//每次调用都返回相同的实例,实时获取

        //注意基本类型的自动装箱
        //下面为错误示例，在Long sum计算时进行了多次装箱创建Long对象
        Long sum = 0L;//正确写法 long sum=0l;
        for(long i=0;i<=Integer.MAX_VALUE;i++){
            sum +=i;
        }
    }

//    public static void main(String[] args) {
//        Map map = new HashMap();
//        for(int i=0;i<5;i++){
//            map.put(i,i+1);
//        }
//        Set set = map.keySet();
//        System.out.println("---------------"+set.toString());
//        map.put(10,10);
//        Set set1 = map.keySet();
//        System.out.println("---------------"+set1.toString());
//    }
}
