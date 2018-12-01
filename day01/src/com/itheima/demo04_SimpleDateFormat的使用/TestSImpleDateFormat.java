package com.itheima.demo04_SimpleDateFormat的使用;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: zhanyingpeng
 * @Date: 2018/8/17 10:20
 */
public class TestSImpleDateFormat {
    public static void main(String[] args) throws ParseException {
        //1.创建日期格式化对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //2.日期对象
        Date now = new Date();
       //3.使用sdf 格式化 now
//        String time = sdf.format(now);
//        System.out.println(time);
        //4.使用sdf解析
        Date parse = sdf.parse("2018-10-27 10:23:25");
        System.out.println(parse);
    }
}
