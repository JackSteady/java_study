package com.brushtopic.niukewang;

public class feibonaqsl {

    public static void main(String[] args) {
        feiboncci(30);

    }

    /**
     * 实现方法1
     * @param number
     * @return
     */
    public static long feibonaqishulie(long number){
        if(number == 0 || (number==1)){
            return number;
        }else {
            return feibonaqishulie(number-1)+feibonaqishulie(number-2);
        }
        //通过此方法执行
//        for (int count=0;count<=5;count++){
//            System.out.printf("Fibonacci of %d is: %d\n",count, feibonaqishulie(count));
//        }
    }

    /**
     * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。
     * n≤39
     * @param n
     * @return
     * 实现方式2
     */
    public static int feiboncci(int n){
        if(n==0 || n==1) {return n;}
        if(n>=39) {return 0;}

        int[] array = new int[n+1];
        array[0]=0;
        array[1]=1;

        for(int i=2;i<=n;i++){
            array[i]=array[i-1]+array[i-2];
        }

        //遍历结果
        for(int aaa :array){
            System.out.println(aaa);
        }
        return array[n];
    }

}
