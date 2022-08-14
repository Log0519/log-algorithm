package com.log.array;

import java.util.Arrays;

/**
 * @Author Log
 * @Date 2022/8/11 10:10
 * TODO 寻找数组的中心下标
 * 中心下标左侧所有元素的和等于右侧所有元素的和
 * 不存在中心下标就返回-1
 * 如果有多个中心下标，就返回最左边的
 *注意：中心下标有可能出现在数组两端
 */
//双指针
public class O02_FindTheCentralSubscriptOfTheArray {
    public static int pivotIndex(int[] nums){
        int sum = Arrays.stream(nums).sum();
        int total=0;
        for (int i = 0; i < nums.length; i++) {
            total+=nums[i];
            if(total==sum){
                return i;
            }
            sum=sum-nums[i];
        }
        return -1;
    }
}
