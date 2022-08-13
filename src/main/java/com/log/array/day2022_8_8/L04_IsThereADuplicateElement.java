package com.log.array.day2022_8_8;


import java.util.Arrays;

/**
 * @Author Log
 * @Date 2022/8/8 16:14
 * TODO 判断是否存在重复元素
 * 给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；
 * 如果数组中每个元素互不相同，返回 false 。
 */
public class L04_IsThereADuplicateElement {
    public static void main(String[] args) {

    }

//    超时解法：
//    class Solution {
//        public boolean containsDuplicate(int[] nums) {
//            boolean flag=false;
//            int l = nums.length;
//            for (int i = 0; i < l; i++) {
//                for (int j = 0; j < l; j++) {
//                    if(nums[i]==nums[j]&&i!=j){
//                        flag=true;
//                    }
//                }
//            }
//            return flag;
//
//        }
//    }

//JAVA解
class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean flag=false;
        int l = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < l-1; i++) {
            if (nums[i]==nums[i+1]){
                flag=true;
            }
        }
        return flag;
    }
}

//scala解：
//object Solution {
//        def containsDuplicate(nums: Array[Int]): Boolean = {
//                val l: Int = nums.length
//        var flag:Boolean =false;
//
//        val sorted: Array[Int] = nums.sorted
//
//        for(i <- 0 to l-2){
//            if (sorted(i)==sorted(i+1)){
//                flag=true
//            }
//        }
//        flag;
//  }
//    }

}
