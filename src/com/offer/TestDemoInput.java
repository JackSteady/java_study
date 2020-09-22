package com.offer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author wcj
 * @create 2020-08-31
 */
public class TestDemoInput {
    /**
     * 1.编写一个java程序在屏幕输入你好
     *
     */
    public static void hello(){
        System.out.println("你好");
    }

    /**
     * 2.编写一个java程序，用if-else语句帕努单某年份是否为闰年
     * @param  year
     * 思路：1.设计年份为一个变量 int year
     * 2.判断年份是否为空，如果为空返回参数合法
     * 3.判断年份是否可以求余，如果求余为零那么为闰年，反之为平年
     */
    public static String leapYear(int year){
        if(year!=0){
            System.out.println("参数合规进入计算");
        }else if((year%4==0&&year%100==0)||(year%400==0)){
            return year+"年是闰年";
        }
        return year+"年是平年";
    }

    /**
     * 3.编写一个java程序在屏幕上输出1!+2!+3!....的和 (1!+2!+3!+4!+5!指的是1到5的阶乘相加 ，!是阶乘运算符)
     * @param N,temp
     * 思路：用for循环遍历
     * @return
     */

    public static String forTest(int N, int temp){
        int sum=0;
        for(int i=1;i<=N;i++){
            temp = temp*i;
            sum=sum+temp;
        }
        return N+"！阶乘计算结果未:"+sum;
    }

    /**
     * 4.编写一个Java应用程序，从键盘读取用户输入两个字符串，并重载3个函数分别实现这两个字符串的拼接、
     * 整数相加和浮点数相加。要进行异常处理，对输入的不符合要求的字符串提示给用户，不能使程序崩溃。
     */
    public static void scannerDemo() {
        String str1,str2,str3,str4,str5;
        int int1,int2;
        float f1,f2;
        /*
        调用键盘；
         */
//        Scanner scanner = new Scanner(System.in);
        BufferedReader scanner=new  BufferedReader(new InputStreamReader(System.in));
        /*
        输入内容；
         */
        System.out.println("输入第一个字符串：");
//        str1 = scanner.next();
        try {
            str1 = scanner.readLine();
        System.out.println("输入第二个字符串：");
//        str2 = scanner.next();
        str2 = scanner.readLine();

        int1 = Integer.parseInt(str1);
        int2 = Integer.parseInt(str2);
        f1 = Float.parseFloat(str1);
        f2 = Float.parseFloat(str2);

        str3 = strAdd(str1,str2);
        System.out.println(str3);
        str4 = strAdd(int1,int2);
        System.out.println(str4);
        str5 = strAdd(f1,f2);
        System.out.println(str5);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static String strAdd(String str1, String str2){
        return  str1+str2;
    }
    static String strAdd(int int1, int int2){
        return  String.valueOf(int1+int2);
    }
    static String strAdd(float f1, float f2){
        return  String.valueOf(f1+f2);
    }

    /**
     * 5.输入一个字符，分别统计出其中英文字母，空格，数字和其他字符的个数
     * @param str
     * @return
     */
    public static String  tJCount(String str){
        int strCount=0;
        int spaceCount=0;
        int numCount=0;
        int otherCount=0;
        char[] ch = str.toCharArray();

        for(int i=0;i<ch.length;i++){
            if(Character.isLetter(ch[i])){
                strCount++;
            }else  if(Character.isDigit(ch[i])){
                numCount++;
            }else if(Character.isSpaceChar(ch[i])){
                spaceCount++;
            }else {
                otherCount++;
            }
        }
        System.out.println("str:"+strCount+"   num:"+numCount+"    space:"+spaceCount+"    other:"+otherCount);
        return "str:"+strCount+"num:"+numCount+"space:"+spaceCount+"other:"+otherCount;
    }

    /**
     * 6.九九乘法表
     */
    public static void jiuJiu(){
        for(int i=1;i<10;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j + "*" + i +"=" +j*i +" ");
            }
            System.out.println();
        }
    }

    /**
     * 7.求100之内的素数，并求和
     * */
    public static void suShu(){
        int sum =0;
        for(int i=2;i<=100;i++){
            int flag =0;
            for(int j=1;j<=Math.sqrt(i);j++){
                if(i % j == 0){
                    flag++;
                }
            }
            if(flag==1){
                sum+=i;
                System.out.print(sum + "  ");
                System.out.print(i+" "+"\n");
            }
        }
    }

    /**
     * 8.字符串反转
     * @param str
     */
    public static void stringReversal(String str){
        //方式1
        StringBuffer stra = new StringBuffer(str);
        stra.reverse();
        System.out.println(stra);
        //方式二
        String a ="";
        for(int i=str.length()-1;i>=0;i--){
            char c=str.charAt(i);
            a+=c;
        }
        System.out.println(a);
    }

    /**
     * 1.用过那些设计模式，手写代码
     * 2.冒泡排序，归并
     * 3.有两个有序链表，将他们组成一个有序链表。
     */



    /**
     *
     *
     */

    /**
     * main方法输出结果
     * @param args
     */
    public static void main(String[] args) {
        //2
//      System.out.println(leapYear(0));
        //3
//      System.out.println(forTest(5,1));
        //4
//      scannerDemo();
        //5
//      tJCount("asfdasdfas#$%^7fadsfas");
        //6
//     jiuJiu();
        //7
//      suShu();
        stringReversal("asdfasfas");


    }


}
