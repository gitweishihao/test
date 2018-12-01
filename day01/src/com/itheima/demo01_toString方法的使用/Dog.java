package com.itheima.demo01_toString方法的使用;

/**
 * @Author: zhanyingpeng
 * @Date: 2018/8/17 8:57
 */
public class Dog/* extends Object*/{
    private String name;
    private int age;

    //重写toString方法,返回对象的信息
    //快捷键:alt+INS

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


//    @Override
//    public String toString() {
//        return this.name+"....."+this.age;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(){}

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
