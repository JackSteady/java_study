package com.offer;

import java.util.Arrays;

/**
 * @author wcj
 * @create 2020-09-11
 */
public class HttpClientDemo {

    public static void getDemo() {
        int[] ints={123,2,21,1};
        for(int aa:ints){
            System.out.println(aa);
        }
    }
    public static void getdemo1(){
        int[] aaa = {123,13,11,33};
        for (int i=0;i<=aaa.length-1;i++){
            int n = aaa[i];
            System.out.println(n);
        }
        Arrays.sort(aaa);
        System.out.println(Arrays.toString(aaa));
    }

    public static void stringReversal(String str){
//        String a =
        StringBuffer stra = new StringBuffer(str);
        stra.reverse();
        System.out.println(stra);
    }



    public static void main(String[] args) {
        getDemo();
        getdemo1();
    }


}
