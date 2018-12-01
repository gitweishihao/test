package com.itheima.demo03_Date类的使用;

import java.util.Date;

/**
 * @Author: zhanyingpeng
 * @Date: 2018/8/17 9:56
 */
public class TestDate {
    public static void main(String[] args) {
        //1.创建一个Date对象,使用空参
        Date d1 = new Date();
        System.out.println(d1);//d1.toString
        //2.创建一个Date对象 使用有参(毫秒值)
//        Date d2 = new Date(1453636453839L);
//        System.out.println(d2);
        //3.获取当前系统时间 距离标准时间的毫秒值
//        Date d = new Date();
//        long time = d.getTime();
//        System.out.println(time);
    }
}
