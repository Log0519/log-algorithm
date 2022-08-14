package com.log.array;

/**
 * @Author Log
 * @Date 2022/8/8 15:42
 * TODO 旋转数组
 * 给你一个数组，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 */
public class L03_RotateArray {
//    我的超时解题：
//    public class Solution {
//        public void rotate(int[] nums, int k) {
//            int l = nums.length;
//            for (int i = 0; i < k; i++) {
//                int temp = nums[l - 1];
//                for (int j = l; j >1; j--) {
//                    nums[j-1]=nums[j-2];
//                }
//                nums[0] = temp;
//            }
//        }
//    }
public void rotate(int[] nums, int k) {
    int length = nums.length;
    k %= length;
    reverse(nums, 0, length - 1);//先反转全部的元素
    reverse(nums, 0, k - 1);//在反转前k个元素
    reverse(nums, k, length - 1);//接着反转剩余的
}

    //把数组中从[start，end]之间的元素两两交换,也就是反转
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }

}
