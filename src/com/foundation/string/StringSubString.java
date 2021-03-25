package com.foundation.string;

public class StringSubString {
    /**
     * 截取字符串
     * @param args
     */
    public static void main(String[] args) {
        subString("subString",2,4); //bS
        subString("abcdefg",3); //defg
    }

    /**
     * 截取字符串开始下标到结束下标，从开始下标截取，到结束下标结束，不包含结束下标；如：subString("subString",2,4); //bS
     * @param str
     * @param num1
     * @param num2
     */
    public static String subString(String str,int num1,int num2){
        String str2 = str.substring(num1,num2);
        System.out.println("截取字符串值为："+str2);
        return str2;
    }

    /**
     * 从开始下标截取，输出,包含开始下标值；如 subString("abcdefg",3); //defg
     * @param str
     * @param num1
     */
    public static String subString(String str,int num1){
        String str2 = str.substring(num1);
        System.out.println("截取字符串值为："+str2);
        return str2;
    }
}
