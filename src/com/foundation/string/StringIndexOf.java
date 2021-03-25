package com.foundation.string;

public class StringIndexOf {
    public static void main(String[] args) {
        lastIndexOf("abc","c");
        lastIndexOf("alkj","e");
        stringIndexOf("abca","a");
        stringIndexOf("abca","aa");

    }

    /**
     * 比较字符串最后出现的位置，通过字符长度，存在返回实际字符长度，不存在返回-1
     * @param str1
     * @param str2
     */
    public static void lastIndexOf(String str1,String str2){
        int lastIndex = str1.lastIndexOf(str2);

        if(lastIndex != -1){
            System.out.println("字符下标是："+lastIndex);
        }else{
            System.out.println("该字符串未出现："+lastIndex);
        }
    }

    /**
     * 返回第一次出现的指定子字符串在此字符串内的索引。
     * 返回的索引是为其的最小值k ：
     * @param str1
     * @param str2
     */
    public static void stringIndexOf(String str1,String str2){
        int lastIndex = str1.indexOf(str2);

        if(lastIndex != -1){
            System.out.println("字符下标是："+lastIndex);
        }else{
            System.out.println("该字符串未出现："+lastIndex);
        }
    }


}
