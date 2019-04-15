package com.zs.study.algorithm;

//算法集合

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EuclideanAlgorithmImpl implements Algorithm{
    public static int num = 0;
    public static int[] array_binary = {1,5,10,12,18,25,27,29,32,45};
    public static int[] array_bubble = {5,13,4,16,9,18,2,17,66,103,84,2};
    public static int[] array_quick = {5,13,4,16,9,18,2,17,66,103,84,2};
    public static int[] array_insert = {5,13,4,16,9,18,2,17,66,103,84,2};

    public static void sendLog(){
        log.info("遍历次数【{}】",num);
    }
    //欧几里得算法
    //求 a b 的最大公约数
    @Override
    public  int getCd(int a ,int b){
        //计算a,b最大公约数
        //a/b的余数如果不为0，则分母与余数的最大公约数即为a,b的最大公约数
        num++;
        if(b == 0){
            sendLog();
            return a;
        }
        int c = a%b;
        return getCd(b,c);
    }

    @Override //二分查找
    public  int binary(int[] array ,int a){
        int begin = 0;//数字的开头Index
        int end = array.length-1;//数组的结尾index
        int mid;//中间段位索引

        while(begin <= end){
            num++;
            mid = (end+begin)/2;//查找到中间段索引值
            if(array[mid] == a){
                sendLog();
                return mid+1;//因为索引从0开始
            }else if(array[mid] < a){
                begin = mid +1;//在后半部分进行查找
            }else {
                end = mid - 1;
            }
        }
        return -1;//当未查询到时返回-1
    }

    @Override // 冒泡排序
    public  void bubble(int[] array ,int n){
        int temp;
        for(int i=0; i<n; i++){
            for(int j=1;j<n-i;j++){
                num++;
                if(array[j-1] > array[j]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        sendLog();
    }

    @Override
    public  void quick(int[] array, int begin,int end){
        int start = begin;
        int endStart = end;
        int key = array[begin];
        int temp;
        while( endStart > start ){
            while(endStart > start && array[endStart] >= key){//当后面的值大于基准值时，继续向前检索
                num++;
                endStart--;
            }
            if(array[endStart] <= key){//当后面的值小于基准值时，进行值交换
                //此时将基准值与当前值进行交换
                temp =array[endStart];
                array[endStart] = array[start];
                array[start] = temp;
                log.info(array.toString());
            }

            while(endStart>start && array[start] <= key){
                num++;
                start++;
            }
            if(array[start] >= key){
                temp =array[endStart];
                array[endStart] = array[start];
                array[start] = temp;
                log.info(array.toString());
            }
        }
        if(start>begin) quick(array,begin,start-1);//左边序列。第一个索引位置到关键值索引-1
        if(endStart<end) quick(array,endStart+1,end);//右边序列。从关键值索引+1 到最后一个
        sendLog();
    }

    @Override
    public  void insertSort(int[] array,int dk){
        int value;
        int index;
        for(int i=dk;i<array.length;i++){
            index = i-dk;//插入的数
            value = array[i]; //当插入的数 比前一个数小 则将前一个数后移
            while(index >=0 && array[index] >  value){
                num++;
                array[index+dk] = array[index];
                index -= dk;
                log.info(array.toString());
            }
            array[index+dk]=value; //将插入的数 放在前面合适的位置
            log.info(array.toString());
        }
        sendLog();
    }

    @Override
    public  void shellSort(int[] array){
        int dk = array.length/2;
        while(dk>=1){
            insertSort(array,dk);
            dk=dk/2;
        }
    }

    @Override
    public void mergeSort(int[] array) {
        mergeSortOne(array,0,array.length-1);
        log.info(array.toString());
    }

    private void mergeSortOne(int[] array,int begin,int end){
        if(begin >= end){
            return;
        }
        int index = (end+begin)/2;//中间索引
        mergeSortOne(array,begin,index);//对左右组合进行递归
        mergeSortOne(array,index+1,end);
        //递归完之后对组合进行合并并进行排序 （最终所有的组合都剩余1个，组合时通过比大小来合并）
        merge(array,begin,index,end);
    }
    //对这个数组中begin-index 以及 index+1 end 部分的数组进行排序合并
    private void merge(int[] array,int begin,int index,int end){
        int[] arrayMode = new int[array.length];//建立一个临时数组
        int modeIndex=0;//临时数组索引
        int modeIndex1=0;
        int start = begin;
        int center = index;
        int rightStart = index+1;//右边索引字段的开端
        int stop = end;//备份三个索引字段
        //将左右两个数组中的数字取出，进行合并排序
        while(start <= center && rightStart <= stop){
            if(array[start] <= array[rightStart]){
                arrayMode[modeIndex] = array[start];
                start++;
            }else{
                arrayMode[modeIndex]=array[rightStart];
                rightStart++;
            }
            modeIndex++;
        }
        while(start<=center){
            arrayMode[modeIndex] = array[start];
            start++;
            modeIndex++;
        }

        while(rightStart<=end){
            arrayMode[modeIndex]=array[rightStart];
            rightStart++;
            modeIndex++;
        }
        //将临时数组覆盖原始数组
        while(begin <= end){
            array[begin++] = arrayMode[modeIndex1++];
        }
    };

    @Override
    public void bckerSort() {

    }

    @Override
    public void radixSort() {

    }

    @Override
    public void pruning() {

    }

    @Override
    public void backMoone() {

    }

}
