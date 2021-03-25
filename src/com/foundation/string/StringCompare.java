package com.foundation.string;

public class StringCompare {
    public static void main(String[] args) {
        compare("ABC","AB");
    }

    /**
     * compareTO 先通过字符数组计算出字符串长度，在通过math.min方法取出字符数组最小值；再将字符类型char类型取出；
     * while循环时，先判断字符数组长度是否小于k，k代表循环次数，初始值是0；如果K<lim,进入循环比较，如果字符ASCII码不相等，则用字符A-字符B，结束
     * 如果K>=lim,直接用字符数组长度A-字符数组长度B，结束；
     *
     *
     * @param a
     * @param b
     */
    public static void compare(String a,String b){
        int c = a.compareTo(b);
        int d = a.compareToIgnoreCase(b);
    }

}
