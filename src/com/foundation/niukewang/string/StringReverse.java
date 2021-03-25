package com.foundation.niukewang.string;

/**
 * 字符串反转
 */
public class StringReverse {

    public static void main(String[] args) {
        String a = new StringReverse().reverse("abc");
        String b = new StringReverse().reverse1("abc");
        System.out.println(a);
        System.out.println(b);
    }

    /**
     * 字符串反转编写
     * @param str
     * @return
     */
    public String reverse(String str){

        char[] chars = str.toCharArray();
        char temp;
        for(int i=0;i<chars.length/2;i++){
            temp=chars[i];
            chars[i]=chars[chars.length-1-i];
            chars[chars.length-1-i]=temp;
        }

        return new String(chars);
    }

    /**
     * 字符串反转调用StringBuffer类
     * @param str1
     * @return
     */
    public String reverse1(String str1){
        return new StringBuffer(str1).reverse().toString();
    }
}
