package com.log.array.day2022_8_9;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Log
 * @Date 2022/8/9 12:08
 * TODO 两数之和
 * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出
 * 和为目标值 target的那两个整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 */
public class L09_SumOfTwoNumbers {
    public static void main(String[] args) {

    }

    //哈希map
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> m = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (m.get(target - nums[i]) != null) {
                    return new int[]{m.get(target - nums[i]), i};
                }
                m.put(nums[i], i);
            }
            return new int[]{0, 0};
        }
    }

//      暴力法：
//    class Solution {
//        public int[] twoSum(int[] nums, int target) {
//            int l = nums.length;
//            int[] result = new int[2];
//            for (int i = 0; i < l; i++) {
//                if (target >= 0 && nums[i] <= target) {
//                    for (int j = 0; j < l; j++) {
//                        if (nums[i] + nums[j] == target&&i!=j) {
//                                result[0] = j;
//                                result[1] = i;
//                        }
//                    }
//                }else if(target < 0 && nums[i] >= target){
//                    for (int j = 0; j < l; j++) {
//                        if (nums[i] + nums[j] == target&&i!=j) {
//                            result[0] = j;
//                            result[1] = i;
//                        }
//                    }
//                }
//            }
//            return result;
//        }
//    }
}
