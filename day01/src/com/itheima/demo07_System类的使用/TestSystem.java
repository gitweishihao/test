package com.itheima.demo07_System类的使用;

import java.util.Arrays;
import java.util.Date;

/**
 * @Author: zhanyingpeng
 * @Date: 2018/8/17 11:18
 */
public class TestSystem {
    public static void main(String[] args) {
        //1.获取当前系统时间的毫秒值
//        long time1 = new Date().getTime();
//        long time2 = System.currentTimeMillis();
//
//        System.out.println(time1);
//        System.out.println(time2);
        //2.赋值数组
        int[] nums1 = {1,2,3,4,5,6};
        int[] nums2 = new int[6];
        //需要: 把nums1的所有元素赋值到 nums2数组中
        System.arraycopy(nums1,0,nums2,1,4);

        //打印
        System.out.println(Arrays.toString(nums2));
    }
}
