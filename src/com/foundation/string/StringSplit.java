package com.foundation.string;

public class StringSplit {
    /**
     * 字符串分割
     *
     * 注意点：
     * 1.特殊符号需要转义， 转义符号: \\
     * 2.分割后返回时一个数组，需要遍历展示;
     * @param args
     */
    public static void main(String[] args) {
        String a = "a|b|c" ;
        String[] v = a.split("\\|");

        for (String aa :v){
            System.out.print(aa);
        }
        System.out.println();


        String s="abcdeabcdeabcde";
        char[] aaa= new char[]{'c', 'd', 'e'};
        String[] sArray1=s.split(String.valueOf(aaa));
        for(String i : sArray1){
            System.out.println(i);
        }

        String str1="我**是*****一*****个*****教*****师";
        String[] sss = str1.split("\\*");
        for(String i : sss){
            System.out.print(i);
        }

    }

    public static void splitStr(){
       String a = "abc" ;
       String[] v = a.split("a");
       for (String aa :v){
           System.out.println(aa);
       }
    }
}
