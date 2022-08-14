package com.log.array;

import java.util.Arrays;

/**
 * @Author Log
 * @Date 2022/8/12 9:59
 * TODO 三个数的最大乘积
 * 在整型数组nums中，找出由三个数字组成的最大乘积，并输出这个乘积，默认乘积不越界
 * 重点考察：线性扫描
 * 分为全正全负，都选三个最大的
 * 有正有负
 */
public class O04_MaximumProductOfThreeNumbers {
    public static void main(String[] args) {
        System.out.println(sort(new int[]{-1,2,-3,-4,5,-6}));
        System.out.println(getMaxMin(new int[]{-1,2,-3,-4,5,-6}));
    }

    public static int sort(int[] nums){
        Arrays.sort(nums);
        int n=nums.length;

        return Math.max(nums[0]*nums[1]*nums[n-1],nums[n-1]*nums[n-2]*nums[n-3]);
    }
    public static int getMaxMin(int[] nums){
        int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,max3=Integer.MIN_VALUE;
        for (int x : nums) {
            if(x<min1){
                min2=min1;
                min1=x;
            }else if(x<min2){
                min2=x;
            }
            if(x>max1){
                max3=max2;
                max2=max1;
                max1=x;
            } else if (x > max2) {
                max3=max2;
                max2=x;
            } else if (x > max3) {
                max3=x;
            }
        }
        return Math.max(min1*min2*max1,max1*max2*max3);
    }

}
