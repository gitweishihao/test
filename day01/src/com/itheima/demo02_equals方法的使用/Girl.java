package com.itheima.demo02_equals方法的使用;

import java.util.Objects;

/**
 * @Author: zhanyingpeng
 * @Date: 2018/8/17 9:15
 */
public class Girl {
    private String name;
    private int age;

    //重写equals
    //快捷键 alt+INS

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Girl girl = (Girl) o;
        return age == girl.age &&
                Objects.equals(name, girl.name);
    }


//    @Override
//    public boolean equals(Object obj) {
//       //比较两个对象的内容
//        //必须先转型
//        Girl other = (Girl)obj;
//        //this
//        //obj
//        if(this.age == other.age && this.name.equals(other.name)){
//            return true;
//        }
//        return false;
//
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

    public Girl() {
    }

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
