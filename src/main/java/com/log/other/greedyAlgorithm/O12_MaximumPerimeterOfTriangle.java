package com.log.other.greedyAlgorithm;

import java.util.Arrays;

/**
 * @Author Log
 * @Date 2022/8/14 11:00
 * TODO 三角形的最大周长 --贪心算法
 *
 *  给定由一些正数（代表长度）组成的数组 nums ，返回 由其中三个长度组成的
 *  、面积不为零的三角形的最大周长 。如果不能形成任何面积不为零的三角形，返回 0。
 */
public class O12_MaximumPerimeterOfTriangle {
    public static void main(String[] args) {
        System.out.println(largestPerimeter(new int[]{3,6,2,3}));

    }

    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length-1; i>=2; i--) {
            if(nums[i-1]+nums[i-2]>nums[i]){
                return nums[i-1]+nums[i-2]+nums[i];
            }

        }

        return 0;
    }
}
