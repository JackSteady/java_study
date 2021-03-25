package com.foundation.string;

public class StringRegionMatches {
    /**
     * 表示将 first_str 字符串从第11个字符"M"开始和 second_str 字符串的第12个字符"M"开始逐个比较，共比较 9 对字符，由于字符串区分大小写，所以结果为false。
     *
     * 如果设置第一个参数为 true ，则表示忽略大小写区别，所以返回 true。
     * @param args
     */
    public static void main(String[] args) {
        String str1 = "aBcdE";
        String str2 = "abcde";

        boolean bl = str1.regionMatches(true,1,str2,1,1);
        System.out.println(bl);

        boolean bl1 = str1.regionMatches(1,str2,1,1);
        System.out.println(bl1);

    }
}
