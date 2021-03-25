package com.foundation.string;

public class StringCompare {
    public static void main(String[] args) {
        compare("AB","AB");   //0
        compare("vc","cv");  //v-c ASCII码
        compare("abc","ab"); //1
        compare("ab","abc"); //-1

    }

    /**
     * 区分大小写字符串比较方法
     * @param str1
     * @param str2
     */
    public static void compare(String str1,String str2){
        /**
         * 字符串比较返回，int类型；
         *    int len1 = value.length;
         *    int len2 = anotherString.value.length;
         *
         * 比较规则4种情况：
         * 1.如果比较字符串结果相等，比较字符长度=0；如：compare("AB","AB");   //0
         * 2.如果比较字符串不一致，从第一个不相同字符开始计算ascii码相差值，比较ASCII码值；如：compare("vc","cv");  //v-c ASCII码
         * 3.如果比较字符串在参数字符串之前，则结果为负 如：compare("ab","abc"); //-1
         * 4.如果比较字符串跟随自变量字符串，则结果为正整数。如：compare("abc","ab"); //1
         */
        int c = str1.compareTo(str2);
        System.out.println(c);


    }

}
