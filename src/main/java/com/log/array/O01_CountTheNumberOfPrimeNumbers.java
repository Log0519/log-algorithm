package com.log.array;

/**
 * @Author Log
 * @Date 2022/8/10 20:40
 * TODO 统计素数个数  --采用埃筛法
 */
//找出一个素数，就可以排除他的1、2、3...倍，可以排除很多个数,给这些数打标记
public class O01_CountTheNumberOfPrimeNumbers {
    public static void main(String[] args) {
        System.out.println(fun(100));
    }

//    private static boolean isPrime(int x) {
//        for (int i = 2; i * i <= x; i++) {
//            if (x % i == 0) {
//                return false;
//            }
//        }
//        return true;
  //  }
    public static int fun(int n) {
        boolean[] isssPrime = new boolean[n];//默认false,代表素数
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!isssPrime[i]) {
                count++;
                for (int j = 2 * i; j < n; j += i) {//j就是合数的标记位
                    isssPrime[j] = true;
                }
            }
        }

        return count;
    }

}
