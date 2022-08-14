package com.log.array;

import java.util.Arrays;
import java.util.OptionalInt;

/**
 * @Author Log
 * @Date 2022/8/14 9:26
 * TODO 子数组的最大平均数
 * 给一个整数数组，找出平均数最大且长度为k的下标连续的子数组，并输出该最大平均数
 * 滑动窗口算法(双指针的特例，两个指针间距离不变)
 */
public class O10_MaximumAverageNumberOfSubArrays {
    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{1,12,-5,-6,50,3,6,2,3},7));
    }

    //滑动窗口
    private static double findMaxAverage(int[] nums, int k) {
        int sum=0;
        int l = nums.length;
        //先统计第一个窗口
        for (int i = 0; i < k; i++) {
            sum+=nums[i];
        }
        int max=sum;
        for (int i = k; i <l; i++) {
            sum=sum-nums[i-k]+nums[i];
             max = Math.max(sum, max);
        }
        return 1.0*max/k;
    }

    //双指针,错误做法，没有处理好求和
//    private static double findMaxAverage(int[] nums, int k) {
//
//        int low=0;
//        int fast=k-1;
//        int l = nums.length;
//        int n=l-k+1;
//        if(l<=k){
//            int sum = Arrays.stream(nums).sum();
//            return sum;
//        }
//        double[] avgs = new double[n];
//        while (fast<=l-1){
//            avgs[low]=((double) nums[low]+(double) nums[low+1]+(double) nums[low+2]+(double) nums[fast])/4;
//            low++;
//            fast++;
//        }
//        Arrays.sort(avgs);
//        double result = avgs[n-1];
//        return result;
//    }


}
