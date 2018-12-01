package com.itheima.demo08_StringBuilder的使用;

/**
 * @Author: zhanyingpeng
 * @Date: 2018/8/17 11:53
 */
public class TestStringBuilder {
    public static void main(String[] args) {
        //1.创建一个空的StringBuilder
//        StringBuilder sb = new StringBuilder();
        StringBuilder sb = new StringBuilder("java");
        //2.追加
        sb.append("hello").append(30).append(3.14).append('K').append(true);
//        sb.append(30);
//        sb.append(3.14);
//        sb.append('k');
//        sb.append(true);
        //打印
        String s = sb.toString();
        System.out.println(s);
    }
}
