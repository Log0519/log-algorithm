package com.log.other.day2022_8_12;

/**
 * @Author Log
 * @Date 2022/8/12 12:47
 * TODO 求斐波拉契数列第n位的数 -三种算法
 */
public class O07_FibonacciSequence {
    public static void main(String[] args) {
        System.out.println(calculate(10));
        System.out.println(calculate2(10));
        System.out.println(iterate(10));
    }

    //暴力递归
    public static int calculate(int num){
        if (num==0){
            return 0;
        }
        if (num==1){
            return 1;
        }

        return calculate(num-1)+calculate(num-2);
    }

    //去重递归
    public static int calculate2(int num){
        int[] arr=new int[num+1];
        if (num==0){
            return 0;
        }
        if (num==1){
            return 1;
        }

        return recurse(arr,num);
    }

    private static int recurse(int[] arr,int num){
        if (num==0){
            return 0;
        }
        if (num==1){
            return 1;
        }
        if(arr[num]!=0){
            return arr[num];
        }
        arr[num]=recurse(arr,num-1)+recurse(arr,num-2);

        return arr[num];
    }

    //最优：双指针迭代
    public static int iterate(int num){
        if (num==0){
            return 0;
        }
        if (num==1){
            return 1;
        }
        int low=0;
        int high=1;
        for (int i = 2; i <= num; i++) {
            int sum=low+high;
            low=high;
            high=sum;
        }


        return high;
    }

}
