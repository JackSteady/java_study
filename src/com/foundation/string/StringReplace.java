package com.foundation.string;

public class StringReplace {
    public static void main(String[] args) {
        replace("abcaa","a","A");
//        replaceAll("aabddda","aa","a");
        replaceChar("aabssda","b","A");

    }

    /**
     * 用指定的文字替换序列替换该字符串中与文字目标序列匹配的每个子字符串。 替换从字符串的开头到结尾进行，
     * 例如，将字符串“ aaa”中的“ aa”替换为“ b”将得到“ ba”而不是“ ab”。
     * @param str1
     * @param oldChar
     * @param newChar
     * @return
     */
    public static String replace(String str1,String oldChar,String newChar){
        String str="" ;
        str=str1.replace(oldChar,newChar);
        System.out.println(str);
        return str;
    }

    /**
     * 返回一个字符串，该字符串是用newChar替换此字符串中所有出现的oldChar newChar 。
     * 如果在此String对象表示的字符序列中未出现字符oldChar ，则返回对此String对象的引用。
     * 否则，将返回一个String对象，该对象表示与该String对象表示的字符序列相同的字符序列，不同之处在于，每次将oldChar替换为newChar
     * @param str1
     * @param oldChar
     * @param newChar
     * @return
     */
    public static String replaceChar(String str1,String oldChar,String newChar){
        String str="" ;
        str=str1.replaceAll(oldChar,newChar);
        System.out.println(str);
        return str;
    }
}
