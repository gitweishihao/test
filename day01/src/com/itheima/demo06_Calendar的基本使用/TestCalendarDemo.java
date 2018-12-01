package com.itheima.demo06_Calendar的基本使用;

import java.util.Calendar;

/**
 * time=1534474604081,,
 * YEAR=2018,MONTH=7,(0开始)
 * DAY_OF_MONTH=17,HOUR=10,MINUTE=56,SECOND=44
 *
 */
public class TestCalendarDemo {
    public static void main(String[] args) {
        //1.获取一个日历对象
        Calendar c = Calendar.getInstance();
//        System.out.println(c);
        //2.打印
//        printlnCalendar(c);
        //3.修改
//        c.set(Calendar.YEAR,2020);
//        c.set(Calendar.DAY_OF_MONTH,30);
        //4.增加
        c.add(Calendar.YEAR,20);
        c.add(Calendar.MONTH,10);
        printlnCalendar(c);
    }

    //方法
    public static void printlnCalendar(Calendar c){
        //2.获取c中某一个成员变量(字段)
        int year = c.get(Calendar.YEAR);

        int month = c.get(Calendar.MONTH)+1;

        int day = c.get(Calendar.DAY_OF_MONTH);

        System.out.println(year+"年"+month+"月"+day+"日");
    }
}
