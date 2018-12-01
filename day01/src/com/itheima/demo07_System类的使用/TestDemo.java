package com.itheima.demo07_System类的使用;

import java.util.Arrays;

/**
 * @Author: zhanyingpeng
 * @Date: 2018/8/17 11:27
 */
public class TestDemo {
    public static void main(String[] args) {
//        将src数组中前3个元素，复制到dest数组的前3个位置上,要求如下
//
//        复制元素前：src数组元素[1,2,3,4,5]，
//
//        dest数组元素[6,7,8,9,10]
//
//        复制元素后：src数组元素[1,2,3,4,5]，
//
//        dest数组元素[1,2,3,9,10]
        int[] src = {1,2,3,4,5};
        int[] dest = {6,7,8,9,10};
        //赋值
        System.arraycopy(src,0,dest,0,3);

        System.out.println(Arrays.toString(dest));

        //计算程序的运行时间
        long start = System.currentTimeMillis();
        //循环,其他代码
        int sum = 0;
        for (int i = 0; i < 100000000; i++) {
            sum+=i;
        }
        long end = System.currentTimeMillis();
        //打印差值
        System.out.println(end-start);


    }
}
