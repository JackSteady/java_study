package com.foundation;

public class MjTq {
    public static void main(String[] args) {
        fanzhuan1("afs");
        fanzhuan2("abc");
        shuiXianHua();
    }

    public static String fanzhuan1(String str){
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.reverse();
        System.out.println(stringBuffer);
        return str;
    }

    public static  String fanzhuan2(String str){
        String str1="";
        char ch;
        for(int i=str.length()-1;i>=0;i--){
            ch=str.charAt(i);
            str1+=ch;
        }
        System.out.println(str1);
        return str;
    }

    public static void shuiXianHua(){
        int x,y,z;
        int count = 0;
        for(int i=100;i<1000;i++){
            x=i/100;
            y=i%100/10;
            z=i%100%10;
            if(x*x*x + y*y*y + z*z*z ==i){
                count++;
                System.out.println(i+" ");
            }
        }
        System.out.println("总共出现次数"+count);
    }

}
