package com.itheima.demo09_包装类的第二个作用;

/**
 * @Author: zhanyingpeng
 * @Date: 2018/8/17 12:18
 */
public class TestDemo {
    public static void main(String[] args) {
        //1.服务器接收到用户的年龄
//        String age = "19";
        //2.第二年 需要修改age的值 增加1
//        age+=1;
//        age+=1;
//        System.out.println(age);
        //3.包装类的第二个作用
        //进行数据解析
//        int intAge = Integer.parseInt(age);
//        intAge++;
//        System.out.println(intAge);
        String height = "171.4";
        //打印 height 增加1厘米后数据
//        height+=1;
//        System.out.println(height);
        double doubleHeight = Double.parseDouble(height);
        doubleHeight++;
        System.out.println(doubleHeight);

        Integer.parseInt("今天真高兴");
        int i = new Integer(10);

    }
}
