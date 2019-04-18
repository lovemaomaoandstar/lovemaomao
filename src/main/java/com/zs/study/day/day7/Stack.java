package com.zs.study.day.day7;

/**
 * 6.避免过期的对象引用
 * 1.清楚对象引用是一种例外，不是一种规范行为，因为在变量结束声明周期时，引用就会消失
 * 2.内存卸扣的另一个常见来源就是缓存（把对象的引用放入缓存中，会经常被遗忘掉，应该用weakhashmap代替缓存）
 * weakhashmap 是一个弱引用map，其中元素的映射存在不不会阻止GC的回收
 *  3.内存泄漏的第三个常见来源就是监听器和其他回调
 *
 */
public class Stack {

}