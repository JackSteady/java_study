package com.foundation.string;

/**
 * 字符串创建两种方式性能比较
 */
public class StringComparePerfommmance {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for(int i=0; i<=50000; i++){
            String a = "hello,word";
            String b = "hello,word";
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime+"ms");

        long startTime1 = System.currentTimeMillis();
        for(int i=0; i<=50000; i++){
            String c = new String("hello,word");
            String d = new String("hello,word");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println(endTime1-startTime1+"ms");

        new StringComparePerfommmance().comparePerFommance();

    }

    /**
     * 使用intern方法优化字符串后性能比较
     */
    public void comparePerFommance(){
        String variables[] = new String[50000];
        for( int i=0;i <50000;i++){
            variables[i] = "s"+i;
        }

        long startTime0 = System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            variables[i] = "hello";
        }
        long endTime0 = System.currentTimeMillis();
        System.out.println("Creation time" + " of String literals : "+ (endTime0 - startTime0)+" ms" );

        long startTime1 = System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            variables[i] = new String("hello");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Creation time of" + " String objects with 'new' key word : " + (endTime1 - startTime1) + " ms");

        long startTime2 = System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            variables[i] = new String("hello");
            variables[i] = variables[i].intern();
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("Creation time of" + " String objects with intern(): " + (endTime2 - startTime2) + " ms");

    }
}
