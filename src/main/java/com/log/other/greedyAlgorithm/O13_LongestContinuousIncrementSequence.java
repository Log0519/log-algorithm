package com.log.other.greedyAlgorithm;

import java.util.Arrays;

/**
 * @Author Log
 * @Date 2022/8/14 11:10
 * TODO 最长连续递增数列
 * 给定一个未经排序的整数数组，找到最长且连续递增的子序列，并返回该序列的长度。
 * 序列的下标是连续的
 */
public class O13_LongestContinuousIncrementSequence {
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{1,2,3,4,5,2,3,7,8,8,9,4,2,1,2}));

    }
    public static int longestConsecutive(int[] nums) {
        int start=0;
        int max=0;
        if (nums.length == 1){
            return 1;
        }
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]<=nums[i-1]){
                start=i;
            }
            max=Math.max(max,i-start+1);
        }
        return max;
    }
}
