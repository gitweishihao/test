package com.itheima.demo05_日期小练习;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @Author: zhanyingpeng
 * @Date: 2018/8/17 10:44
 */
public class TestDemo {
    public static void main(String[] args) throws ParseException {
        //1.获取用户输入的出生日期
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的出生日期,格式:xxxx-xx-xx");
        String time = sc.nextLine();
        //解析
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = sdf.parse(time);

        //2.获取现在时间
        Date now = new Date();

        //3.获取毫秒值的差
        long days = now.getTime() - birthday.getTime();
        //4.计算多少天
        long day = days / 1000 / 60 / 60 / 24;
        System.out.println("您一共活了"+day+"天");
    }
}
