package com.itheima.demo01_toString方法的使用;

/**
 * @Author: zhanyingpeng
 * @Date: 2018/8/17 8:58
 */
public class TestDog {
    public static void main(String[] args){
        //1.创建Dog对象
        Dog wangcai = new Dog("旺财",18);
        String s = wangcai.toString();
        //com.itheima.demo01_toString方法的使用.Dog@282ba1e
        System.out.println(s);

        //直接打印对象名
        System.out.println(wangcai);
    }
}
