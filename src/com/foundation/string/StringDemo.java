package com.foundation.string;

public class StringDemo {
    public static void main(String[] args) {
        /**
         * 字符串时常量不可修改
         */
        char a[] = {'a','b'}; //字符数组
        String s = new String(a); //输出字符串
        System.out.println(s);
        String ss = "ab"; //等同于char a[] = {'a','b'};
        System.out.println(ss);

        //实例化一个字符串类型，实际使用中不用实例化;
        String string = new String("aaa");
        System.out.println(string);

    }
}
