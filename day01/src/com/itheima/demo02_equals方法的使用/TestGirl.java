package com.itheima.demo02_equals方法的使用;

/**
 * @Author: zhanyingpeng
 * @Date: 2018/8/17 9:16
 */
public class TestGirl {
    public static void main(String[] args) {
        //1.创建第一个
        Girl gg1 = new Girl("马尔扎哈",20);
        //2.创建第二个
        Girl gg2 = new Girl("马尔扎哈",20);

        //2.调用equals方法
        boolean b = gg1.equals(gg2);
        System.out.println(b);
    }
}
