package com.log.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author Log
 * @Date 2022/8/12 10:37
 * TODO 两数之和
 * 假设只有唯一答案
 */
public class O05_SumOfTwoNumbers {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1,7,3,4,5,1,},10)));

    }
    //无序数组,利用标记位
    public static int[] solution(int[] nums,int target){
        Map<Integer,Integer> map =new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }

        return new int[0];
    }
    //升序数组，利用双指针
    public static int[] solution2(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        while (low<high){
            int sum=nums[low]+nums[high];
            if(sum==target){
                return new int[]{low,high};
            } else if (sum<target) {
                low++;
            }else {
                high--;
            }
        }

        return nums;
    }



}
