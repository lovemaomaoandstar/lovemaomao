package com.zs.study.algorithm;

public interface Algorithm {
    //欧几里得算法
    //求 a b 的最大公约数
    int getCd(int a, int b);

    //二分查找
    int binary(int[] array, int a);

    // 冒泡排序
    void bubble(int[] array, int n);

    //快速排序
    void quick(int[] array, int begin, int end);

    //插入排序
    void insertSort(int[] array, int dk);

    //希尔排序
    void shellSort(int[] array);

    //归并排序
    void mergeSort(int[] array);

    //桶排序
    void barrelSort(int[] array);

    //基数排序
    void radixSort(int[] array);

    //剪枝算法
    void pruning();

    //回朔算法
    void backMoone();

    //最短路径

    //最大子数组

    //最长公共自序算法

    //最小生成树算法
}
